resolvers += Classpaths.typesafeResolver

/* common IDE plugins */

// eclipse @ https://github.com/typesafehub/sbteclipse
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.3.0")

// IDEA @ https://github.com/mpeltonen/sbt-idea
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")

// netbeans
//addSbtPlugin("org.netbeans.nbsbt" % "nbsbt-plugin" % "1.0.2")

// assembly plugin to package and run the app @ https://github.com/sbt/sbt-assembly
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.9.2")

resolvers += "sbt-assembly-resolver-0" at "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"
