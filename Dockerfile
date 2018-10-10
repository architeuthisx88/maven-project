# Starting from base image tomcat8
FROM tomcat:8.0

# Add the war file generated in jenkins to a specific location in the docker image
ADD  ./webapp/target/*.war /usr/local/tomcat/webapps/

# 
EXPOSE 8080

# Run tomcat
CMD ["catalina.sh", "run"]