plugins {
    id("java")
    id("org.sonarqube") version "4.3.0.3225"
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
        property("sonar.projectKey", "sonarqube")
        property("sonar.login", "sqp_42429cfa66f04e31e4d60508ce424fcc4081f2f6")
        property("sonar.host.url", "http://localhost:9000")
    }
}
