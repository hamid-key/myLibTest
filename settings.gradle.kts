pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url  = uri("https://jitpack.io") }
        google()
    }
}

rootProject.name = "LibraryTest"
include(":app")
include(":mylibrary")
include(":secondlibrary")
include(":app:mylibrary3")
include(":secondlibrary:nested1")
include(":secondlibrary:nested2")
