FROM ubuntu:18.04
#复制并解压jdk
ADD ./jdk-8u221-linux-x64.tar.gz /opt/
#配置jdk环境
ENV JAVA_HOME /opt/jdk1.8.0_221/
ENV CLASSPATH ${JAVA_HOME}/lib;${JAVA_HOME}/jre/lib
ENV PATH $JAVA_HOME/bin:$PATH

#WORKDIR /opt/
#RUN apt update && apt install wget -y && wget https://mirrors.bfsu.edu.cn/apache/tomcat/tomcat-9/v9.0.37/bin/apache-tomcat-9.0.37.tar.gz && tar -zxvf apache-tomcat-9.0.37.tar.gz
#COPY ./homework.war /opt/apache-tomcat-9.0.37/webapps/

#已经spirng内置有tomcat了
COPY ./spring-project.jar /
#给权限给容器操作
RUN chmod 777 /spring-project.jar
CMD ["java","-jar","spring-project.jar"]