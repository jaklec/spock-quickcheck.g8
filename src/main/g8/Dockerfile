from dockerfile/java:oracle-java8

RUN mkdir -p /opt/
ADD build/libs/$project_name$-all.jar /opt/

CMD java -jar /opt/$project_name$-all.jar
