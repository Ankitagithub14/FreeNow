Overview
  
 Open Wikipedia website in a chrome browser and look for search button. Validate that clicking on the search text button open the search text page.
 
##### Code Structure
 1. open eclipse : Version: 2022-06 (4.24.0)
 2. Create Maven project : File-->-->New-->Project-->Maven Project
 3. Maven Project structure created at extreme left side of the eclipse under project explorer.
 4. Created base class : includes browser detail.
 5. Created commonMethod class under helper package : include methods like the wikipedia and validation.
 6. Created main class 
 7. Run the scenarios with testng
 
 
 
##### How To Run from command Line
 1. install Maven in Window PC
 2. set the environment variable by(creating MAVEN_HOME and add the maven path and under PATH name give the  maven path till bin)
 3. command line check for maven version: mvn -version
 4. in command line go to your test folder(command cd <test folder path> press enter /or open test folder and then open the command line
 5. mvn clear
 6. mvn test
 
 
 
  
##### Specific Information 
1. Java version "18.0.1.1" 
2. Testng dependency added in pom.xml
3. Selenium java dependency added in pom.xml
