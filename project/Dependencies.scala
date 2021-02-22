import sbt._
import Keys._

object Dependencies {

  object Versions {

    val cats                = "2.2.0"
    val catsEffect          = "2.2.0"

    val circe               = "0.13.0"
    val ciris               = "1.2.1"

    val enumeratum          = "1.6.0"

    val refined             = "0.9.17"
    val newtype             = "0.4.3"

    val http4s              = "0.21.8"

    val doobie              = "0.9.0"
    val mysql               = "8.0.22"
    val postgres            = "42.2.12"

    val log4cats            = "1.0.1"
    val logback             = "1.2.3"

    val betterMonadicFor    = "0.3.1"
    val kindProjector       = "0.11.0"

    val fuuid               = "0.4.0"

    val flyway              = "7.2.1"
    val keymaker            = "1.0.5"

    val munit               = "0.7.20"
    val scalaCheck          = "1.15.2"
    val scalactic           = "3.2.0"
    val scalaTestPlus       = "3.2.2.0"
    val cucumber            = "6.9.0"

  }

  object Libraries {

    def circe(artifact: String): ModuleID  = "io.circe"   %% artifact % Versions.circe
    def ciris(artifact: String): ModuleID  = "is.cir"     %% artifact % Versions.ciris
    def http4s(artifact: String): ModuleID = "org.http4s" %% artifact % Versions.http4s
    def doobie(artifact: String): ModuleID = "org.tpolecat" %% artifact % Versions.doobie
    def fuuid(artifact: String): ModuleID  = "io.chrisdavenport" %% artifact % Versions.fuuid
    def enumeratum(artifact: String): ModuleID  = "com.beachape" %% artifact % Versions.enumeratum


    val cats            = "org.typelevel"       %% "cats-core"          % Versions.cats
    val catsEffect      = "org.typelevel"       %% "cats-effect"        % Versions.catsEffect

    val circeCore       = circe("circe-core")
    val circeGeneric    = circe("circe-generic")
    val circeParser     = circe("circe-parser")
    val circeRefined    = circe("circe-refined")

    val enumeratumCirce = enumeratum("enumeratum-circe")
    val enumeratumDoobie= enumeratum("enumeratum-doobie")

    val cirisCore       = ciris("ciris")
    val cirisEnum       = ciris("ciris-enumeratum")
    val cirisRefined    = ciris("ciris-refined")
    val keymaker        = "lu.vdl"              %% "keymakerlibrary"    % Versions.keymaker

    val http4sDsl       = http4s("http4s-dsl")
    val http4sServer    = http4s("http4s-blaze-server")
    val http4sCirce     = http4s("http4s-circe")
    val http4sClient    = http4s("http4s-blaze-client")

    val doobieCore      = doobie("doobie-core")
    val doobieHikari    = doobie("doobie-hikari")
    val doobieRefined   = doobie("doobie-refined")
    val doobiePostgres  = doobie("doobie-postgres")
    val postgresJDBC    = "org.postgresql"          % "postgresql"      % Versions.postgres
    val flyway          = "org.flywaydb"            % "flyway-core"     % Versions.flyway

    val fuuidCore       = fuuid("fuuid")
    val fuuidDoobie     = fuuid("fuuid-doobie")
    val fuuidCirce      = fuuid("fuuid-circe")
    val fuuidHttp4s     = fuuid("fuuid-http4s")

    val log4cats        = "io.chrisdavenport"   %% "log4cats-slf4j"     % Versions.log4cats
    val newtype         = "io.estatico"         %% "newtype"            % Versions.newtype

    val logback         = "ch.qos.logback"      % "logback-classic"     % Versions.logback

    // compiler plugins
    val betterMonadicFor = "com.olegpy"         %% "better-monadic-for" % Versions.betterMonadicFor
    val kindProjector    = "org.typelevel"      % "kind-projector"      % Versions.kindProjector

    // testing
    val munit           = "org.scalameta"       %% "munit"              % Versions.munit          % Test
    val scalaCheck      = "org.scalacheck"      %% "scalacheck"         % Versions.scalaCheck     % Test
    val scalactic       = "org.scalactic"       %% "scalactic"          % Versions.scalactic      % Test
    val scalaTestPlus   = "org.scalatestplus"   %% "scalacheck-1-14"    % Versions.scalaTestPlus  % Test
    val refinedScCheck  = "eu.timepit"          %% "refined-scalacheck" % Versions.refined        % Test
    val cucumberCore    = "io.cucumber"         % "cucumber-core"       % Versions.cucumber       % Test
    val cucumber        = "io.cucumber"         %% "cucumber-scala"     % Versions.cucumber       % Test
    val cucumberJVM     = "io.cucumber"         % "cucumber-jvm"        % Versions.cucumber       % Test
    val cucumberJunit   = "io.cucumber"         % "cucumber-junit"      % Versions.cucumber       % Test
  }
}