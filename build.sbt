name := "sbt-dependency-bug"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "org.eclipse.mylyn.github" % "org.eclipse.egit.github.core" % "3.4.0.201406110918-r"
)

//resolvers += "Eclipse egit Repository" at "http://repo.eclipse.org/content/repositories/egit-releases/"//

resolvers += "Eclipse Foundation Releases" at "https://repo.eclipse.org/content/repositories/releases/"

//resolvers += "Eclipse Foundation Snapshots" at "https://repo.eclipse.org/content/repositories/snapshots/"//
