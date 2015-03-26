Jade Project
========

Proyecto de ejemplo Jade para IA

Para ejecutarlo es necesario tener instalado maven:
mvn "-Dexec.args= -classpath %classpath jade.Boot -gui -agents test:ar.edu.utn.ia.jadeproject.TestAgent" -Dexec.executable=java org.codehaus.mojo:exec-maven-plugin:1.2.1:exec