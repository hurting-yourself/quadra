plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.5.0")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.7")
}