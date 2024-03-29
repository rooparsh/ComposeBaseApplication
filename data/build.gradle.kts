plugins {
    id(DependencyConfig.Plugin.ANDROID_LIBRARY_PLUGIN)
    id(DependencyConfig.Plugin.KOTLIN_ANDROID)
    id(DependencyConfig.Plugin.KOTLIN_KAPT)
    id(DependencyConfig.Plugin.ANDROID_HILT)
    id(DependencyConfig.Plugin.KOTLINX_SERIALIZATION)
}

android {
    compileSdk = Version.AppConfig.Base.COMPILE_SDK
    namespace = Version.AppConfig.Base.DATA_ID

    buildFeatures {
        buildConfig = true
    }

    defaultConfig {
        minSdk = Version.AppConfig.Base.MIN_SDK
        targetSdk = Version.AppConfig.Base.TARGET_SDK
        testInstrumentationRunner = Version.AppConfig.Base.TEST_RUNNER

        buildConfigField("String", "BASE_URL", "\"https://api.icndb.com/\"")
    }
    namespace = "com.darklabs.data"
}

dependencies {
    api(DependencyManager.dataLibraries)
    kapt(DependencyManager.compilerLibraries)
}