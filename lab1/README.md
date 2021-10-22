## **HOW TO CREATE A MAVEN PROJECT:**

$ mvn archetype:generate -DgroupId=mywheaterradar.app -DartifactId=mywheaterradar -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false 

GroupID and ArtifactID are used to name the project, so it should be different for each project.

## **PROPERTIES AND DEPENDENCIES:**

Properties are used to define the project and dependencies to use JARs without having to download them.

## **HOW TO RUN:**

Go to directory IES_96145/lab1/lab1_2/mywheaterradar
$ mvn package
$ mvn exec:java -Dexec.mainClass="myweatherradar.app.WeatherStarter" -Dexec.args="CITY_ID" or just $ mvn exec:java -Dexec.mainClass="myweatherradar.app.WeatherStarter" to use the default CITY_ID which is 1010500, Aveiro's code

## **DOCKER FLAGS:**

-d - run the container in detached mode (in the background)
-p 80:80 - map port 80 of the host to port 80 in the container
docker/getting-started - the image to use

## **WRAPPING-UP AND INTEGRATING:**

IpmaApiClient-> groupId=IpmaAPI artifactId=ApiClient
WeatherForecastByCity-> groupId=WeatherForecast artifactId=ForecastByCity

## **REVIEW QUESTIONS:**

- A) The default lifecycle handles your project deployment.
   In this lifecycle the main phases are:
```
    validate - validate the project is correct and all necessary information is available
    compile - compile the source code of the project
    test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
    package - take the compiled code and package it in its distributable format, such as a JAR.
    verify - run any checks on results of integration tests to ensure quality criteria are met
    install - install the package into the local repository, for use as a dependency in other projects locally
    deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.
```

- B) Yes, because it gets all the dependecies and integrates them to the project to make it run correctly.
- C) 
```
   git clone / git pull      #get the repository or the most recent version
   MAKE CHANGES
   git add CHANGES           #add the changes to the upstream
   git commit -m "commits"   #write a commit to show the changes
   git push                  #save the changes into the remote repository
```

- D) To make a good commit message it is important to tell briefly the most important changes or write the task's name.
- E)
   * Volumes are easier to back up or migrate than bind mounts.
   * You can manage volumes using Docker CLI commands or the Docker API.
   * Volumes work on both Linux and Windows containers.
   * Volumes can be more safely shared among multiple containers.
   * Volume drivers let you store volumes on remote hosts or cloud providers, to encrypt the contents of volumes, or to add other functionality.
   * New volumes can have their content pre-populated by a container.
   * Volumes on Docker Desktop have much higher performance than bind mounts from Mac and Windows hosts. <br />
   So, using volumes makes it easier to manage the database through different hardwares. Also, volumes permit to change dinamically without remaking the image.

```

PS: como havia dito ao professor na aula prática de terça-feira, dia 19/10, estava sem internet em casa.
Apenas às 21 horas de quinta, 21/10, consegui ter
acesso novamente. Por este motivo atrasarei a entrega
deste guião para sexta-feira, 22/10.
```