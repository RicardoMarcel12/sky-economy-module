
name := "sky-economy-module"

version := "0.1"

scalaVersion := "2.12.7"

lazy val akkaVersion = "2.5.13"
lazy val cassandraVersion = "0.91"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence" % akkaVersion,
  // Cassandra
  "com.typesafe.akka" %% "akka-persistence-cassandra" % cassandraVersion,
  "com.typesafe.akka" %% "akka-persistence-cassandra-launcher" % cassandraVersion % Test

)