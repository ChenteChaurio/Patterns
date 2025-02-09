**INTEGRANTES**  
Daniel Alejandro Diaz Camelo.  
Vicente Garzon Rios.  

**INVESTIGACION**
1. El parametro "package" es una fase, es decir un paso en el ciclo de vida del desarrollo. Tiene como objetivo tomar el codigo compilado y lo empaqueta en un formato distribuible, como JAR. Otros parametros que se pueden enviar al comando mvn son: validate, compile, test, integration-test, verify, install, deploy, clean, site.  
2. Para ejecutar un proyecto Maven desde linea de comando se usa el siguiente comando: mvn exec:java -Dexec.mainClass="\<ruta de la clase principal>". Para enviar parametros, se  agrega -Dexec.args="\<argumento>". Si el argumento contiene espacios, es necesario encerrarlo entre comillas simples (''), de lo contrario, se interpretará como varios parámetros separados por espacios.  

**PREGUNTAS**  
1. Utilizamos Simple Fabric, la mejor es Factory Method porqué es extendible, y cada nueva fabrica mantiene su propio objetivo, manteniendo el codigo limpio.
2. Solo funciona correctamente cuando utilizamos el parametro Hexagon, debido a que es un parametro valido.

**PASOS**
1. Verificamos la version de Maven
![alt text](assets/maven_version.png)
2. Creamos el entorno  
![alt text](assets/environment_creation.png)
3. Creamos el proyecto en Maven
![alt text](assets/maven_creation.png)
4. Verificamos el conjunto de archvios y directorios del proyecto creado
![alt text](assets/cmd_tree.png)
5. Modificamos las propiedades del archvio Pom
![alt text](assets/properties_pom.png)
6. Compilamos el proyecto Maven 
![alt text](assets/mvn_package.png)  
7. Añadimos el plugin para el ejecutable en pom 
![alt text](assets/plugin_pom.png)  
8. Ejecutamos la clase App.java, la cual usamos como parametro en "mainClass"
![alt text](assets/mvn_clean_package.png)  
![alt text](assets/mvn_package2.png)  
![alt text](assets/mvn_exec.png) 
9. Realizamos el metodo personalizado  
![alt text](assets/personalized_greeting.png)  
10. Ejecutamos nuevamente la clase sin parametros  
![alt text](assets/without_parameter.png)  
11. Ejecutamos la clase con el nombre como parametro  
![alt text](assets/with_parameter.png)  
12. Ejecutamos la clase con el nombre y apellido como parametro, el cual solo imprime el nombre ya que toma nomas el primer argumento (Lee el nombre y apellido como dos parametros)
![alt text](assets/with_parameter2.png)  
13. Ejecutamos la clase  con el nombre y apellido usando parametro compuesto para que imprima todo (Lee el nombre y apellido como un solo argumento)  
![alt text](assets/with_parameter3.png)  
14. Creamos el paquete edu.eci.cvds.patterns.shapes y el paquete edu.eci.cvds.patterns.shapes.concrete  
![alt text](assets/pkg_shapes.png)  
![alt text](assets/pkg_concrete.png)  
15. Creamos la interfaz Shape  
![alt text](assets/shape_interface.png)  
16. Creamos la enumeracion RegularShapeType  
![alt text](assets/RegularShapeType_enum.png)  
17. Creamos las diferentres clases de figuras.
![alt text](assets/triangle_class.png)
![alt text](assets/quadrilateral_class.png)
![alt text](assets/pentagon_class.png)
![alt text](assets/hexagon_class.png)  
18. Creamos la clase ShapeMain.
![alt text](assets/ShapeMain_Class.png)  
19. Creamos la clase ShapeFactory con su respectivo switch case.
![alt text](assets/ShapeFactory_Class.png)  
20. Modificamos el pom para poder ejecutar ShapeMain como la clase principal.
![alt text](assets/Pom_MainCalss.png)  
21. Ejetuamos la clase con las diferentes figuras correspondientes.
![alt text](assets/Cmd1.png)  
![alt text](assets/Cmd2.png)  
22. Ejecutamos las pruebas requeridas previamente.
![alt text](assets/prueba1.png)
![alt text](assets/prueba2.png)