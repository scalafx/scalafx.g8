resolvers += Classpaths.typesafeResolver

// common IDE plugins

// eclipse 
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.2")

// IDEA
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.2.0")

// netbeans
addSbtPlugin("org.netbeans.nbsbt" % "nbsbt-plugin" % "1.0.2")

// assembly plugin to package and run the app
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.8.6")

resolvers += "sbt-assembly-resolver-0" at "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"


