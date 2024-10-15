# GPP Decoder and Encoder

This project decodes and encodes GPP strings using the `iabgpp-encoder` library. The application allows decoding GPP strings into a readable format and encoding GPP strings based on provided input values.
https://github.com/IABTechLab/iabgpp-java

## Environment Setup

Follow these steps to set up your environment for development.

### 1. Install Visual Studio Code (VS Code)
- Download and install [Visual Studio Code](https://code.visualstudio.com/) for your operating system.

### 2. Install Java Development Kit (JDK)
- Download and install JDK from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use OpenJDK.
- Set the `JAVA_HOME` environment variable:
  - **Windows**:
    1. Right-click on "This PC" > "Properties" > "Advanced System Settings".
    2. Under "System Properties", click on "Environment Variables".
    3. Create a new system variable:
       - **Variable Name**: `JAVA_HOME`
       - **Variable Value**: Path to your JDK installation (e.g., `C:\Program Files\Java\jdk-11`)
    4. Add `%JAVA_HOME%\bin` to the `Path` variable.
  - **Linux/macOS**:
    - Add the following to your `.bashrc`, `.zshrc`, or `.bash_profile`:
      ```bash
      export JAVA_HOME=/path/to/jdk
      export PATH=$JAVA_HOME/bin:$PATH
      ```
    - Replace `/path/to/jdk` with the actual path to your JDK installation.

### 3. Install Maven
- Download and install [Apache Maven](https://maven.apache.org/download.cgi).
- Set the `MAVEN_HOME` environment variable:
  - **Windows**:
    - Add a new system variable:
      - **Variable Name**: `MAVEN_HOME`
      - **Variable Value**: Path to your Maven installation.
    - Add `%MAVEN_HOME%\bin` to the `Path` variable.
  - **Linux/macOS**:
    - Add the following to your `.bashrc` or `.bash_profile`:
      ```bash
      export MAVEN_HOME=/path/to/maven
      export PATH=$MAVEN_HOME/bin:$PATH
      ```
    - Replace `/path/to/maven` with the actual path to your Maven installation.

- Verify the Maven installation by running:
  ```bash
  mvn -version

### 4. Running GPP Decoder and Encoder
- Building the Project
  ```bash
  mvn clean install
  
- **GPP Decoder**:
  ```bash
  mvn exec:java -Dexec.mainClass="com.java.com.example.GppDecoder"

- **GPP Encoder**:
  ```bash
  mvn exec:java -Dexec.mainClass="com.java.com.example.GppEncoder"