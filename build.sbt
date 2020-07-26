name := "reactive-web-application"

version := "0.1"

val akkaVersion = "2.6.8"
//val akkaVersion = "2.5.4"

scalaVersion := "2.13.3"

resolvers += "Lightbend Repository" at "https://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-remote" % akkaVersion
)