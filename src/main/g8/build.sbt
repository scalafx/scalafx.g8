name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.7"

libraryDependencies ++= Seq(
  "org.scalafx"   %% "scalafx"   % "8.0.181-R13",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test" //http://www.scalatest.org/download
)

shellPrompt := { _ => System.getProperty("user.name") + "> " }

// set the main class for the main 'run' task
// change Compile to Test to set it for 'test:run'
mainClass in (Compile, run) := Some("$package$.ScalaFXHelloWorld")

// Fork a new JVM for 'run' and 'test:run' to avoid JavaFX double initialization problems
fork := true