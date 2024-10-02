plugins {
    id("java")
    id("org.sonarqube") version "4.0.0.2929"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

// Configuración de SonarQube
sonarqube {
    properties {
        property("sonar.projectKey", "Calculator3000")
        property("sonar.projectName", "Calculator3000")
        property("sonar.host.url", "http://localhost:9000")
    }
}
