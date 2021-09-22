# Openfeign Maven Mutil Module Archetype

## openfeign-archetype project structure
```bash
openfeign-archetype
    │  pom.xml
    │
    └─src
        └─main
            └─resources
                │  logback.xml
                │
                ├─archetype-resources
                │  │  pom.xml
                │  │
                │  ├─__rootArtifactId__-api
                │  │  │  pom.xml
                │  │  │
                │  │  └─src
                │  │      └─main
                │  │          └─java
                │  │              ├─api
                │  │              │      HelloApi.java
                │  │              │
                │  │              ├─enums
                │  │              │      RespCodeEnum.java
                │  │              │
                │  │              └─model
                │  │                      CommonResult.java
                │  │
                │  ├─__rootArtifactId__-service
                │  │  │  pom.xml
                │  │  │
                │  │  └─src
                │  │      └─main
                │  │          └─java
                │  └─__rootArtifactId__-web
                │      │  pom.xml
                │      │
                │      └─src
                │          └─main
                │              ├─java
                │              │  │  StartUpApplication.java
                │              │  │
                │              │  └─controller
                │              │          HelloController.java
                │              │
                │              └─resources
                │                      application.yaml
                │
                └─META-INF
                    └─maven
                            archetype-metadata.xml
```

## generated project structure 
```bash
generated-project
 │  pom.xml
 │
 ├─generated-project-api
 │  │  pom.xml
 │  │
 │  └─src
 │      └─main
 │          └─java
 │              ├─api
 │              │      HelloApi.java
 │              │
 │              ├─enums
 │              │      RespCodeEnum.java
 │              │
 │              └─model
 │                      CommonResult.java
 │
 ├─generated-project-service
 │  │  pom.xml
 │  │
 │  └─src
 │      └─main
 │          └─java
 └─generated-project-web
     │  pom.xml
     │
     └─src
         └─main
             ├─java
             │  │  StartUpApplication.java
             │  │
             │  └─controller
             │          HelloController.java
             │
             └─resources
                     application.yaml
```

## generate archetype project command
```bash
mvn archetype:generate -DarchetypeGroupId=com.luo.openfeign.archetypes ^
                       -DarchetypeArtifactId=openfeign-archetype ^
                       -DarchetypeVersion=1.0.0-SNAPSHOT ^
                       -DoutputDirectory=D:/luo-demo ^
                       -DgroupId=com.luo.demo ^
                       -DartifactId=openfeign-demo-new ^
                       -Dversion=1.0.0-SNAPSHOT
```