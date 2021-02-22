# How to add cucumber to sbt 

## add sbt cucumber plugin to plugins
```sbt
addSbtPlugin("com.waioeka.sbt"           % "cucumber-plugin"          % "0.2.1")
```

## add dependencies
```scala
object Versions {
    val munit               = "0.7.20"
    val cucumber            = "6.9.0"
}

object Libraries {
    val munit           = "org.scalameta"       %% "munit"              % Versions.munit          % Test
    val cucumberCore    = "io.cucumber"         % "cucumber-core"       % Versions.cucumber       % Test
    val cucumber        = "io.cucumber"         %% "cucumber-scala"     % Versions.cucumber       % Test
    val cucumberJVM     = "io.cucumber"         % "cucumber-jvm"        % Versions.cucumber       % Test
    val cucumberJunit   = "io.cucumber"         % "cucumber-junit"      % Versions.cucumber       % Test
}
```


enable plugin
```sbt

import com.waioeka.sbt.Plugin

enablePlugins(CucumberPlugin)
CucumberPlugin.monochrome := false
CucumberPlugin.mainClass := "io.cucumber.core.cli.Main"
CucumberPlugin.plugin := List(Plugin.HtmlPlugin(new File("target/reports/cucumber.html")),Plugin.JsonPlugin(new File("target/reports/cucumber.json")))
```

set all test step packages to list 
```sbt
CucumberPlugin.glues := List("projet1/steps", "projet2/steps")
```

## add settings to root projet and depend on subprojects
```sbt
  testFrameworks += new TestFramework("munit.Framework"),
  libraryDependencies ++= Seq(
    Libraries.cucumberCore,
    Libraries.cucumber,
    Libraries.cucumberJVM,
    Libraries.cucumberJunit,
    Libraries.munit
    )
  ).dependsOn(project1 % "compile->compile;test->test", project2  % "compile->compile;test->test")
  ```
 
## Add to any subproject 
* Test framework 
* cucumber libraries

## Add tests 
add gherkin files to `/src/test/resources/features`

and step files to `/src/test/scala/package.folders/Steps.scala`

DONT FORGET TO ADD THE PACKAGE TO THE BUILD SBT GLUE PARAMETER


## run cucumber
```
sbt cucumber
```
