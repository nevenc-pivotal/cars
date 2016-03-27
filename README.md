# cars

Example cars application with "vechicles" REST repository.


## Build Application

```
mvn clean package
```

## Run Application

```
java -jar target/cars-0.0.1-SNAPSHOT.jar
```

## Run Application with SSL (self-signed certificate)

```
java -Dspring.profiles.active=self-ssl -jar cars-0.0.1-SNAPSHOT.jar
```

## Run Application with SSL (real certificate)

```
java -Dspring.profiles.active=real-ssl -jar cars-0.0.1-SNAPSHOT.jar
```
