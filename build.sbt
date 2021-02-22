import Dependencies._
import NativePackagerHelper._
import com.typesafe.sbt.packager.MappingsHelper.directory
import com.typesafe.sbt.packager.docker._
import sbt.Keys.libraryDependencies
import scala.sys.process.Process

import com.waioeka.sbt.Plugin

ThisBuild / organization          := "lu.vdl"
ThisBuild / organizationName      := "cvl"
ThisBuild / version               := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion          := "2.13.3"
ThisBuild / scalacOptions         ++= Seq(
  "-feature",
  "-unchecked",
  "-deprecation",
  "-explaintypes",
  "-encoding", "UTF-8",
  "-Ywarn-unused",
  "-Ymacro-annotations",
  "-Yrangepos",
  "-deprecation",
  "-language:_"
)

enablePlugins(CucumberPlugin)
CucumberPlugin.glues := List("projet1/steps", "projet2/steps")
CucumberPlugin.monochrome := false
CucumberPlugin.mainClass := "io.cucumber.core.cli.Main"
CucumberPlugin.plugin := List(Plugin.HtmlPlugin(new File("target/reports/cucumber.html")),Plugin.JsonPlugin(new File("target/reports/cucumber.json")))

lazy val root = (project in file("."))
  .settings(
  testFrameworks += new TestFramework("munit.Framework"),
  libraryDependencies ++= Seq(
    Libraries.cucumberCore,
    Libraries.cucumber,
    Libraries.cucumberJVM,
    Libraries.cucumberJunit,
    Libraries.munit
    )
  ).dependsOn(project1 % "compile->compile;test->test", project2  % "compile->compile;test->test")

lazy val project1 = (project in file("projet1"))
  .settings(
    name := "BddPoc1",
    testFrameworks += new TestFramework("munit.Framework"),
    libraryDependencies ++= Seq(
      compilerPlugin(Libraries.kindProjector cross CrossVersion.full),
      compilerPlugin(Libraries.betterMonadicFor),
      Libraries.cats,
      Libraries.catsEffect,
      Libraries.cucumberCore,
      Libraries.cucumber,
      Libraries.cucumberJVM,
      Libraries.cucumberJunit,
      Libraries.munit
    )
  )



lazy val project2 = (project in file("projet2"))
  .settings(
    name := "BddPoc2",
    testFrameworks += new TestFramework("munit.Framework"),
    libraryDependencies ++= Seq(
      compilerPlugin(Libraries.kindProjector cross CrossVersion.full),
      compilerPlugin(Libraries.betterMonadicFor),
      Libraries.cats,
      Libraries.catsEffect,
      Libraries.cucumberCore,
      Libraries.cucumber,
      Libraries.cucumberJVM,
      Libraries.cucumberJunit,
      Libraries.munit
    )
  )