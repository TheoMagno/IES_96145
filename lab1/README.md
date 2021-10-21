HOW TO CREATE A MAVEN PROJECT:

$ mvn archetype:generate -DgroupId=mywheaterradar.app -DartifactId=mywheaterradar -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false 

GroupID and ArtifactID are used to name the project, so it should be different for each project.

PROPERTIES AND DEPENDENCIES:

Properties are used to define the project and dependencies to use JARs without having to download them.

HOW TO RUN:

Go to directory IES_96145/lab1/lab1_2/mywheaterradar
$ mvn package
$ mvn exec:java -Dexec.mainClass="myweatherradar.app.WeatherStarter" -Dexec.args="CITY_ID" or just $ mvn exec:java -Dexec.mainClass="myweatherradar.app.WeatherStarter" to use the default CITY_ID which is 1010500, Aveiro's code

DOCKER FLAGS:

-d - run the container in detached mode (in the background)
-p 80:80 - map port 80 of the host to port 80 in the container
docker/getting-started - the image to use

PS: como havia dito ao professor na aula prática de terça-feira, dia 19/10, estava sem internet em casa.
Apenas às 21 horas de quinta, 21/10, consegui ter
acesso novamente. Por este motivo atrasarei a entrega
deste guião para sexta-feira, 22/10.
