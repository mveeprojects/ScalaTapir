import Dependencies._

name := "ScalaTapir"

version := "0.1"

organization := "mveeprojects"

ThisBuild / scalaVersion := "2.13.8"

libraryDependencies ++= (
  apiDependencies ++
    configDependencies ++
    documentationDependencies
)
