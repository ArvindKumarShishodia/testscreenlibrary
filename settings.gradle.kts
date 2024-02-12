import java.net.URL

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()

    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
       /* maven {
            maven { URL=uri("https://plugins.gradle.org/m2/") }
        }*/
        maven {
            url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap")
        }
        maven {
            url = uri("https://jitpack.io")
        }
//        maven {
//            url = uri("https://plugins.gradle.org/m2/")
//        }

        google()
        mavenCentral()


    }
}

rootProject.name = "LibraryProject"
include(":app")
 