# Assesment_2022

This is an Automation Task provided by Selise for the purpose of hiring process.

# Answers to questions number 1 to 3 are given below : 


# Answers to the questions number 4 are given below : 

# Technology:

- Tool: selenium Webdriver

- IDE: IntelIJ IDEA

- Build tool: Gradle

- Language: Java

- Test runner: TestNG

# Prerequisite:

- Need to install jdk 11, gradle and allure

- Configure Environment variable for jdk 11, gradle and allure
- Need good internet connectivity

- Clone this project and unzip it

- Open the project folder

- Double click on "build.gradle" and open it through IntellIJ IDEA

- Let the project build successfully

- In "./src/test/resources/Users.json" replace the whole JSON content with [] and save

- Click on "Terminal" and run the automation scripts

# Run the automation script:
- Type the command:

          gradle clean test
      
- Selenium will open the browser and start automation

- To view report, type this command one after another:

          allure generate allure-results --clean -o allure-report
        
          allure serve allure-results
 # Screenshots
 These are the snapshots of the allure reports:
 
 <img width="955" alt="Screenshot_1" src="https://user-images.githubusercontent.com/78067017/204604854-cc0e827f-17cb-44da-bf55-3c72470a0a06.png">
<img width="956" alt="Screenshot_22" src="https://user-images.githubusercontent.com/78067017/204604865-fef66497-7a10-4136-adba-a64c6dbec74a.png">



