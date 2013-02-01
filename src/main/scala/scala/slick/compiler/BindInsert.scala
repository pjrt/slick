package scala.slick.compiler

import scala.slick.ast._
import scala.slick.SlickException
import Util._

/** Special compiler phase for insert operations. This gets run before
  * inlining to create a properly bound table ref. */
class BindInsert extends Phase {
  val name = "bindInsert"

  /** Run the phase */
  def apply(state: CompilerState) = state.map { tree =>
    val genSym = memoized[TableNode, AnonSymbol](_ => _ => new AnonSymbol)
    val proj = tree.replaceKeepType { case t: TableNode => Ref(genSym(t)) }
    if(genSym.state.size > 1)
      throw new SlickException("Cannot insert into more than one table (found tables "+
        genSym.state.keys.map(_.tableName).mkString(", ")+")")

    if(genSym.state.isEmpty) tree
    else {
      val (from, gen) = genSym.state.head
      proj match {
        case LetDynamic(defs, in) => LetDynamic(defs, Bind(gen, from, Pure(in)))
        case n => Bind(gen, from, Pure(n))
      }
    }
  }
}
