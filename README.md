# PEI-2425

## Programación en entornos interactivos 2024-2025

### Java
> [!DANGER] 
> [Documentación oficial JDK23](https://docs.oracle.com/en/java/javase/23/index.html)


#### Tutoriales online

- [w3schools](https://www.w3schools.com/java)
- [javatpoint](https://www.javatpoint.com/java-tutorial) ⭐⭐⭐⭐⭐
- [codeacademy](https://www.codecademy.com/learn/learn-java)
- [oracle](https://docs.oracle.com/javase/tutorial/getStarted/index.html)
- [programiz](https://www.programiz.com/java-programming) ⭐⭐⭐⭐⭐

#### Índice de Ejemplos

| **Ejemplo**                         | **Descripción**                                                                                      | **Enlace al Ejemplo**                      |
|-------------------------------------|------------------------------------------------------------------------------------------------------|-------------------------------------------|
| `car-example`                       | Ejemplo de uso del modificador `static` para implementar un contador de vehículos compartido entre instancias. | [car-example](./project-example/car-example) |
| `user-example`                      | Ejemplo básico de creación de clases, donde la clase `User` tiene atributos como nombre y edad, con métodos para obtener/modificar estos atributos. | [user-example](./project-example/user-example) |
| `zoo-example`                       | Ejemplo de creación de clases para representar animales en un zoológico. Utiliza clases como `Dog`, `Cat`, `Bird`, etc. | [zoo-example](./project-example/zoo-example) |
| `zoo-inheritance-example`           | Ejemplo de herencia y polimorfismo, donde se crea una superclase `Animal` y subclases como `Dog`, `Cat`, etc. | [zoo-inheritance-example](./project-example/zoo-inheritance-example) |
| `zoo-abstract-example`              | Ejemplo de clase abstracta, donde `Animal` es abstracta y no puede instanciarse directamente, forzando la implementación en subclases. | [zoo-abstract-example](./project-example/zoo-abstract-example) |
| `menu-interface-example`            | Ejemplo que utiliza una interfaz `Menu`, que debe ser implementada por las clases `MenuConsole` y `MenuWindow`. | [menu-interface-example](./project-example/menu-interface-example) |
| `relations/dependency-example`      | Ejemplo que muestra una relación de dependencia entre `Document` y `Printer`. | [relations/dependency-example](./project-example/relations/dependency-example) |
| `relations/association-example`     | Ejemplo que ilustra una relación de asociación entre `Company` y `Worker`. | [relations/association-example](./project-example/relations/association-example) |
| `relations/aggregation-example`     | Ejemplo de una relación de agregación entre `Course` y `Subject`, donde un curso contiene asignaturas. | [relations/aggregation-example](./project-example/relations/aggregation-example) |
| `relations/composition-example`     | Ejemplo de composición entre `Person` y `Heart`, donde el corazón no puede existir sin la persona. | [relations/composition-example](./project-example/relations/composition-example) |
| `io-example`                        | Ejemplo de cómo capturar entrada de texto con `Scanner` y escribir en la consola con `System.out.println`. | [io-example](./project-example/io-example) |
| `file-read-example`                 | Ejemplo de cómo leer un archivo usando `FileReader` y `BufferedReader`. | [file-read-example](./project-example/file-read-example) |
| `exception-example`                 | Ejemplo de manejo de excepciones mediante un bloque `try-catch` para capturar errores. | [exception-example](./project-example/exception-example) |


#### Tipos primitivos

> [!NOTE]
> [ver en w3schools](https://www.w3schools.com/java/java_data_types.asp)

Los **tipos primitivos** son los bloques básicos de datos en Java. Se utilizan para almacenar valores simples, como números enteros o decimales, caracteres o valores booleanos. Son eficientes en cuanto a memoria y son fundamentales para la programación en Java.

| Tipo | Descripción |
| - | - |
| `byte` |	Almacena números enteros entre -128 y 127. |
| `short` |	Almacena números enteros entre -32,768 y 32,767. |
| `int` |	Almacena números enteros entre -2,147,483,648 y 2,147,483,647. |
| `long` |	Almacena números enteros muy grandes. |
| `float` |	Almacena números decimales, suficiente para almacenar hasta 7 dígitos decimales. |
| `double` |	Almacena números decimales, suficiente para almacenar hasta 16 dígitos decimales. |
| `boolean` |	Almacena valores de tipo `true` o `false`. |
| `char` |	Almacena un único carácter o valor ASCII. |

#### Tipos no primitivos

En Java, los **tipos no primitivos** incluyen clases, arrays y Strings, que permiten trabajar con estructuras de datos más complejas.

- **String**: Una secuencia de caracteres.
- **Arrays**: Estructuras de datos que almacenan múltiples elementos de un mismo tipo.
- **Clases**: Plantillas para crear objetos.


#### Clases Wrapper

> [!NOTE]
> [ver en w3schools](https://www.w3schools.com/java/java_wrapper_classes.asp)

| Tipo de dato primitivo | Clase Wrapper |
| - | - |
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `boolean` | `Boolean` |
| `char` | `Character` |

#### Modificadores

> [!NOTE]
> [ver en w3schools](https://www.w3schools.com/java/java_modifiers.asp)

Los **modificadores** controlan la accesibilidad y el comportamiento de los atributos, métodos y clases. Ayudan a gestionar la visibilidad y el acceso a los elementos dentro de un programa.

- **`public`**: El atributo, método o constructor puede ser accedido desde cualquier clase.
- **`private`**: El atributo, método o constructor solo puede ser accedido dentro de la clase que lo declara.
- **`protected`**: El atributo, método o constructor es accesible dentro de la misma clase, en las clases del mismo paquete y en subclases. Esto proporciona un nivel de acceso intermedio, útil para herencia.
- **`static`**: Los métodos y atributos estáticos son compartidos entre todas las instancias de una clase. No es necesario crear un objeto para acceder a estos elementos.

> [!NOTE]
> [car-example](./project-example/car-example): En este ejemplo, se utiliza el modificador `static` para implementar un contador de vehículos, que es compartido entre todas las instancias de la clase `Car`.


#### Estructuras de control

- Condicionales: `if`, `else if`, `else`, `switch`
- Bucles: `for`, `while`, `do while`

#### Programación orientada a objetos

##### Abstracción
La abstracción consiste en ocultar los detalles de implementación y mostrar únicamente la funcionalidad esencial de un objeto.

##### Encapsulación
La encapsulación implica restringir el acceso directo a algunos de los componentes de un objeto, protegiendo su integridad mediante métodos públicos.

##### Herencia
La herencia permite que una clase adquiera las propiedades y comportamientos de otra clase, promoviendo la reutilización de código.

##### Polimorfismo
El polimorfismo permite a los objetos de diferentes clases ser tratados como objetos de una clase común, especialmente a través de métodos sobreescritos.

> [!NOTE]
> [zoo-inheritance-example](./project-example/zoo-inheritance-example): En este ejemplo se demuestra cómo la herencia y el polimorfismo permiten crear una superclase `Animal` con comportamientos comunes, mientras que las subclases como `Dog`, `Cat`, `Capybara`... definen comportamientos específicos para cada tipo de animal.


##### UML

> [!NOTE]
> [point.mdj](./project-example/point.mdj): Diagrama UML del ejemplo de `coords-example`, mostrando la relación entre las clases `Point` y `Point2`.

> [!NOTE]
> [zoo.mdj](./project-example/zoo.mdj): Diagrama UML para el ejemplo de `zoo-example`, ilustrando la estructura de clases `Dog`, `Bird`, `Cat`...

##### Clases y Objetos

- **Clases**: Plantillas o moldes que definen las propiedades (atributos) y comportamientos (métodos) de un tipo de objeto.
- **Objetos**: Instancias concretas de una clase, que tienen sus propios valores para los atributos definidos en la clase.


> [!NOTE]
> [user-example](./project-example/user-example): Este ejemplo se utiliza para practicar la creación de clases en Java. La clase `User` tiene atributos como nombre y edad, y métodos para obtener y modificar estos atributos.

> [!NOTE]
> [zoo-example](./project-example/zoo-example): Este ejemplo se utiliza para practicar la creación de clases en Java. Se utilizan clases como `Dog`, `Cat`, `Bird`.


##### Relaciones entre clases

###### Dependencia

La dependencia es una relación en la que una clase utiliza a otra para realizar una tarea específica de manera puntual.

> [!NOTE]
> [relations/dependency-example](./project-example/relations/dependency-example): Aquí se presenta una relación de dependencia entre `Document` y `Printer`. 

###### Asociación

La asociación es una relación estructural entre dos clases donde una clase conoce o se comunica con otra.

> [!NOTE]
> [relations/association-example](./project-example/relations/association-example): Este ejemplo demuestra una relación de asociación entre `Company` y `Worker`.

###### Agregación

La agregación es una forma especial de asociación que representa una relación "todo-parte" donde las partes pueden existir independientemente del todo.

> [!NOTE]
> [relations/aggregation-example](./project-example/relations/aggregation-example): En este ejemplo, se implementa una relación de agregación entre `Course` y `Subject`.

###### Composición

La composición es una forma fuerte de agregación donde las partes no pueden existir sin el todo; su ciclo de vida depende del objeto principal.

> [!NOTE]
> [relations/composition-example](./project-example/relations/composition-example): En este ejemplo, `Person` tiene un `Heart`. El corazón no puede existir sin la persona.

| Relación       | Descripción breve                                                                 | Ejemplo típico                | Independencia de objetos |
|----------------|------------------------------------------------------------------------------------|--------------------------------|---------------------------|
| Dependencia    | Una clase usa otra temporalmente para cumplir una función.                         | Una impresora imprime un documento. | Sí                       |
| Asociación     | Una clase conoce a otra y puede interactuar con ella.                              | Un trabajador asociado a una empresa. | Sí                       |
| Agregación     | Relación "todo-parte" donde las partes pueden vivir independientemente del todo.   | Un curso contiene asignaturas. | Sí                       |
| Composición    | Relación "todo-parte" fuerte; las partes no existen sin el todo.                   | Una persona tiene un corazón.  | No                        |


##### Clases abstractas

Las **clases abstractas** son clases que no pueden ser instanciadas directamente. Se utilizan para proporcionar una estructura base con algunos métodos implementados, mientras que otros métodos pueden ser declarados como abstractos, obligando a las subclases a implementarlos. Las clases abstractas permiten compartir funcionalidad común mientras se deja la implementación específica para las subclases.


> [!NOTE]
> [zoo-abstract-example](./project-example/zoo-abstract-example): Este ejemplo agrega el concepto de clase abstracta, donde `Animal` se convierte en una clase abstracta, lo que impide la creación de instancias directas de `Animal`, forzando la implementación en las subclases.

> [!NOTE]
> [menu-abstract-example](./project-example/menu-abstract-example): Introduce el concepto de clase abstracta. `Controller` se acopla a la clase abstracta y tiene dos clases derivadas: `MenuConsole` y `MenuWindow`, que implementan diferentes comportamientos usando `Scanner` y `System.out`.

##### Interfaz

Una **interfaz** es un contrato que define un conjunto de métodos que deben ser implementados por las clases que la implementan. A diferencia de las clases abstractas, las interfaces no pueden contener implementación de métodos (excepto en versiones recientes de Java donde los métodos predeterminados son permitidos), y no pueden tener estado (propiedades). Las interfaces son útiles para garantizar que diferentes clases implementen métodos similares, proporcionando flexibilidad y una estructura clara.

> [!NOTE]
> [menu-interface-example](./project-example/menu-interface-example): Este proyecto refina el ejemplo anterior utilizando una interfaz `Menu` en lugar de una clase abstracta. La interfaz define los métodos que deben ser implementados por las clases `MenuConsole` y `MenuWindow`.


| Característica        | Clase normal                  | Clase abstracta                 | Interfaz                          |
|------------------------|--------------------------------|----------------------------------|-----------------------------------|
| Instanciación          | Sí                             | No                               | No                                |
| Métodos implementados  | Sí                             | Puede tener métodos implementados| No (solo define la firma)         |
| Herencia/Implementación| Se puede heredar               | Debe ser heredada para usarse    | Debe ser implementada             |
| Estado (Atributos)             | Sí                             | Sí                               | No (solo constantes, si acaso)    |
| Herencia múltiple      | No                             | No                               | Sí (una clase puede implementar varias) |



#### IO

##### User Output: System.out.println

`System.out.println` es uno de los métodos más comunes en Java para mostrar salida en la consola. Permite imprimir texto o el valor de variables de forma fácil, ayudando a realizar depuración o mostrar mensajes al usuario.

> [!NOTE]
> [io-example](./project-example/io-example): Este proyecto demuestra cómo capturar entrada de texto desde la consola utilizando `Scanner` y cómo escribir en la consola con `System.out.println`.

##### User Input: Scanner

La clase `Scanner` en Java se utiliza para leer la entrada del usuario desde diferentes fuentes, como la consola. Se emplea comúnmente para capturar datos introducidos por el usuario durante la ejecución de un programa.

> [!NOTE]
> - [ver en w3schools](https://www.w3schools.com/java/java_user_input.asp)
> - [ver en la documentación oficial](https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Scanner.html)

> [!NOTE]
> [io-example](./project-example/io-example): Este proyecto demuestra cómo capturar entrada de texto desde la consola utilizando `Scanner` y cómo escribir en la consola con `System.out.println`.


##### File Input: FileReader

El manejo de archivos es crucial cuando se trabaja con datos persistentes. Java proporciona varias clases para leer archivos, como `FileReader` y `BufferedReader`. `FileReader` es una clase en Java utilizada para leer archivos de texto. Permite acceder a un archivo desde el sistema de archivos y leer su contenido, devolviendo los caracteres leídos uno por uno o en bloques.

> [!NOTE]
> [file-read-example](./project-example/file-read-example): Este proyecto muestra cómo leer un archivo de texto utilizando `FileReader` y `BufferedReader`.

##### File Output: FileWriter

Asimismo, Java proporciona varias clases para escribir archivos, como `FileWriter` y `BufferedWriter`. `FileWriter` es una clase de Java usada para escribir caracteres en un archivo. Permite generar archivos de texto y escribir datos en ellos de manera eficiente, combinada con BufferedWriter para mejorar el rendimiento en la escritura de grandes cantidades de datos.

#### Excepciones

Las **excepciones** son eventos inesperados que interrumpen el flujo normal del programa. Java proporciona una jerarquía de excepciones para manejar diferentes tipos de errores.

> [!NOTE]
> [exception-example](./project-example/exception-example): Este ejemplo ilustra cómo manejar excepciones mediante un bloque `try-catch`. Si ocurre un error en el proceso, como una entrada incorrecta, se captura y se maneja de manera controlada.

#### GSON

La librería Gson es una herramienta de Google que permite convertir objetos Java en su representación JSON y viceversa. Esto facilita la interacción con datos JSON, como cuando se trabaja con APIs o se manejan archivos JSON. Gson es especialmente útil en aplicaciones que necesitan integrar datos externos de manera eficiente.

> [!NOTE]
> [gson-example](./project-example/gson-example): Este ejemplo utiliza la librería `Gson` para leer un archivo JSON y mapearlo automáticamente a un modelo.



