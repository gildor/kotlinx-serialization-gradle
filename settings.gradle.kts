// Configure Kotlin and Serilization plugins
// This block can be removed when Kotlin 1.3 and serialization plugins
// will be published to Gradle Plugins Portal
// For now we use to enable plugins dsl usage
pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
    }
    resolutionStrategy {
        // Share version of Kotlin and Serialization plugin
        val kotlinVersion = "1.3.0-rc-190"
        // Mapping of plugins to use custom repository
        eachPlugin {
            when(requested.id.id) {
                "org.jetbrains.kotlin.jvm" -> useVersion(kotlinVersion)
                "kotlinx-serialization" -> useModule("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
            }
        }
    }
}
