sonatypeProfileName := "ru.arigativa"

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

pomExtra in Global := {
  <url>https://github.com/klpx/akka-stream-postgresql-copy</url>
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:github.com/klpx/akka-stream-postgresql-copy.git</connection>
      <developerConnection>scm:git:git@github.com:klpx/akka-stream-postgresql-copy.git</developerConnection>
      <url>github.com/klpx/akka-stream-postgresql-copy.git</url>
    </scm>
    <developers>
      <developer>
        <id>hsslbch</id>
        <name>Alexander Hasselbach</name>
        <url>https://arigativa.ru</url>
      </developer>
    </developers>
}
