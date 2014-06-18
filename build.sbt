import play.PlayScala

name := "myuow-data"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.1"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  cache,
  ws,
  "org.scala-lang.modules" %% "scala-async" % "0.9.1",
  "org.mockito" % "mockito-all" % "1.9.5",
  "org.jsoup" % "jsoup" % "1.7.3"
)
 
resolvers += "SQLite-JDBC Repository" at "https://oss.sonatype.org/content/repositories/snapshots" 
