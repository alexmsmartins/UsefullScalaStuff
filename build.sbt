organization := "CNC"

name := "UsefullScalaStuff"

version := "0.1"

scalaVersion := "2.10.2"

//JRebel configuration
seq(jrebelSettings: _*)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.3" % "test",
  "org.slf4j" % "slf4j-api" % "1.6.4",
  "ch.qos.logback" % "logback-classic" % "0.9.29" % "test" 
)

scalacOptions in Test ++= Seq("-Yrangepos")

// Read here for optional dependencies:
// http://etorreborre.github.io/specs2/guide/org.specs2.guide.Runners.html#Dependencies
resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo) 
