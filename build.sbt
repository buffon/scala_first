name := "scala_first"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq (
  "org.apache.spark" %% "spark-core" % "2.0.1",
  "org.apache.spark" %% "spark-streaming" % "2.0.1",
  "org.apache.spark" % "spark-streaming-kafka-0-10-assembly_2.11" % "2.1.0"
)