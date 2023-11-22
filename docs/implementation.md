## Implementation

### Latest Version

The latest release is [`1.0.0-alpha01`](releases.md)

### BoM (Bill of Materials) Versioning

The BoM (Bill of Materials) is the central hub for managing library versions within the Xenoglot
project.
It enables you to effortlessly keep track of the latest versions of key components and dependencies.

Below is a list of the latest versions of the BOM:

|    Version    |                       Release Notes                        | Release Date |
|:-------------:|:----------------------------------------------------------:|:------------:|
| 1.0.0-alpha01 | [changelog 🔗](1.0.0-alpha01/bom-version-1.0.0-alpha01.md) | 18 Nov 2023  |

### Using Version Catalog

#### Declare Components

This catalog provides the implementation details of Xenoglot libraries, including Build of
Materials (BoM) and individual libraries, in TOML format.

```toml title="gradle/libs.versions.toml"
[versions]
xenoglot-bom = "1.0.0-alpha01"

[libraries]
# Xenoglot BoM
xenoglot-bom = { group = "dev.teogor.xenoglot", name = "bom", version.ref = "xenoglot-bom" }
# Xenoglot Libraries
xenoglot-android = { group = "dev.teogor.xenoglot", name = "android" }
xenoglot-core = { group = "dev.teogor.xenoglot", name = "core" }
```

#### Dependencies Implementation

This section presents the implementation dependencies for Xenoglot libraries in a Kotlin
`build.gradle` file format.

=== "Kotlin"

    ```kotlin
    dependencies {
      // Xenoglot BoM
      implementation(platform(libs.xenoglot.bom))
      // Xenoglot Libraries
      implementation(libs.xenoglot.android)
      implementation(libs.xenoglot.core)
    }
    ```

=== "Groovy"

    ```groovy
    dependencies {
        // Xenoglot BoM
        compile group("dev.teogor.xenoglot:version:1.0.0-alpha01")

        // OR, without BOM, directly specify the libraries

        // Xenoglot Libraries
        compile("dev.teogor.xenoglot:android")
        compile("dev.teogor.xenoglot:core")
    }
    ```
