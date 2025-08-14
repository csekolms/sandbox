# GitHub Sandbox

This project is a sandbox for experimenting with GitHub features, Java, Maven, and SonarCloud.

## Prerequisites

To build and run this project, you will need:

*   Java 17
*   Maven 3.x

## Building

To build the project, run the following command from the root directory:

```bash
mvn clean install
```

## Code Quality

This project is integrated with SonarCloud for static code analysis. To run a SonarCloud analysis, you can use the following Maven command:

```bash
mvn sonar:sonar \
  -Dsonar.projectKey=csekolms_sandbox \
  -Dsonar.organization=csekolms \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.login=$SONAR_TOKEN
```

Make sure to replace `$SONAR_TOKEN` with your SonarCloud access token.
