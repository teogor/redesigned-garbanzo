[//]: # (This file was automatically generated - do not edit)

# Xenoglot

Xenoglot seamlessly masters languages and locales, empowering developers to integrate multilingual
capabilities into their applications with ease.

---

### API Reference

* [`dev.teogor.xenoglot`](../reference)
* [`dev.teogor.xenoglot:android`](../reference/android)
* [`dev.teogor.xenoglot:core`](../reference/core)

### Release

|   Latest Update   | Stable Release | Beta Release | Alpha Release |
|:-----------------:|:--------------:|:------------:|:-------------:|
| November 21, 2023 |       -        |      -       | 1.0.0-alpha01 |

### Declaring dependencies

To add a dependency on Xenoglot, you must add the Maven repository to your project.
Read [Maven's repository for more information](https://repo.maven.apache.org/maven2/).

Add the dependencies for the artifacts you need in the `build.gradle` file for your app or module:

=== "Kotlin"

    ```kotlin
    dependencies {
      val xenoglot_version = "1.0.0-alpha01"

      implementation("dev.teogor.xenoglot:core:$xenoglot_version")
      implementation("dev.teogor.xenoglot:android:$xenoglot_version")

      // or using bom

      implementation(platform("dev.teogor.xenoglot:bom:$xenoglot_version"))
      implementation("dev.teogor.xenoglot:core")
      implementation("dev.teogor.xenoglot:android")
    }
    ```

=== "Groovy"

    ```groovy
    dependencies {
      def xenoglot_version = "1.0.0-alpha01"

      implementation("dev.teogor.xenoglot:core:${xenoglot_version}")
      implementation("dev.teogor.xenoglot:android:${xenoglot_version}")

      // or using bom

      implementation(platform("dev.teogor.xenoglot:bom:${xenoglot_version}")) {
        // Specify the artifact to resolve and re-export the dependencies from the platform BOM
        implementation("dev.teogor.xenoglot:core")
        implementation("dev.teogor.xenoglot:android")
      }
    }
    ```

### Feedback

Your feedback helps make Xenoglot better. We want to know if you discover new issues or have ideas
for improving this library. Before creating a new issue, please take a look at
the [existing ones](https://github.com/teogor/xenoglot) in this library. You can add your vote to an
existing issue by clicking the star button.

[Create a new issue](https://github.com/teogor/ceres/issues/new){ .md-button }

### Version 1.0.0

#### Version 1.0.0-alpha02

October 3, 2023

`dev.teogor.ceres:ceres-*:1.0.0-alpha02` is
released. [Version 1.0.0-alpha02 contains these commits.](https://github.com/teogor/ceres/compare/1.0.0-alpha01...1.0.0-alpha02)

**Enhancement**
* Documentation Generation for BOM 1.0.0alpha-02 ([#117](https://github.com/teogor/ceres/pull/117)) by [@teogor](https://github.com/teogor)
* Migrate Utilities and Integrate Ceres Core Foundation Composition Provider ([#115](https://github.com/teogor/ceres/pull/115)) by [@teogor](https://github.com/teogor)
* About Ceres Framework UI and GitHub Link ([#112](https://github.com/teogor/ceres/pull/112)) by [@teogor](https://github.com/teogor)
* Update Android SDK and Introduce Core Library Desugaring Control ([#110](https://github.com/teogor/ceres/pull/110)) by [@teogor](https://github.com/teogor)

**Bug Fixes**
* Remove 'about-libraries' Plugin Configuration ([#111](https://github.com/teogor/ceres/pull/111)) by [@teogor](https://github.com/teogor)
* Optional Status Bar Padding in FullScreenLayoutBase ([#109](https://github.com/teogor/ceres/pull/109)) by [@teogor](https://github.com/teogor)

**Others**
* UI Enhancements and Refactoring for Screens ([#108](https://github.com/teogor/ceres/pull/108)) by [@teogor](https://github.com/teogor)

#### Version 1.0.0-alpha01

September 28, 2023

`dev.teogor.ceres:ceres-*:1.0.0-alpha01` is
released. [Version 1.0.0-alpha01 contains these commits.](https://github.com/teogor/ceres/compare/6179ac776758e1905c36093a803fec7af99176b7...1.0.0-alpha01)

**Initial Release** 🎊
