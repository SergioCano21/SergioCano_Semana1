## Preguntas del Capitulo 1 de OCP Oracle Certified Professional Java SE 17 Developer Study Guide

### Pregunta 1

**Respuesta:** D y E  
**Justificación:** La E es la manera correcta de escribir el método main y la D simplemente le agrega el modificador final que ya lo es por defecto.

### Pregunta 2

**Respuesta:** C, D y E  
**Justificación:** Ninguna opción donde la declaración de la clase esté por encima de el import o el package es correcta. El orden cuando hay import y package es import, luego package.

### Pregunta 3

**Respuesta:** A y E  
**Justificación:** Claramente Bunny es una clase y bun es la referencia a un objeto de esa clase. Las otras declaraciones estan incorrectas.

### Pregunta 4

**Respuesta:** B, E y G  
**Justificación:** Estos son los unicos que contienen caracteres validos, los otros son o una palabra reservada, o tienen un punto y la F no se puede porque inicia con un número.

### Pregunta 5

**Respuesta:** A, D y F  
**Justificación:** El objeto en la linea 9 (brownBear) se puede ir en el garbage collection hasta la linea 13 en que se cambia la referencia a null, el objeto en la linea 10 (polarBear) se sigue podiendo ver hasta la linea 13 que brownBear se cambia a null y el garbage collector no está garantizado que corra.

### Pregunta 6

**Respuesta:** F  
**Justificación:** Las variables dentro de las llaves no son accesibles fuera de ellas, tampoco la variable declarada dentro del ciclo for. Son 2 en la línea 3, 1 de la lína 4, la variable que viene como parametro, 1 de la línea 6 y de la línea 9 y 10. En total 7.

### Pregunta 7

**Respuesta:** C y E  
**Justificación:** La C se puede ver claramente al final del texto y en la segunda línea se ve el espacio con el que inicia. Al ser """ """ imprime solo texto. La A y B no son verdad porque no imprimen 0 dado que no estan ni inicializadas las variables, el código compila y no incluye una línea en blanco.

### Pregunta 8

**Respuesta:** B, D, E y H  
**Justificación:** La A no es porque no puedes inicializar un var con null. La C no se puede porque no puedes pasar un int a null. La F tampoco porque todas las var deben inicializarse y G está mal porque no se pueden inicializar dos variables con var en la misma línea.

### Pregunta 9

**Respuesta:** E  
**Justificación:** La opción A no es correcta porque el default es 0.0. La B igual es incorrecta porque el char no puede ser default null. La C y D son incorrectas porque las variables locales no tienen default. La F es incorrecta igual porque las variables de clase (static) que no están inicializadas por default son null.

### Pregunta 10

**Respuesta:** A, E y F  
**Justificación:** Los "\_" se pueden poner en una variable numerica siempre y cuando no se pongan ni al inicio, ni al final, ni a la par de el punto decimal.

### Pregunta 11

**Respuesta:** E  
**Justificación:** Se pueden quitar los 4 imports porque ninguno es necesario para la ejecución del programa. El import de la clase Water no es necesaria porque están dentro del mismo paquete.

### Pregunta 12

**Respuesta:** A, C y D  
**Justificación:** Se genera error en la línea dos porque no puedes inicializar dos variables de diferente tipo en la misma línea. La C es correcta porque en Java no se pueden inicializar los parametros donde se definen. La D igual es correcta porque la variable fins solo existe dentro del bloque de código en la línea 3.

### Pregunta 13

**Respuesta:** A, B, y C  
**Justificación:** A es correcta porque ahí el Java agarra la clase de aquarium.Water. La B igual es correcta porque el Java agarra primero la clase declarada package.Water antes que el wildcard con \*. La C es lo mismo que la opción B y por eso es correcta. Las D y E son incorrectas porque Java no sabría cual de los dos agarrar.

### Pregunta 14

**Respuesta:** A, B, D y E  
**Justificación:** La opción A es correcta porque se está intentando inicializar una variable short con un long. Lo mismo con la B que está intentando inicializar el int con un double. La D y E igual causan error porque el short e int no tienen la funcion length() porque son primitivos.

### Pregunta 15

**Respuesta:** C, E y F  
**Justificación:** La A no es correcta porque no hay manera de garantizar que el garbage collector corra. La B tampoco es correcta por lo mismo de que no hay garantía de que corra el garbage collector. Igual la D no es correcta por lo mismo. La G igual es incorrecta porque el que sea final no garantiza que no se deje de utilizar la variable y que el garbage collector se lo pueda llevar.

### Pregunta 16

**Respuesta:** A y D  
**Justificación:** La opción A es correcta porque solo hay dos líneas, el \ significa que evite el salto de línea. Y la D igual es correcta porque \s significa que mantenga el espacio en blanco.

### Pregunta 17

**Respuesta:** D, F y G  
**Justificación:** El código funciona correctamente, la D es correcta porque el valor default de boolean es false. La F es igual correcta porque String al ser objeto cuando no se inicializa por default es null. Y la G igual es buena porque así se imprime el float por default.

### Pregunta 18

**Respuesta:** B, C y F  
**Justificación:** La A es incorrecta porque no se puede usar var en un constructor o como parametro en un método. La D es incorrecta igual porque no se pueden declarar multiples variables en una sola línea. La E es incorrecta porque el valor de la variable var sí puede cambiar durante la ejecución del programa. La G igual es incorrecta porque var no es una palabra reservada en Java.

### Pregunta 19

**Respuesta:** A y D  
**Justificación:** La A convierte el String a Long y la B convierte al objeto Long. El código compila bien y al ambos valores ser convertidos a 100 por eso el valor máximo en la comparación es 100.

### Pregunta 20

**Respuesta:** C  
**Justificación:** La línea 4 es un método no el constructor por el void, por lo que nunca se inicializan las variables y se quedan como color = null y age = 0. La única salida correcta en las respuestas es la C porque al igualar p a q las salidas terminarian siendo igual para ambas siendo (q o p).color = null y (q o p).age = 0.

### Pregunta 21

**Respuesta:** D  
**Justificación:** La opción correcta es la D porque primero se imprime dentro de main "7-", luego se instancia el objeto y se ejecutan los fragmentos de código dentro de las llaves, estos imprimen "0-", luego dentro del constructor se imprime "2-", finalmente al haberse seteado en 4 el count en el constructor el último valor a imprimirse es "4-". Resultado: "7-0-2-4-".

### Pregunta 22

**Respuesta:** C, F y G  
**Justificación:** A es incorrecto porque la variable inicia con A mayuscula. La B igual incorrecta porque esta seteando un 9 Long a un int. La C y la F son correctas porque 0x respresenta hexadecimales y 0b binario, estos sí se pueden setear a int. La D igual incorrecta porque tiene punto decimal con un 0 despues. La E y la H tienen un "\_" antes o después del punto decimal por lo que da error. La G es válida.

### Pregunta 23

**Respuesta:** A y D  
**Justificación:** La línea 3 da error porque se declaró como float pero al pasar el 50.0 sin la f significa que es un double y causa el error. La línea 10 genera error igual porque depth está dentro del ciclo for, por lo que no es accesible al println de la línea 10. Al tener estos fallos el programa no alcanza a imprimir las opciones de la E-H
