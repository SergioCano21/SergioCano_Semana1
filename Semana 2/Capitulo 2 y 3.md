## Preguntas del Capitulo 2 de OCP Oracle Certified Professional Java SE 17 Developer Study Guide

### Pregunta 1

**Respuesta:** A, D y G  
**Justificación:** La opción A es la que siempre usamos para comparar booleanos, la D es para negar el valor y la G para hacer el cast a booleano. Las otras opciones no se pueden usar con valores booleanos.

### Pregunta 2

**Respuesta:** A, B y D  
**Justificación:** La suma de un byte y un short se convierte en automatico a un int, por eso la A es correcta. La B y D igual son válidas porque java hace la conversión automatica a long y double.

### Pregunta 3

**Respuesta:** B, C , D y F  
**Justificación:** El código como tal fallaría, por eso las opciones B, C y D son correctas porque convierten el long a int que es el tipo correcto en este caso. La F igual sería la otra opción correcta porque como ear ya es tipo long, lo correcto sería que el resultado igual sea de ese mismo tipo.

### Pregunta 4

**Respuesta:** B  
**Justificación:** La B es la correcta porque se inicializan canine y wolf como true y teeth = 20. Luego en la línea 5 se cambia el valor de canine a false porque el (^) es el comparador XOR que solo da true cuando un valor es true y el otro false, en este caso como se asigna a wolf = false, hace que el XOR regrese true pero quede wolf como false. Al final imprime "true, 20, false".

### Pregunta 5

**Respuesta:** A y C  
**Justificación:** Las correctas son A y C porque siguen el orden en que Java resuelve las operaciones. Java primero evalúa operadores como ! o --, luego multiplicaciones y módulos como _ y %, después sumas como +, luego comparaciones como ==, y al final asignaciones como =. En A, ese orden sí se respeta (+, luego _ y %, y después --). En C, también está bien porque primero va la asignación =, luego la comparación ==, y ! tiene mayor prioridad que ambas. Las demás opciones rompen ese orden.

### Pregunta 6

**Respuesta:** F  
**Justificación:** La correcta es la F porque ninguna opción coincide con el resultado real. Primero, (int) fruit corta los decimales, así que 1.4 pasa a 1 y 1.9 también pasa a 1. Luego se suma con vegetables, que sigue siendo float, entonces quedan 3.4, 5.0 y 6.0. Como ninguna respuesta muestra esos valores exactamente, la opción correcta es None of the above.

### Pregunta 7

**Respuesta:** D  
**Justificación:** La correcta es la D porque primero clear da true, ya que vis > 1 es true y también (vis < 9 || ph < 2) es true. Luego safe da false porque aunque se usa &&, la condición vis > 2 ya es false (2 > 2 es false), así que ph++ > 1 ni siquiera se evalúa y ph sigue en 7. Después en tasty, se hace --ph, entonces ph baja a 6, y 7 <= 6 es false. Por eso el resultado final es true-false-false.

### Pregunta 8

**Respuesta:** A  
**Justificación:** La correcta es la A porque en pig = pig++, el operador pig++ primero devuelve el valor actual (4) y después lo incrementa, pero como ese 4 se vuelve a asignar a pig, al final sigue valiendo 4. Luego goat empieza en 2 y con goat -= 1.0 Java hace la resta y convierte automáticamente el resultado al tipo long, así que queda en 1. Por eso la salida final es 4 - 1.

### Pregunta 9

**Respuesta:** A, D y E  
**Justificación:** Las correctas son A, D y E porque los valores que realmente se imprimen son 4, 5 y 1. En la primera línea, a > 2 es false (2 > 2), así que se ejecuta b++, imprime 4 y luego b pasa a 5. En la segunda, a != c es false porque ambos valen 2, entonces usa b++, asigna 5 a b, imprime 5 y después lo incrementa internamente. En la tercera, a > b es false (2 > 5), así que directamente imprime 1. Por eso los únicos outputs son 1, 4 y 5.

### Pregunta 10

**Respuesta:** G  
**Justificación:** La correcta es la G porque el código no compila. El problema está en esta línea: short zebra = (byte) weight _ (byte) height;. Aunque ambos valores se convierten a byte, en Java las operaciones aritméticas con byte, short y char siempre se promocionan automáticamente a int. Eso significa que el resultado de la multiplicación es un int, y Java no puede guardarlo directamente en un short sin un cast explícito. Debería ser algo como short zebra = (short) ((byte) weight _ (byte) height);.

### Pregunta 11

**Respuesta:** D  
**Justificación:** La correcta es la D porque se respeta el orden de operaciones en Java. Primero se hacen las multiplicaciones y paréntesis: (2 _ 4) da 8 y luego 8 % 3 es 2. En el segundo caso, 3 _ 2 es 6 y 6 % 3 es 0. En el tercero, 1 % 2 es 1 y luego 5 \* 1 es 5. Por eso el resultado final es 2, 0, 5.

### Pregunta 12

**Respuesta:** D  
**Justificación:** La D es correcta porque el post-increment (x++) aumenta el valor pero devuelve primero el valor original, mientras que el pre-decrement (--x) primero disminuye el valor y luego devuelve el nuevo valor ya decrementado.

### Pregunta 13

