plugins {
    id("java-conventions")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

configurations.all {
    resolutionStrategy {
        dependencySubstitution {
            // use spring-boot-starter-log4j2 instead of spring-boot-starter-logging
            substitute(module("org.springframework.boot:spring-boot-starter-logging"))
                .using(module("org.springframework.boot:spring-boot-starter-log4j2:3.5.0"))
                .because("Use Log4j2 instead of Logback")
        }
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    // lombok, junit 등은 java-conventions에 포함이라 생략
}