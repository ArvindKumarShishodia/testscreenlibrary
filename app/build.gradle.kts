buildscript {
    repositories {
        google()
        //mavenCentral()

    }

    dependencies {
        // classpath("com.android.tools:api:8.2.2")

        classpath ("com.android.tools.build:gradle:8.2.2")
        //classpath("com.google.android.libraries.mapsplatform.secrets-gradle-plugin:secrets-gradle-plugin:2.0.1")
    }
}
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("base")
    id("maven-publish")
}
/*publishing{
    publications {
        create("maven"){

        }
    }
}*/
/*buildscript {
    repositories {
        mavenCentral()
        flatDir {
            dirs
        }
    }*/

   /* dependencies {
    classpath ("com.android.tools.build:gradle:8.2.2.")
    }*/
//}
android {

    namespace = "com.example.libraryproject"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
        targetSdk = 34

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
      /*  release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }*/
    }

    java{
        toolchain{
            languageVersion=JavaLanguageVersion.of(18)
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

configurations {
 //   toCopy
}
configurations {
   // myCustomConfiguration {
        //canBeResolved true
    //}
}
dependencies {


  /*  api("com.squareup.retrofit2:retrofit:2.9.0"){
        isTransitive = true
        setTransitive(true)
    }*/

// GSON
//
//    api("com.squareup.retrofit2:converter-gson:2.9.0"){
//        isTransitive = true
//        setTransitive(true)
//    }

// coroutine
    implementation("com.intuit.sdp:sdp-android:1.1.0@aar")
    runtimeOnly("com.intuit.sdp:sdp-android:1.1.0@aar"){
        isTransitive = true
    }
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")

    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation (platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))

    //implementation("com.github.kezong:fat-aar:1.3.8")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    //implementation(files("libs/okio-1.17.2.jar"))
    //implementation(files("libs/okhttp-3.14.9.jar"))
    //implementation(files("libs/retrofit-2.9.0.jar"))
    //implementation(files("libs/emt-release.aar"))
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    /*dependencies {
        api("com.github.ozodrukh:CircularReveal:2.0.1@aar") {
            isTransitive = true
        }
    }*/

}
/*task("copyDependencies", Copy::class) {
    from(configurations.default).into("$buildDir/outputs/.aar/dependencies")
}*/
/*task("copyDependencies", Copy::class) {
    from(configurations.implementation).into("libs")
    //from(configurations.implementation).into("libs")
}
task("download",Copy:: class) {
    from(configurations.implementation).into("libs")
}*/
//task copyDependencies(type: Copy) {
//    from configurations.runtimeClasspath
//            into "$buildDir/outputs/aar/dependencies"
//}

/*publishing {
    publications {
        maven(MavenPublication) {
            groupId = 'com.github.arvindshishodia'
            artifactId = 'sizeindeplib'
            version = "1.0"
            pom {
                description = 'First Android library'
            }
        }
    }
    repositories {               // << --- ADD This
        mavenLocal()
    }
}*/
