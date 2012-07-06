name := "Salat mock bug"

version := "1.0"

scalaVersion := "2.9.1"


resolvers += "repo.novus release" at "http://repo.novus.com/releases/"


libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"

libraryDependencies += "org.mockito" % "mockito-all" % "1.9.0" % "test"

libraryDependencies += "com.novus" %% "salat-core" % "0.0.8"
