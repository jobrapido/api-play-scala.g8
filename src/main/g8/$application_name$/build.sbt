import com.typesafe.config.ConfigFactory

name := """$application_name$"""

version := "1.0"

packageName in Universal := name.value

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
 "com.typesafe.akka"           %   "akka-contrib_2.11"   % "2.4.7"   % Compile,
 "org.scalatestplus.play"      %%  "scalatestplus-play"  % "1.5.1"   % Test,
 "com.typesafe.akka"           %   "akka-testkit_2.11"   % "2.4.6"   % Test,
 "org.mockito"                 %   "mockito-all"         % "1.10.19" % Test
)
