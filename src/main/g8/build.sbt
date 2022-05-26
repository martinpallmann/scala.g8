import sbt._

ThisBuild / organization := "$organization$"
ThisBuild / scalaVersion := "3.1.0"

lazy val root = (project in file(".")).
  settings(
    name := "$name$",
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29"
    ).map(_ % Test)
  )
