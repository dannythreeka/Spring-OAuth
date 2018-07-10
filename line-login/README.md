# Line 
https://developers.line.me/en/
## Technology Stack

Line Linkage Web runs on/with:

Tool        | Version   | URL
-----------:| :-------- |:-------:
JDK         | 1.8.0.101 or newer | [Link](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html "link")
Gradle      |    2.14.1 or newer| [Link](https://gradle.org/releases/ "link")
Spring Session |    1.3.1.RELEASE | [Link](https://projects.spring.io/spring-session/ "link")
Spring Boot  | 	  1.5.8.RELEASE | [Link](https://projects.spring.io/spring-boot/ "link")


Line Linkage Web dependency:

Tool        | Version   | URL
-----------:| :-------- |:-------:
lombok | 1.16.18 | [Link](https://projectlombok.org/ "link")
JWT | |[Link](https://jwt.io/ "link")
LINE Login | v2.1 | [Link](https://developers.line.me/en/docs/line-login/overview/ "link")

*Intellij and Eclipse user might need to install lombok in advance

## Build

We build Line Linkage web application (jar file)
```
gradle clean build
```