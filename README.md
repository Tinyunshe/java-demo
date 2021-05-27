### About debug devops
you can modify this file to testing devops pipeline jobs

src/main/java/io/alauda/demo/controller/DemoController.java

   demos.add(new Demo("Hello",12))

### Build of maven command
$ mvn clean install -Dmaven.test.skip=true --settings settings.xml

### How to access
curl [IP_ADDRESS]:8080/demo