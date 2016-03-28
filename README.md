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

## Enabling Security

* To enable security, add Spring Security starter
```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
```
* Enable Management Security, e.g. `management.security.enabled=true`
* Default user is defined by `security.user.name`, e.g. `user`
* Default password is defined by `security.user.password`, or automatically generated on each application start.
