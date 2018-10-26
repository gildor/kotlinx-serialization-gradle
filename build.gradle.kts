// Just apply kotlin and serialization plugins
plugins {
    id("org.jetbrains.kotlin.jvm")
    id("kotlinx-serialization")
}

repositories {
    jcenter()
    // We need custom repo for kotlinx-serialization-runtime,
    // can be removed when runtime published to jcenter/mavenCentral
    maven("https://kotlin.bintray.com/kotlinx")
}

dependencies {
    // Runtime dependencies of Kotlin and serialization
    compile("org.jetbrains.kotlin:kotlin-stdlib")
    compile("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.8.3-rc13")
}
