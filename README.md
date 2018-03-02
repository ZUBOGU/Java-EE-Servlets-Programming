# Java-EE-Servlets-Programming
Web development using Java servlets. Web container: Tomcat 

## Apache-Tomcat Setup on Mac
Make sure have Java installed

>java -version

Fix permission denied

>sudo chown -R <your_username> ~/apache-tomcat-9.0.5

>sudo chmod +x apache-tomcat-9.0.5/bin/*.sh

Running Tomcat. User terminal, cd into /bin folder

>./startup.sh

### Deploy war file

> cd servletapplicationsdemo

> mvn clean install

Copy servletapplicationsdemo.war file into Tomcat /webapps directory.

Go to browser and view the page.

> http://localhost:8080/servletapplicationsdemo

Add the url path in Servelet class annotation to retrieve specific servlet class

> http://localhost:8080/servletapplicationsdemo/HelloWorld

## Maven Archetype to initial a project

>mvn -DarchetypeGroupId=org.codehaus.mojo.archetypes -DarchetypeArtifactId=webapp-javaee7 -DarchetypeVersion=1.1 -DgroupId=com.servletapplicationsdemo -DartifactId=servletapplicationsdemo -Dversion=1.0 -Darchetype.interactive=false --batch-mode -Dpackage=com.servletapplicationsdemo archetype:generate

