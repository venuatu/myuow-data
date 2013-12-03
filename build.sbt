name := "myuow-data"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.mockito" % "mockito-all" % "1.9.5",
  "org.xerial" % "sqlite-jdbc" % "3.8.0-SNAPSHOT",
  "org.jsoup" % "jsoup" % "1.7.3"
)
 
resolvers += "SQLite-JDBC Repository" at "https://oss.sonatype.org/content/repositories/snapshots" 

play.Project.playScalaSettings
