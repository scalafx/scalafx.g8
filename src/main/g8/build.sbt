name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalafx"   %% "scalafx"   % "8.0.60-R9",
  "org.scalatest" %% "scalatest" % "2.2.5"     % "test" //http://www.scalatest.org/download
)

shellPrompt := { state => System.getProperty("user.name") + "> " }

// set the main class for the main 'run' task
// change Compile to Test to set it for 'test:run'
mainClass in (Compile, run) := Some("$package$.ScalaFXHelloWorld")
