# Xenoglot

A comprehensive library for managing language data.

---

### API Reference

* [`dev.teogor.xenoglot`](../reference)
* [`dev.teogor.xenoglot:android`](../reference/android)
* [`dev.teogor.xenoglot:core`](../reference/core)

### Release

|   Latest Update   | Stable Release | Release Candidate | Beta Release | Alpha Release |
|:-----------------:|:--------------:|:-----------------:|:------------:|:-------------:|
| November 21, 2023 |       -        |         -         |      -       | 1.0.0.alpha01 |

### Declaring dependencies

To add a dependency on Xenoglot, you must add the Maven repository to your project.
Read [Maven's repository for more information](https://repo.maven.apache.org/maven2/).

Add the dependencies for the artifacts you need in the `build.gradle` file for your app or module:

[//]: # (===Kotlin)

[//]: # (```Kotlin)

[//]: # (dependencies {)

[//]: # (  val xenoglot_version = "1.0.0-alpha01")

[//]: # ()

[//]: # (  implementation&#40;"dev.teogor.xenoglot:core:$xenoglot_version"&#41;)

[//]: # (  implementation&#40;"dev.teogor.xenoglot:android:$xenoglot_version"&#41;)

[//]: # ()

[//]: # (  // or using bom)

[//]: # ()

[//]: # (  implementation&#40;platform&#40;"dev.teogor.xenoglot:bom:$xenoglot_version"&#41;&#41;)

[//]: # (  implementation&#40;"dev.teogor.xenoglot:core"&#41;)

[//]: # (  implementation&#40;"dev.teogor.xenoglot:android"&#41;)

[//]: # (})

[//]: # (```)

[//]: # ()

[//]: # (===Groovy)

[//]: # (```Groovy)

[//]: # (dependencies {)

[//]: # (  def xenoglot_version = "1.0.0-alpha01")

[//]: # ()

[//]: # (  implementation&#40;"dev.teogor.xenoglot:core:${xenoglot_version}"&#41;)

[//]: # (  implementation&#40;"dev.teogor.xenoglot:android:${xenoglot_version}"&#41;)

[//]: # ()

[//]: # (  // or using bom)

[//]: # (  implementation&#40;platform&#40;"dev.teogor.xenoglot:bom:${xenoglot_version}"&#41;&#41; {)

[//]: # (    // Specify the artifact to resolve and re-export the dependencies from the platform BOM)

[//]: # (    implementation&#40;"dev.teogor.xenoglot:core"&#41;)

[//]: # (    implementation&#40;"dev.teogor.xenoglot:android"&#41;)

[//]: # (  })

[//]: # (})

[//]: # (```)

### Feedback

Your feedback helps make Xenoglot better. We want to know if you discover new issues or have ideas
for improving this library. Before creating a new issue, please take a look at
the [existing ones](https://github.com/teogor/xenoglot) in this library. You can add your vote to an
existing issue by clicking the star button.

[Create a new issue](https://github.com/teogor/xenoglot/issues/new)

### Version 1.0.0

#### Version 1.0.0-alpha02

November 24, 2023

`dev.teogor.xenoglot:xenoglot-*:1.0.0-alpha02` is
released. [Version 1.0.0-alpha02 contains these commits.](https://github.com/teogor/xenoglot/commit/ff798bb57b380403a26d23ee4260e6ab98627adc)

**Bug Fixes**

* Bug 1
* Bug 2
* Bug 3
* Bug 4

#### Version 1.0.0-alpha01

November 21, 2023

`dev.teogor.xenoglot:xenoglot-*:1.0.0-alpha01` is
released. [Version 1.0.0-alpha01 contains these commits.](https://github.com/teogor/xenoglot/commit/ff798bb57b380403a26d23ee4260e6ab98627adc)

**Bug Fixes**

* Bug 1
* Bug 2

---

### Overview

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Maven Central](https://img.shields.io/maven-central/v/dev.teogor.xenoglot/bom.svg?label=Maven%20Central)](https://central.sonatype.com/search?q=g%3Adev.teogor.xenoglot+a%3Abom&smo=true)
[![Profile](https://source.teogor.dev/badges/teogor-github.svg)](https://github.com/teogor)
[![Open-Source Directory](https://source.teogor.dev/badges/teogor-dev.svg)](https://source.teogor.dev)

**Xenoglot: A Comprehensive Language Data Management Toolkit**

Xenoglot is a comprehensive library for representing, managing, and interacting with language data.
It provides a rich set of classes and interfaces for representing languages, dialects, scripts,
language families, and regions. The library also includes methods for obtaining language tags,
checking language usage patterns, and territorializing languages. Xenoglot is essential for any
project that requires accurate and consistent handling of language data.

**Key Features**

* **Comprehensive Language Representation:** Xenoglot provides a structured representation of
  languages, dialects, scripts, language families, and regions, enabling accurate and consistent
  handling of language data.

* **Language Tag Generation:** Xenoglot provides methods for generating language tags, facilitating
  interoperability with language-related protocols and standards.

* **Language Usage Analysis:** Xenoglot includes methods for checking language usage patterns,
  enabling informed decisions about language selection and content localization.

* **Language Territorialization:** Xenoglot provides functionality for territorializing languages,
  adapting them to specific geographical or political contexts.

**Installation**

To install Xenoglot, add the following dependency to your build script:

```kotlin
dependencies {
  implementation(platform("dev.teogor.xenoglot:bom:1.0.0-alpha01"))
  implementation("dev.teogor.xenoglot:android")
  implementation("dev.teogor.xenoglot:core")

  // or without bom
  implementation("dev.teogor.xenoglot:core:1.0.0-alpha01")
}
```

**Usage**

The following examples demonstrate how to use Xenoglot to represent and interact with language data:

**Retrieving Language Information**

```kotlin
val language = Language.English
val languageTag = language.languageTag
val languageFamily = language.languageFamily
val isSpokenInRomania = language.isSpokenIn(Country.Romania)
```

**Checking Language Usage Patterns**

```kotlin
val isDialect = Dialect("en-US", Language.English).isDialect
val isScriptUsedInLanguage = Script.Cyrillic.isWrittenIn(Language.Russian)
```

**Interacting with Language Tags**

```kotlin
val languageTag = LanguageTag("fr", LanguageFamily.Romance)
val language = languageTag.asLanguage()
val countryCode = languageTag.substringAfter("-")
```

**Territorializing Languages**

```kotlin
val dialect = Language.English.territorialize(Country.Australia)
val dialectLanguageTag = dialect.languageTag
val dialectCountryCode = dialect.country.code
```

**Benefits of Using Xenoglot**

* **Improved Language Handling:** Xenoglot provides a consistent and structured approach to managing
  language data, reducing errors and inconsistencies.

* **Enhanced Interoperability:** Xenoglot facilitates interoperability with language-related
  protocols and standards, enabling seamless integration with external systems.

* **Simplified Language-Related Tasks:** Xenoglot streamlines language-related tasks, such as
  localization, translation, and language detection.

* **Promote Language-Aware Development:** Xenoglot encourages language-aware development practices,
  ensuring that language data is handled accurately and appropriately.

**Getting Started**

To get started with Xenoglot, refer to the comprehensive documentation available at
[source.teogor.dev/xenoglot](https://source.teogor.dev/xenoglot). The documentation provides
detailed explanations, examples, and best practices for using the library effectively.

## Find this repository useful? 🩷

* Support it by joining __[stargazers](https://github.com/teogor/xenoglot/stargazers)__ for this
  repository. 📁
* Get notified about my new projects by __[following me](https://github.com/teogor)__ on GitHub. 💻
* Interested in sponsoring me? [Support me](sponsor.md) on GitHub! 🤝

# License

```xml
Designed and developed by 2023 teogor (Teodor Grigor)

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
```
