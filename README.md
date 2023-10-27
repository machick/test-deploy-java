# TrabajoPracticoIntegrador
Trabajo de fin de carrera Unlam 2023
mvn -B package --file pom.xml -DskipTests
mvn --batch-mode --update-snapshots verify -DskipTests

java -jar 

https://help.hcltechsw.com/commerce/9.1.0/admin/tasks/tigpatch.html

mvn -B package --file tpi/pom.xml -DskipTests -Pprod
docker cp tpi/target/tpi-0.0.1-SNAPSHOT.jar java-v1:/usr/local/lib/app.jar
docker restart java-v1