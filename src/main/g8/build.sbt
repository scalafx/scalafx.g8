name         := "$name$"
organization := "$organization$"
version      := "$version$"

scalaVersion := "2.13.16"

libraryDependencies ++= Seq(
  "org.scalafx"   %% "scalafx"   % "24.0.1-R35",
  "org.scalatest" %% "scalatest" % "3.2.19" % "test"
)

// Fork a new JVM for 'run' and 'test:run' to avoid JavaFX double initialization problems
fork := true

// set the main class for the main 'run' task
// change Compile to Test to set it for 'test:run'
Compile / run / mainClass := Some("$package$.ScalaFXHelloWorld")