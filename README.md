This simple app utilizes AFrame library. 
Goal was to make simple space with 4 rooms in which you can play a game. 

To build:
1. Import as Maven project
2. run 'clean package' or 'mvn clean package'

To run:
1. Run .exe or .jar (java -jar AFrameDemo.jar)

In case of problems:
1. netstat -ano | findStr "8080"		//which process (pid_id) uses port 8080
2. taskkill /F /PID pid_id
3. Run .exe or .jar

