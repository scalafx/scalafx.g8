name         := "$name$"
organization := "$organization$"
version      := "$version$"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.scalafx"   %% "scalafx"   % "16.0.0-R25",
  "org.scalatest" %% "scalatest" % "3.2.10" % "test" //http://www.scalatest.org/download
)
libraryDependencies ++= javaFXModules

// Add JavaFX dependencies
lazy val javaFXModules = {
  // Determine OS version of JavaFX binaries
  lazy val osName = System.getProperty("os.name") match {
    case n if n.startsWith("Linux")   => "linux"
    case n if n.startsWith("Mac")     => "mac"
    case n if n.startsWith("Windows") => "win"
    case _                            => throw new Exception("Unknown platform!")
  }
  Seq("base", "controls", "fxml", "graphics", "media", "swing", "web").map( m=>
    "org.openjfx" % s"javafx-\$m" % "16" classifier osName
  )
}

// Fork a new JVM for 'run' and 'test:run' to avoid JavaFX double initialization problems
fork := true

// set the main class for the main 'run' task
// change Compile to Test to set it for 'test:run'
Compile / run / mainClass := Some("$package$.ScalaFXHelloWorld")