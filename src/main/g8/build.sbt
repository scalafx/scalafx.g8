name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "org.scalafx"   %% "scalafx"   % "14-R19",
  "org.scalatest" %% "scalatest" % "3.1.2" % "test" //http://www.scalatest.org/download
)

// Determine OS version of JavaFX binaries
lazy val osName = System.getProperty("os.name") match {
  case n if n.startsWith("Linux") => "linux"
  case n if n.startsWith("Mac") => "mac"
  case n if n.startsWith("Windows") => "win"
  case _ => throw new Exception("Unknown platform!")
}

// Add JavaFX dependencies
lazy val javaFXModules = Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
libraryDependencies ++= javaFXModules.map( m=>
  "org.openjfx" % s"javafx-\$m" % "14.0.1" classifier osName
)

// Fork a new JVM for 'run' and 'test:run' to avoid JavaFX double initialization problems
fork := true

// set the main class for the main 'run' task
// change Compile to Test to set it for 'test:run'
Compile / run / mainClass := Some("$package$.ScalaFXHelloWorld")