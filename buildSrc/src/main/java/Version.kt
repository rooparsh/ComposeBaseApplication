object Version {

    object Project {
        const val GRADLE_TOOLS = "8.1.2"
        const val KOTLIN_GRADLE = "1.9.10"
        const val DAGGER_HILT = "2.44"
    }

    object AppConfig {
        object Base {
            const val APP_ID = "com.darklabs.basecompose"
            const val DOMAIN_ID = "com.darklabs.domain"
            const val DATA_ID = "com.darklabs.data"
            const val COMPILE_SDK = 34
            const val MIN_SDK = 21
            const val TARGET_SDK = 34
            const val VERSION_CODE = 1
            const val VERSION_NAME = "1.0.0"
            const val TEST_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
        }

        object Android {
            const val COMPOSE = "1.5.2"
            const val ACTIVITY_COMPOSE = "1.3.1"
            const val CORE = "1.5.0"
            const val APP_COMPAT = "1.3.1"
            const val LIFECYCLE_KTX = "2.6.2"
            const val MATERIAL = "1.3.0"
            const val COROUTINES = "1.5.0"
            const val RETROFIT = "2.9.0"
            const val LOGGING = "5.0.0-alpha.2"
            const val KOTLINX_SERIALIZATION = "0.8.0"
            const val KOTLINX_JSON = "1.2.1"
        }


        object Testing {
            const val JUNIT = "4.+"
            const val ANDROID_JUNIT = "1.1.2"
            const val ESPRESSO = "3.3.0"
        }
    }
}