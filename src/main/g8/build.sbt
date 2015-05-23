name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.scalafx"   %% "scalafx"   % "8.0.40-R8",
  "org.scalatest" %% "scalatest" % "2.2.4"     % "test" //http://www.scalatest.org/download
)

shellPrompt := { state => System.getProperty("user.name") + "> " }

// set the main class for the main 'run' task
// change Compile to Test to set it for 'test:run'
mainClass in (Compile, run) := Some("$package$.HelloScalaFX")
