# Prueba de Resuelve Ingeniería
Este archivo define los pasos a seguir para poder ejecutar el proyecto correctamente que se describe [aqui](https://github.com/resuelve/prueba-ing-backend?fbclid=IwAR0ZCxaQXdXP7d0m8q7hl0dSUjDut_rH1696LlrGxq92mPAy4Ul8dgEsrjw).

## Requisitos
El proyecto se realizó usando las siguientes tecnologías:

```
 Java JDK 1.8.0_201 
 Maven
 IDE (Opcional)
```

Antes de correr el proyecto asegúrese de instalar las siguientes tecnologías, si quiere compilar el proyecto,
ya que el proyecto se desarrolló en el S.O. Windows 10.

## Instalar 
* [Instalar Java](https://www.ecodeup.com/descargar-instalar-java-8/) - Tutorial como intalar y configurar correctamente Java
* [Instalar Maven](https://www.mkyong.com/maven/how-to-install-maven-in-windows/) - Tutorial como instalar y configurar correctamente Maven
* [* Descargar IDE Eclipse](https://www.eclipse.org/downloads/) - (Opcional)Descargar IDE Eclipse si quiere modificar código fuente

### Como compilar el proyecto 

Después de Instalar  y configurar las tecnologías correctamente, ir al repositorio del [Proyecto](https://github.com/pumasbra/pruebaVer.git)
Y Descargar el proyecto. O si lo desea clonarlo si tiene instalado Git es su computadora, clonarlo con la instrucción:

```
git clone https://github.com/pumasbra/pruebaVer.git
```

Posteriormente ir a la carpeta base del proyecto y por línea de comandos **CMD**, donde se encuentra el archivo **pom.xml**  escribir el siguiente comando:

```
mvn compile assembly:single
```

Esto generara una nueva carpeta TARGET y encontrara adentro un archivo llamado: **resuelveExercise.jar** 
Mediante CMD navegar hasta la misma carpeta donde se encuentre el jar y ejecutar el comando:

```
java -jar resuelveExercise.jar
```

Esto ejecutara el programa pra calcular los salarios  y creara el archivo **output.json** 

**Antes de ejecutar el programa asegúrese que el archivo input.json este en la misma carpeta que el jar**

#### Correr el proyecto
Para correr el proyecto sin compilarlo solo descargar el archivo .jar [Link](https://github.com/pumasbra/pruebaVer.git).
Y desde CMD use el comando que se dijo anteriormente, sin olvidar el archivo input.json.
