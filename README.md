# ProductCatalog - Simple REST API for the catalog of products

=========================adcash assignment - catalog of products===========================

I have created REST API by using springboot freamwork and also used Apache Maven as a build automation tool.

==================Technologies================== 
* java version 1.8
* Apache Maven 3.5.0
* springboot version 2.1.8.RELEASE
* H2 embedded database 
* Mockito for unit test
* Jacoco pluging for code coverage 
* Swagger-ui as REST API client interface to consume RESTful web services

===============NOTE=============================

*I have implemented Basic Authentication to support users authorization and created an ADMIN role that can 
authorize to create/update/delete actions. 
username : admin
password : admin123


*If you are using "Postman" or "advanced rest client", you can get the REST API details by accessing the Swgger 
and use "Accept" header with the value as "application/xml" OR "application/json" to support the json/xml encoding.


=================Steps to deploy the application==========

1) Download/clone the code base from the Github by using below git url

URL: 

2) Open a command prompt and navigate into project folder.( ex:- C:/Users/hasan/project/adcash/ )

3) Build the springboot project with maven by using the below command

 command: "mvn clean package"

4) Run the springboot application 

with maven command: "mvn spring-boot:run"
OR
with java -jar command:  "java -jar target/adcash-1.0.0.jar"

5) Access Swagger by using the below url

URL: "http://localhost:8080/swagger-ui.html"

* Can change Response Content Type to support "json" or "xml"

6) Check the code coverage by using jacoco report

URL : file:///..../adcash/target/site/jacoco/index.html

===========================================

