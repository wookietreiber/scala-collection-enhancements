scalaVersion in ThisBuild := "2.11.7"

configs(IntegrationTest)

Defaults.itSettings

libraryDependencies += "com.storm-enroute" %% "scalameter" % "0.6" % "it"

logBuffered in IntegrationTest := false

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

parallelExecution in IntegrationTest := false
