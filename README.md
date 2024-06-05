# FooParameterization Project

## Project Goal
The FooParameterization project aims to provide a Java 17 library for calculating various parameters related to geometric shapes.

## Project Structure
The project follows a standard Java project structure:

```
FooParameterization/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/
│   │           └── fooparameterization/
│   │               ├── Sphere.java
│   │               └── Main.java
│   └── test/
│       └── java/
│           └── org/
│               └── fooparameterization/
│                   └── SphereTest.java
├── .github/
│   └── workflows/
│       ├── publish.yml
│       ├── spotless.yml
│       └── test.yml
└── README.md
```

- The `src/main/java` directory contains the main Java source code files, organized under the `org.fooparameterization` package.
- The `Sphere.java` class contains the actual function parameterization for the volume of a sphere, given its volume.
- The `Main.java` class contains code to show that the function call to `sphere.calculateVolume` works.
- The `src/test/java` directory contains the unit test files for the project.
- The `.github/workflows` directory contains the GitHub Actions workflow configuration file for the CI pipeline.
- The `README.md` file provides an overview of the project.

## Compiling and Running the Project
To compile and run the project, follow these steps:

1. Ensure that you have the JDK and Maven installed on your system.
2. Open a terminal or command prompt and navigate to the project directory.
3. Run the following command to compile the project:
   ```
   mvn clean package
   ```
4. Run the following command to execute the main class:
   ```
   java -cp target/FooPhysics-1.0-SNAPSHOT.jar org.fooparameterization.Main
   ```

## Running Tests
To run the unit tests for the project, follow these steps:

1. Ensure that you have the JDK and Maven installed on your system.
2. Open a terminal or command prompt and navigate to the project directory.
3. Run the following command to run the project's tests:
   ```
   mvn test
   ```

Current test cases:

1. When function `Sphere.calculateVolume()` is given the radius 5.0, test that the value returned is the expected volume 523.59877559829886
1. When function `Sphere.calculateVolume()` is given the radius -5.0, test that an `IllegalArgumentException` has been thrown.
1. When function `Sphere.calculateVolume()` is given the radius 1e100, test that an `IllegalArgumentException` has been thrown.

## CI Pipeline with GitHub Actions
The project includes a CI pipeline set up using GitHub Actions. The workflow configuration files are located at `.github/workflows/`. The pipeline is triggered on every push to the repository and performs the following steps:

1. Checks out the latest code from the repository.
2. Sets up the Java environment.
3. Builds the project using Maven.
4. Runs the unit tests.
4. Runs Spotless, a code linter and formatter, that checks the formatting of the code according to Google Java Style.

The CI pipeline ensures that the project builds successfully, passes all the tests on every code change, and follows Java formatting conventions.

## Nice-to-haves
A CD pipeline that will publish to the Maven Central Repository so that others may import this project using the `pom.xml` configuration file.

In its stead, a basic CD pipeline has been implementing using GitHub Releases. This pipeline will trigger when a commit with
a tag starting with v, and will include the `.jar` output in [releases](https://github.com/multimattia/fooparameterization/releases/). See `publish.yml` for the full workflow.

## License
This project is licensed under the Apache License 2.0.
