import sbt._

class UsefullScalaStuff(info: ProjectInfo) extends DefaultProject(info)
{
  lazy val hi = task { println("Hello World"); None }
  //def compileOptions: Seq[compileOptions] = Deprecation :: Nil

  val mavenLocal = "Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository/"
}