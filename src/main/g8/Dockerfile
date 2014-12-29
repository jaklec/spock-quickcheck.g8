from dockerfile/java:oracle-java8

RUN mkdir -p /opt/
ADD build/libs/$project.name$-all.jar /opt/

CMD java -jar /opt/$project.name$-all.jar
