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
Run this command to launc all dependencies togheter:
docker-compose -f mongo.yaml -f mysql.yaml -f postgres.yaml -f rabbit.yaml up -d

Or you can launch each one at once:
Example: docker-compose -f mongo.yaml
```

- Second we must download all projects that belongs to this solution
```
So, we must download and run each one of the projetcs below:
- https://github.com/Robertaison/gateway-api (This one)
- https://github.com/Robertaison/scoredata-api
- https://github.com/Robertaison/tracedata-api
- https://github.com/Robertaison/sensitivedata-api
- https://github.com/Robertaison/dataupdate-job
```
- Now, our gateway can consume the services, it only depends of an available mass of data.

##### API Documentation *(By swagger, the apllication must be running)*
> [gateway-api](https://localhost:8084/swagger-ui.html)


