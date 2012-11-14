


// ***************** This works, but only for published Scala versions:

//libraryDependencies in ThisBuild <+= scalaVersion("org.scala-lang" % "scala-compiler" % _)

//libraryDependencies in (slickTestkitProject, config("macro")) <+= scalaVersion("org.scala-lang" % "scala-compiler" % _)







//libraryDependencies in ThisBuild <+= scalaVersion("org.scala-lang" % "scala-compiler" % _ % "macro")

//unmanagedJars in ThisBuild <<= (scalaHome in ThisBuild) { sh =>
// //println("------- "+sh)
// Seq(Attributed.blank(file("C:/Users/szeiger/code/scala/build/pack"+"/scala-compiler.jar")))
//}

//unmanagedJars in Global := Nil

//for(conf <- Seq(slickProject, slickTestkitProject))
//  yield unmanagedJars in conf <++= scalaInstance.map( _.jars)

//unmanagedJars in (slickTestkitProject, config("macro")) <++= scalaInstance.map( _.jars)

//unmanagedJars in ThisBuild <++= scalaInstance.map( _.jars)


//for(conf <- Seq(slickProject, slickTestkitProject))
//  yield unmanagedJars in conf ++= Seq(
//    Attributed.blank(file("C:/Users/szeiger/code/scala/build/pack/scala-compiler.jar")),
//    Attributed.blank(file("C:/Users/szeiger/code/scala/build/pack/scala-reflect.jar"))
//  )

//unmanagedJars in (slickTestkitProject, config("macro")) ++= Seq(
//  Attributed.blank(file("C:/Users/szeiger/code/scala/build/pack/scala-compiler.jar")),
//  Attributed.blank(file("C:/Users/szeiger/code/scala/build/pack/scala-reflect.jar"))
//)


//libraryDependencies in ThisBuild <+= scalaVersion("org.scala-lang" % "scala-compiler" % _)

//libraryDependencies in (slickTestkitProject, config("macro")) <+= scalaVersion("org.scala-lang" % "scala-compiler" % _)
