FROM tomcat:8.5.20-jre8-alpine
USER root
ADD target/user-meeting /usr/local/tomcat/webapps/
EXPOSE 8082
VOLUME /usr/local/tomcat/webapps/
CMD ["catalina.sh", "run"]