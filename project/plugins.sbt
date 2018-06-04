
resolvers += Resolver.defaultLocal
resolvers += Resolver.publishMavenLocal

resolvers += Opts.resolver.sonatypeReleases
resolvers += Opts.resolver.sonatypeSnapshots

resolvers += Resolver.typesafeRepo("releases")

val coursier = "1.1.0-M3"
addSbtPlugin("io.get-coursier" % "sbt-coursier" % coursier)

val izumi_version = "0.5.13"
addSbtPlugin("com.github.pshirshov.izumi.r2" % "sbt-idealingua" % izumi_version)
addSbtPlugin("com.github.pshirshov.izumi.r2" % "sbt-izumi" % izumi_version)
addSbtPlugin("com.github.pshirshov.izumi.r2" % "sbt-izumi-deps" % izumi_version)

libraryDependencies -= "org.webjars.npm" % "typescript" % "2.6.2"
libraryDependencies += "org.webjars.npm" % "typescript" % "2.8.3"

