## Green Hand Community

## Deployment
- Git
- JDK
- Maven
- MySQL

配置 Maven 数据库连接时在 ```~/.m2/settings.xml``` 里配置 ```production``` 环境.<br>
部署时需要复制一份 ```application.properties``` 并接上 ```-production```的后缀使用下面的命令运行.
```shell script
$ ps aux | grep java
$ mvn clean compile flyway:migrate package -P production
$ setsid java -jar -Dspring.profiles.active=production target/community-0.0.1-SNAPSHOT.jar
```

## Resource
- [Spring Document](https://spring.io/guides)
- [Spring Web Guides](https://spring.io/guides/gs/serving-web-content)
- [ElasticSearch Community](https://elasticsearch.cn/explore)
- [Bootstrap Document](https://v3.bootcss.com/getting-started/)
- [Spring boot - Mybatis](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
- [Spring boot doc - embedded database connection pool](https://docs.spring.io/spring-boot/docs/2.1.13.BUILD-SNAPSHOT/reference/html/boot-features-sql.html)
- [Thymeleaf](https://www.thymeleaf.org/doc/tutorials/2.1/usingthymeleaf.html)
- [Spring Dev Tools + LiveReload](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html) Auto deploy. 1. IDEA -> Preferences -> Build, Execution, Deployment -> Compiler -> Build Project automatically; 2. IDEA -> shift + command + option + / -> Registry -> compiler.automake.allow.when.app.running 
- [Spring MVC](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc)

- [MyBatis Generator](https://mybatis.org/generator/running/runningWithMaven.html)
```shell script
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```

- [Markdown Editor](https://pandao.github.io/editor.md/index.html)

### Github login
- [Github OAuth App](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)
- [Flyway database migration](https://flywaydb.org/getstarted/firststeps/maven)
- [Lombok](https://projectlombok.org/)

## Tool
- Git
- Meavn
- Postman (chrome plugin - tabbed postman)

## Objectives
- MVC Framework
- UI - Bootstrap
- database for logging in
- bug/log tracker