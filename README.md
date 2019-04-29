# Prueba de Resuelve Ingenieria
Este archivo define los pasos a seguir para poder ejecutar el proyecto correctamente que se decribe [aqui](https://github.com/resuelve/prueba-ing-backend?fbclid=IwAR0ZCxaQXdXP7d0m8q7hl0dSUjDut_rH1696LlrGxq92mPAy4Ul8dgEsrjw).

## Requisitos
El proyecto se realizo usando las siguientes tecnologias

```
 Java JDK 1.8.0_201 
 Maven
 IDE (Opcional)
```

Antes de correr el proyecto asegurece de instalarlos el proyecto se probo y desarrollo en Windows 10.

## Instalar 
* [Instalar Java](https://www.ecodeup.com/descargar-instalar-java-8/) - Tutorial como intalar y configurar correctamente Java
* [Instalar Maven](https://myhanoli.com/2018/06/23/como-instalar-maven-en-windows/) - Tutorial como intalar y configurar correctamente Maven
* [* Descargar IDE EClipse](https://www.eclipse.org/downloads/) - (Opcional)Descargar IDE Eclipse si quiere modificar codigo fuente

### Como compilar el proyecto 

Despues de Instalar correctamente las dependencias ir al repositorio del [Proyecto](https://github.com/pumasbra/pruebaVer.git)
Descargar el proyecto o clonarlo con las instrucciones:

```
git clone https://github.com/pumasbra/pruebaVer.git
```

Posteriormente ir a la carpeta base por linea de comandos **CMD**, donde se encuentra el archivo **pom.xml** y  escribir el siguiente comando:

```
mvn compile assembly:single
```
Esto generara una nueva carpeta TARGET y encontrara adentro un archivo llamado : **resuelveExercise.jar** 
Mediante CMD navegar hasta la misma carpeta donde se encuentre el jar y ejecutar el comando:

```
java -jar resuelveExercise.jar
```

Esto ejecutara el programa pra calcular los salarios  y creara el archivo **output.json** 

**Antes de ejecutar el programa asegurese que el archivo input.json este en la misma carpeta que el jar**

#### Correr el proyecto
Para correr el proyecto sin compilarlo solo descar el archivo .jar [Link](https://github.com/pumasbra/pruebaVer.git)
Y desde CMD use comando que se dijo anteriormente sin olvidar el archivo input.json
