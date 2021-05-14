name := "fs2-demo"
scalaVersion := "2.13.5"

scalacOptions  ++=  Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-Xlint:unused",
  "-language:higherKinds"
)

ThisBuild / libraryDependencies  ++=  Seq(
  "co.fs2" %% "fs2-core" % "2.5.3",
  "org.scalatest"  %% "scalatest" % "3.2.7" % Test
)
