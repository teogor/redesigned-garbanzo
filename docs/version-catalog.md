## Libraries Implementation Version Catalog

This catalog provides the implementation details of Xenoglot libraries, including Build of
Materials (BoM) and individual libraries, in TOML format.

```toml  title="gradle/libs.versions.toml"
[versions]
xenoglot-bom = "1.0.0-alpha01"

[libraries]
# Xenoglot BoM
xenoglot-bom = { group = "dev.teogor.xenoglot", name = "bom", version.ref = "xenoglot-bom" }
# Xenoglot Libraries
xenoglot-android = { group = "dev.teogor.xenoglot", name = "android" }
xenoglot-core = { group = "dev.teogor.xenoglot", name = "core" }
```

## Dependencies Implementation

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
