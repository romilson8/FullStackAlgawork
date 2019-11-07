web: java -Dserver.port=$PORT -Dspring.profiles.active=prod $JAVA_OPTS -jar target/springboot-angular7-1.0.0.jar --spring.datasource.url=${JDBC_DATABASE_URL}

release: ./mvnw flyway:migrate