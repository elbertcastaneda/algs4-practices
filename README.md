# algs4-practices

## Run examples of this project with gradle

```bash
# Flips example
gradle run --args="Flips 50"
```


## Upgrade algs4 Library

- Go to or `git clone` the repo https://github.com/kevin-wayne/algs4
- Remove your folder `src/main/java/edu`
- Move the folder `src/main/java/edu` from the downloaded repo to `src/main/java` of this project.

Here a script you can run in the root of this project:

- Linux and macOS

```bash
# Clone the algs4 repository
git clone https://github.com/kevin-wayne/algs4

# Remove the existing edu directory (Source code of alg4 project)
rm -Rf ./src/main/java/edu

# Move the edu git's folder folder to the java's folder of this project source code 
mv ./algs4/src/main/java/edu ./src/main/java/

# Move the edu git's folder folder to the java's folder of this project source code
rm -Rf ./algs4
```

- Windows

```ps
# Clone the algs4 repository
git clone https://github.com/kevin-wayne/algs4

# Remove the existing edu directory (Source code of alg4 project)
Remove-Item -Recurse -Force .\src\main\java\edu

# Move the edu git's folder folder to the java's folder of this project source code
Move-Item -Path .\algs4\src\main\java\edu -Destination .\src\main\java\

# Remove the cloned repository
Remove-Item -Recurse -Force .\algs4

```

---

## Upgrade gradle wrapper

```bash
./gradlew wrapper --gradle-version 8.11
```

Here to get the latest version: https://docs.gradle.org/current/userguide/userguide.html

---

## Upgrade Gradle Plugins and Dependencies

Change versions on `./build.gradle` file.

### Gradle Plugins

https://plugins.gradle.org/

- Kotlin: https://plugins.gradle.org/plugin/org.jetbrains.kotlin.jvm

### Dependencies

https://mvnrepository.com/

- [org.junit.jupiter:junit-jupiter](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api)
- [org.junit.jupiter:junit-jupiter-engine](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine)
- [org.junit.platform:junit-platform-launcher](https://mvnrepository.com/artifact/org.junit.platform/junit-platform-launcher)