**Respuesta:** F  
**Justificación:** La correcta es la F porque primero goingToTheStore se evalúa como true ya que sunny & raining da false y luego false ^ sunday (true) da true. Después goingToTheZoo es true porque sunday es true y !raining también es true, entonces true && true = true. Finalmente stayingHome es !(true && true), lo que da false. Por eso el resultado es true-true-false.

### Pregunta 14

**Respuesta:** B, E y G  
**Justificación:** B es correcta porque != sí puede comparar objetos, pero compara referencias, no contenido.
E es correcta porque una asignación devuelve el valor que queda almacenado después de asignar. G es correcta porque ! solo funciona con booleanos, no puede aplicarse a números.

### Pregunta 15

**Respuesta:** D  
**Justificación:** El operador ?: (operador ternario) es el único en Java que toma tres operandos: una condición, un valor si es true y otro si es false. Los demás operadores trabajan con uno o dos operandos, pero no con tres.

### Pregunta 16

**Respuesta:** B  
**Justificación:** La correcta es la B porque solo la primera línea tiene error de compilación: la expresión se promueve a long al sumar con (long) 3, pero se intenta guardar en un int, lo cual no está permitido sin cast explícito. Las demás líneas compilan porque usan conversiones válidas entre tipos o casts correctos.

### Pregunta 17

**Respuesta:** C y F  
**Justificación:** Las correctas son C y F porque ticketsTaken empieza en 1 y en 1 + ticketsTaken++ primero usa el valor actual (1) y luego lo incrementa a 2. Entonces ticketsSold += 1 + 1, o sea 3 + 2 = 5. Después ticketsTaken \*= 2 hace que pase de 2 a 4. Finalmente ticketsSold += (long)1 suma 1 más y queda en 6. Por eso al final ticketsSold es 6 y ticketsTaken es 4.

### Pregunta 18

**Respuesta:** C  
**Justificación:** Los paréntesis () se usan para cambiar el orden de evaluación de una expresión y darle prioridad a ciertas operaciones.

### Pregunta 19

**Respuesta:** B y F  
**Justificación:** Las correctas son B y F porque ++start primero incrementa start de 7 a 8 y luego usa ese valor, así que end += 8 hace que end pase de 4 a 12. Después, Byte.MAX_VALUE vale 127, entonces 127 + 1 = 128, pero al hacer el cast a byte, ese valor se desborda y pasa a -128. Por eso al final start es -128 y end es 12.

### Pregunta 20

**Respuesta:** A, D y E  
**Justificación:** La A es correcta porque los operadores unarios (como ++, --, !) tienen mayor precedencia que los operadores binarios y ternarios, por lo que siempre se ejecutan primero. La D igual es correcta porque el operador post-decremento (--) devuelve el valor antes de aplicar la disminución. Y la E es correcta porque el operador ! es un operador lógico que solo se puede usar con valores booleanos, no con números.

### Pregunta 21

**Respuesta:** E  
**Justificación:** La correcta es la E porque ~ es el operador complemento de bits. Cuando haces ~8, el resultado es -9. Luego plane = -myFavoriteNumber simplemente da -8. Como bird == plane es false (-9 != -8), el operador ternario asigna 10 a superman. Finalmente --superman primero decrementa, así que pasa a 9 y eso es lo que se imprime. El resultado final es -9,-8,9.

## Preguntas del Capitulo 3 de OCP Oracle Certified Professional Java SE 17 Developer Study Guide

### Pregunta 1

**Respuesta:**
**Justificación:**

### Pregunta 2

**Respuesta:**  
**Justificación:**

### Pregunta 3

**Respuesta:**  
**Justificación:**

### Pregunta 4

**Respuesta:**  
**Justificación:**

### Pregunta 5

**Respuesta:**  
**Justificación:**

### Pregunta 6

**Respuesta:**  
**Justificación:**

### Pregunta 7

**Respuesta:**  
**Justificación:**

### Pregunta 8

**Respuesta:**  
**Justificación:**

### Pregunta 9

**Respuesta:**  
**Justificación:**

### Pregunta 10

**Respuesta:**  
**Justificación:**

### Pregunta 11

**Respuesta:**  
**Justificación:**

### Pregunta 12

**Respuesta:**  
**Justificación:**

### Pregunta 13

**Respuesta:**  
**Justificación:**

### Pregunta 14

**Respuesta:**  
**Justificación:**

### Pregunta 15

**Respuesta:**  
**Justificación:**

### Pregunta 16

**Respuesta:**  
**Justificación:**

### Pregunta 17

**Respuesta:**  
**Justificación:**

### Pregunta 18

**Respuesta:**  
**Justificación:**

### Pregunta 19

**Respuesta:**  
**Justificación:**

### Pregunta 20

**Respuesta:**  
**Justificación:**

### Pregunta 21

**Respuesta:**  
**Justificación:**

### Pregunta 22

**Respuesta:**  
**Justificación:**

### Pregunta 23

**Respuesta:**  
**Justificación:**

### Pregunta 24

**Respuesta:**  
**Justificación:**

### Pregunta 25

**Respuesta:**  
**Justificación:**

### Pregunta 26

**Respuesta:**  
**Justificación:**

### Pregunta 27

**Respuesta:**  
**Justificación:**

### Pregunta 28

**Respuesta:**  
**Justificación:**

### Pregunta 29

**Respuesta:**  
**Justificación:**
