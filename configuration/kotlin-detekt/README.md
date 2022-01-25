# A static code analysis tool for the Kotlin programming language

https://detekt.github.io/detekt/index.html

## Install in project

1) Add subtree remote
```bash
git remote add kotlin-detekt git@gitlab.icerockdev.com:web/configuration/kotlin-detekt.git
```

2) Pull subtree 
```bash
git subtree add --squash --prefix=configuration/kotlin-detekt kotlin-detekt <version>
```

3) Add to root `build.gradle`

```groovy
allprojects {
    // ....
    repositories {
        jcenter()
    }
    // ....
}

configurations {
    detekt
}

task detekt(type: JavaExec) {
    main = "io.gitlab.arturbosch.detekt.cli.Main"
    classpath = configurations.detekt
    def config = "$rootDir/configuration/kotlin-detekt/detekt.yml"
    def exclude = ".*/build/.*,.*/resources/.*"
    def reports = "html:$rootDir/build/reports/detekt.html"
    def input = ""
    try {
        input = inputProps
    } catch (exc) {
        input = "$rootDir"
    }
    def params = [ '-i', input ?: input, '-c', config, '-ex', exclude, '-r', reports]
    args(params)
}

dependencies {
    detekt 'io.gitlab.arturbosch.detekt:detekt-cli:1.9.1'
}

```

4) Run from root of project `./configuration/kotlin-detekt/add-pre-commit` for add pre-commit hook

## Commands

```bash
# Checks the source sets for that project
./gradlew detekt [-PinputProps="PATHFILE1,PATHFILE2"]

# Add pre-commit script
./configuration/kotlin-detekt/add-pre-commit
```

## Configurations

For changes and tune rules

`./detekt.yml`

For ignore rule in code

```kotlin
@Suppress("MagicNumber")
class M20200417170208180_create_push_token_table : AbstractMigration() {
    override fun up() {
        createTable("push_token") {
            id = false
            varchar("token", 255, nullable = false)
            integer("user_id", nullable = false)
        }

        executeSql("ALTER TABLE push_token ADD CONSTRAINT PK_push_token PRIMARY KEY (token)")
    }

    override fun down() {
        dropTable("push_token")
    }
}
```

## Reports

After run reports generated in root of project

`build/reports/detekt.html`
