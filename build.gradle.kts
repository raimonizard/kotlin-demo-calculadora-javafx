plugins {
    kotlin("jvm") version "1.9.21"
    id("org.openjfx.javafxplugin") version "0.0.8"
}

javafx {
    modules("javafx.controls", "javafx.fxml")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}