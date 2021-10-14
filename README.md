# gateway-api

#### Is a Java Web API that is responsible for exposing a person's data based on a query by cpf.

### *Technologies:*

- Java 11
- Spring
- Lombok
- OpenFeign
- Swagger

### Instructions
- First we must launch the infrastructure of enviroment
```
We need access "Docker" directory and run the following command to launch all dependencies:
docker-compose -f mongo.yaml -f mysql.yaml -f postgres.yaml -f rabbit.yaml up -d

Or you can launch each one at once with the following command:
Example: docker-compose -f mongo.yaml
```

- Second we must download all projects that belongs to this solution
```
So, we must download and run each one of the projetcs below:
- First one: https://github.com/Robertaison/dataupdate-job  
- After that, we need to post some data to build rabbit structure (needs fix)
(It must be the first one because it'll create de queue structures used by others services)
- To check how do posts look at "Read me"
```

- Third, we must download the others projects used on solution
```
- https://github.com/Robertaison/gateway-api (This one)
- https://github.com/Robertaison/scoredata-api
- https://github.com/Robertaison/tracedata-api
- https://github.com/Robertaison/sensitivedata-api
```
- Finally, our gateway can consume the services, it'll only depends on an available mass of data.

##### API Documentation *(By swagger, the apllication must be running)*
> [gateway-api](https://localhost:8084/swagger-ui.html)


