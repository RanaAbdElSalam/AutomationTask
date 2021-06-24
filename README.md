# Automating some pages of http://automationpractice.com/index.php website.
I created automation scripts for the "Create Account" and "Add Products to Cart" features of the website using Selenium & Java.
While creating the automation scripts on Eclipse IDE I used Maven, TestNG & Page Object Model design pattern.
As POM is applied, I created two Packages inside the project which are: Pages & Tests; the Pages Package has: 1- The Page_Base class that contains the driver intialization and the common methods used for the actions. 2- The Pages that contain the web elements and the methods of the tested features of the website. While the Tests Package contains the test cases and the assertions. 
I tried to minimize the native code as much as possible while handling the WebElements and made reusable methods for some of the actions.
I faced some issues with the website while creating and executing the tests as it frequently goes down.
You can easily download the project from this repository, then import it as a Maven Project on Eclipse IDE and run it as TestNG Suite from the TestNG.xml file.
