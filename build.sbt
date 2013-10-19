organization := "io.github.reggert"

name := "sbt-osgi"

version := "0.7.0-SNAPSHOT"

libraryDependencies ++= Dependencies.sbtOsgi

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-language:_",
  "-target:jvm-1.6",
  "-encoding", "UTF-8"
)

sbtPlugin := true


publishTo := {
	val nexus = "https://oss.sonatype.org/"
	if (version.value.trim.endsWith("SNAPSHOT"))
		Some("snapshots" at nexus + "content/repositories/snapshots")
	else
		Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}


publishMavenStyle := true

pomIncludeRepository := { _ => false }

publishArtifact in Test := false

