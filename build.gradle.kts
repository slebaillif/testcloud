plugins {
    id("java")
    id("org.springframework.boot") version "3.4.0"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot:3.4.0")
    implementation("org.springframework.boot:spring-boot-dependencies:3.4.0")
    implementation("org.springframework.boot:spring-boot-starter-web:3.4.0")
    implementation("org.springframework.boot:spring-boot-starter-test:3.4.0")
    implementation("org.springframework.boot:spring-boot-starter-validation:3.4.0")
    implementation("org.springframework.boot:spring-boot-starter-webflux:3.4.0")
    implementation ("org.springframework.cloud:spring-cloud-starter-config")
    implementation ("org.springframework.retry:spring-retry")
    implementation ("org.springframework.boot:spring-boot-starter-actuator")
    implementation ("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation ("org.flywaydb:flyway-core:9.22.3")

    runtimeOnly("org.postgresql:postgresql")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.testcontainers:postgresql:1.17.3")

    implementation("com.google.dagger:dagger-compiler:2.51.1")
}

dependencyManagement {
    imports {
        mavenBom ("org.springframework.cloud:spring-cloud-dependencies:2024.0.0")
        mavenBom ("org.testcontainers:testcontainers-bom:1.17.3")
    }
}

tasks.test {
    useJUnitPlatform()
}