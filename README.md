# Presentation
Project for TP for Gradle lesson.

## Compilation

To compile the project run the following command inside the project directory
```shell script
    ./gradlew build             # Sous GNU/Linux
    ./gradlew.bat build         # Sous Windows
```

## Tests

To execute all tests run the following command inside the project directory
```shell script
    ./gradlew test             # Sous GNU/Linux
    ./gradlew.bat test         # Sous Windows
```

## Documentation

To create only the JavaDoc of the project run the following command inside the project directory
```shell script
    ./gradlew javadoc             # Sous GNU/Linux
    ./gradlew.bat javadoc         # Sous Windows
```
The documentation is available in the directory `app/build/docs/javadoc`, open the `index.html` file

## Deploiement

Project is deploying in a folder `repo` in the parent directory of the project directory.
To deploy this project in this local repository run the following command inside the project directory
```shell script
    ./gradlew publish             # Sous GNU/Linux
    ./gradlew.bat publish         # Sous Windows
```