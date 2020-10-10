The tests are written in Java using Selenium Webdriver Framework with TestNG as a test runner and Maven as a buid tool.

1. In order to be able to run you should just run a "mvn clean install" so all the dependencies are brought to your machine. (It is assumed that java jdk is installed)

2. Optional! You might need to add to the run configuration some parameters for TestNG to run smoothly: Run-> Edit Configurations->Templates->TestNG-> VMOptions should have the following line: -ea -Dtestng.dtd.http=true

3. In the test classes (that have the word 'Tests' in their name) you can just right click on the @Test annotation of one of the tests and select Run.
(For the first run, you might need to click 'Allow' on the windows popup you get so the Webdriver is not blocked by the firewall)

The tests are only run on Chrome - there would be needed minor changes so they are run on Firefox or any other browser.

The tests are written using Page Object Model as a design pattern (most common pattern for Selenium tests)

In a normal situation, the 'resources/screenshots' folder should be empty - I just left there a few screenshots from my runnings of the tests so you can see how it looks.
 
