#!/bin/bash
name=$1
version=$2
container_id=`docker ps -a | grep "advantageonlineshopping/aos-${name}:${version}" | awk '{print $1}'`
docker cp /root/HPEAppPulseJava_1.60_AdvantageOnlineShopping.zip ${container_id}:/usr/local/tomcat
docker exec ${container_id} bash -c 'unzip HPEAppPulseJava_1.60_AdvantageOnlineShopping.zip; java -jar AppPulseJavaAgent/lib/AppPulseAgent.jar setup; ./bin/shutdown.sh; ./bin/startup.sh'