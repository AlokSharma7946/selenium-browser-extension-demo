Selenium Browser Extension Demo 🚀
This project demonstrates how to launch Google Chrome with MetaMask extension using Selenium WebDriver + TestNG in Java.
📌 Features
Launches Chrome with an existing user profile containing MetaMask.
Runs Selenium tests with TestNG.
Avoids manually adding the extension every time.
🛠️ Prerequisites
Make sure you have the following installed:
Java 17+
Maven
TestNG (comes via Maven dependency)
Google Chrome (latest)
ChromeDriver (matching Chrome version)
⚙️ Project Setup
Clone this repository:
git clone https://github.com/AlokSharma7946/selenium-browser-extension-demo.git
cd selenium-browser-extension-demo
Open in Eclipse/IntelliJ.
Update the user-data-dir and profile-directory in MetaMaskLaunchTest.java to match your Chrome profile path:
options.addArguments("--user-data-dir=/Users/<your-username>/Library/Application Support/Google/Chrome");
options.addArguments("--profile-directory=Profile 4");  
Ensure the MetaMask extension is already installed in that Chrome profile.
▶️ Running the Tests
Run the following command from the project root:
mvn clean test
Or, from IDE → right-click MetaMaskLaunchTest → Run as TestNG Test.
📂 Project Structure
src/test/java/com/aastha/browserwithextension/
 └── MetaMaskLaunchTest.java   # Test class with Chrome + MetaMask setup
pom.xml                        # Maven dependencies
✅ Expected Result
Chrome launches with the selected user profile.
The MetaMask extension should be visible in the browser.
TestNG test runs successfully.
