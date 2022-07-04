import sbt._

object Dependencies {

  val akkaVersion         = "2.6.19"
  val akkaHttpVersion     = "10.2.9"
  val scalaLoggingVersion = "3.9.5"
  val logbackVersion      = "1.2.11"
  val sprayJsonVersion    = "1.3.6"
  val pureConfigVersion   = "0.17.1"
  val tapirVersion        = "1.0.1"

  val documentationDependencies: Seq[ModuleID] = Seq(
    "com.softwaremill.sttp.tapir" %% "tapir-swagger-ui-bundle" % tapirVersion
  )

  val configDependencies: Seq[ModuleID] = Seq(
    "com.github.pureconfig" %% "pureconfig" % pureConfigVersion
  )

  val apiDependencies: Seq[ModuleID] = Seq(
    "com.typesafe.akka"          %% "akka-actor"           % akkaVersion,
    "com.typesafe.akka"          %% "akka-stream"          % akkaVersion,
    "com.typesafe.akka"          %% "akka-http"            % akkaHttpVersion,
    "com.typesafe.scala-logging" %% "scala-logging"        % scalaLoggingVersion,
    "ch.qos.logback"              % "logback-classic"      % logbackVersion,
    "com.typesafe.akka"          %% "akka-http-spray-json" % akkaHttpVersion,
    "com.typesafe.akka"          %% "akka-http-testkit"    % akkaHttpVersion,
    "io.spray"                   %% "spray-json"           % sprayJsonVersion
  )
}
