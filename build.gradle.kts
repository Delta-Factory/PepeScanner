plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
	implementation("io.github.fragland:MineStat:3.0.6")
	implementation("ch.qos.logback:logback-classic:1.2.3")
	implementation("club.minnced:discord-webhooks:0.8.4")
}

group = "delta.cion"
version = "0.0.6-DEV"
description = "PepeS"
java.sourceCompatibility = JavaVersion.VERSION_22

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
