## Libraries Implementation Version Catalog

This catalog provides the implementation details of Xenoglot libraries, including Build of Materials (BoM) and individual libraries, in TOML format.

```toml
[versions]
xenoglot-bom = "1.0.0-alpha01"

[libraries]
# Xenoglot BoM
xenoglot-bom = { group = "dev.teogor.xenoglot", name = "bom", version.ref = "xenoglot-bom" }
# Xenoglot Libraries
xenoglot-android = { group = "dev.teogor.xenoglot", name = "android" }
xenoglot-core = { group = "dev.teogor.xenoglot", name = "core" }
```

## Libraries Implementation build.gradle.kts File

This section presents the implementation dependencies for Xenoglot libraries in a Kotlin build.gradle.kts file format.

```kotlin
dependencies {
  // Xenoglot BoM
  implementation(platform(libs.xenoglot.bom))
  // Xenoglot Libraries
  implementation(libs.xenoglot.android)
  implementation(libs.xenoglot.core)
}
```

## Xenoglot android

| Status | Library | Gradle dependency |
| ------ | ------- | ----------------- |
| 🧪 | [android](../reference/android) | [dev.teogor.xenoglot:android:1.0.0-alpha01](#implementation-android) |

By referring to the [BoM documentation](bom/versions.md), you can learn how to integrate the BoM into your project and benefit from this hassle-free approach to library version management. It's a powerful tool for staying up-to-date with the latest Xenoglot library versions and seamlessly integrating them into your projects.


### Implementation Android

To use android in your project, add the following dependency to your module-level Gradle file (usually `app/build.gradle.kts`):

```kotlin
implementation("dev.teogor.xenoglot:android:1.0.0-alpha01")
```

#### Gradle Dependency

- **Group ID:** `dev.teogor.xenoglot`
- **Artifact ID:** `android`
- **Version:** `1.0.0-alpha01` (not required when using [BoM](bom/versions.md))

⚠️ Depends on `:android`

## Xenoglot core

| Status | Library | Gradle dependency |
| ------ | ------- | ----------------- |
| 🧪 | [core](../reference/core) | [dev.teogor.xenoglot:core:1.0.0-alpha01](#implementation-core) |

By referring to the [BoM documentation](bom/versions.md), you can learn how to integrate the BoM into your project and benefit from this hassle-free approach to library version management. It's a powerful tool for staying up-to-date with the latest Xenoglot library versions and seamlessly integrating them into your projects.


### Implementation Core

To use core in your project, add the following dependency to your module-level Gradle file (usually `app/build.gradle.kts`):

```kotlin
implementation("dev.teogor.xenoglot:core:1.0.0-alpha01")
```

#### Gradle Dependency

- **Group ID:** `dev.teogor.xenoglot`
- **Artifact ID:** `core`
- **Version:** `1.0.0-alpha01` (not required when using [BoM](bom/versions.md))
