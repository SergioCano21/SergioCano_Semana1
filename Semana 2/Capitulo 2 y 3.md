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

**Respuesta:** A, B, C, E, F y G  
**Justificación:** Un switch en Java permite tipos como int, byte, short, char, sus wrappers, además de String y enum. También acepta var, pero solo porque en tiempo de compilación Java infiere el tipo real; es decir, var funciona siempre que el tipo inferido sea uno válido para switch. En cambio, long y double no están soportados.

### Pregunta 2

**Respuesta:** B  
**Justificación:** La correcta es la B porque primero humidity se calcula como -4 + (4 \* 3) = 8. Luego temperature >= 4 es true, así que entra al primer if. Después humidity < 6 es false, por lo que se ejecuta el else más cercano (el del segundo if) y se imprime "Just Right".

### Pregunta 3

**Respuesta:** A, D, F y H  
**Justificación:** Un for-each en Java solo funciona con arrays o colecciones que se pueden recorrer, por eso Double[][] y char[] son válidos porque son arrays, y List y Set también porque Java sabe cómo iterarlos. En cambio, Map no sirve directamente porque no es iterable por sí mismo (hay que usar entrySet()), y tipos como Object, String o Exception no funcionan porque no son ni arrays ni estructuras que Java pueda recorrer automáticamente.

### Pregunta 4

**Respuesta:** F  
**Justificación:** El código no compila porque el switch expression no cubre todos los valores posibles de int. Le falta un default para esos casos. Sin default, el compilador no sabe qué valor darle a type y marca error.

### Pregunta 5

**Respuesta:** E  
**Justificación:** El código tiene una línea que no compila: el System.out.print(b + ", ") después del continue en el segundo for. El compilador detecta que esa línea es unreachable (inalcanzable) porque el continue siempre salta al inicio del loop antes de llegar ahí, y Java no permite código inalcanzable. Los otros dos for están bien escritos y compilan sin problema.

### Pregunta 6

**Respuesta:** C, D y E  
**Justificación:** Las tres correctas son C, D y E porque: el for evalúa su condición antes de ejecutar el cuerpo por lo que puede ejecutarse cero o más veces, el switch expression con String necesita default ya que hay infinitos valores posibles y el compilador debe garantizar que la variable siempre tenga un valor, y el do/while garantiza al menos una ejecución porque corre el cuerpo primero y evalúa la condición después. Las otras son incorrectas porque el for-each no funciona con todas las colecciones como Map, el while puede ejecutarse cero veces, y cada if solo puede tener un else.

### Pregunta 7

**Respuesta:** B y D  
**Justificación:** A falla porque empieza en weather.length y eso está fuera del array. C no compila porque i no está definido en el cuerpo. E no compila porque repite int en la declaración. F salta el primer elemento porque empieza en i=1. Solo B recorre el array en orden y D lo recorre al revés, ambas correctamente.

### Pregunta 8

**Respuesta:** G  
**Justificación:** Dos líneas no compilan, la línea 36, bat <= 20 no compila porque si o no es un Long, la variable bat no está en scope (flow scoping). En la línea 38, default no existe en un if/else, eso solo es válido en un switch. Por eso hay dos errores de compilación.

### Pregunta 9

**Respuesta:** B, C y E  
**Justificación:** El truco está en que el if sin llaves {} solo aplica al ; vacío, así que count++ siempre se ejecuta. B y E son equivalentes (break del loop interno), C hace continue al loop externo, y los tres caminos resultan en count = 2. A sale demasiado pronto con count = 1. D y F dejan correr demasiadas iteraciones resultando en count = 5.

### Pregunta 10

**Respuesta:** E  
**Justificación:** Son 4 líneas con errores. Línea 15: continue no se puede usar en un switch. Línea 16: thursday no es una constante en tiempo de compilación, aunque sea final como parámetro no cuenta. Línea 18: Sunday no está marcado como final, ser "effectively final" no es suficiente en un switch. Línea 19: DayOfWeek.MONDAY es un enum, no un int, y el switch espera int.

### Pregunta 11

**Respuesta:** A  
**Justificación:** Al pasar Animal.MAMMAL, el switch retorna 3 directamente en ese caso. Como es un switch expression con ->, no hay fall-through ni nada raro, simplemente asigna 3 a type y luego se imprime. Además, el default es opcional porque ya se cubren todos los valores del enum.

### Pregunta 12

**Respuesta:** C  
**Justificación:** El ciclo se ejecuta dos veces: en la primera iteración sing baja a 7, squawk sube a 4 y notes se vuelve 11; en la segunda sing baja a 6, squawk sube a 6 y se suma 6 + 6, dejando notes en 23; después la condición sing > squawk ya no se cumple (6 > 6 es false) y el programa imprime 23.

### Pregunta 13

**Respuesta:** G  
**Justificación:** El código no compila porque en la línea del while faltan paréntesis (while (keepGoing);), que son obligatorios en Java. No es un problema de lógica sino de sintaxis. Si se corrigiera, el ciclo se ejecutaría dos veces y el resultado sería 11, pero tal como está escrito, no compila.

### Pregunta 14

**Respuesta:** B, D y F  
**Justificación:** En un for-each el tipo de la variable se infiere según el tipo de los elementos que se están recorriendo: en new int[2] los elementos son int, así que penguin es int; en Character[] los elementos son Character, así que emu es Character; y en List<Integer> los elementos son Integer, por lo que macaw es Integer.

### Pregunta 15

**Respuesta:** F  
**Justificación:** El código no compila, pero no por el tipo de datos sino por un error de sintaxis: en case 'B': 'C': falta la palabra clave case antes de 'C'. En un switch, cada valor debe declararse con case, o agruparse correctamente con comas. Por eso el compilador falla y la respuesta es None of the above.

### Pregunta 16

**Respuesta:** A, B y D  
**Justificación:** Las correctas son A, B y D porque son las únicas que recorren el arreglo desde el último índice (length - 1) hasta el primero (0). En A se usa un índice que empieza en length y se va decrementando antes de acceder; en B se hace el clásico for inverso desde length - 1 hasta 0; y en D también se recorre hacia atrás aunque tiene una variable extra innecesaria. Las demás fallan: C y F acceden a wolf[length] (fuera de rango), y E genera un loop infinito.

### Pregunta 17

**Respuesta:** B y E  
**Justificación:** Al final se imprimen los valores participants = 10, animals = 3 y performers = 3, así que los números distintos son 10 y 3. El primer while incrementa participants hasta que llega a 10, el do-while se ejecuta al menos una vez y deja animals en 3, y el for incrementa performers de -1 a 3 en saltos de 2.

### Pregunta 18

**Respuesta:** C y E  
**Justificación:** Las correctas son C y E porque el pattern matching en Java se hace usando el operador instanceof, que permite verificar el tipo y declarar una variable en la misma expresión. Además, el flow scoping significa que esa variable solo está disponible en las partes del código donde el compilador puede garantizar que tiene ese tipo.

### Pregunta 19

**Respuesta:** E  
**Justificación:** El código no compila porque la variable snake se declara dentro del bloque del do, pero se usa en la condición del while fuera de ese bloque, donde ya no existe (está fuera de alcance). Por eso el compilador marca error.

### Pregunta 20

**Respuesta:** A y E  
**Justificación:** El problema principal es el for interno que es un loop infinito, así que necesitas evitar ejecutarlo o poder salir de él. En A, el break L2 hace que salgas del do-while antes de llegar al for, por lo que nunca entras al loop infinito. En E, el continue L2 permite salir del for y regresar al do-while, evitando que el programa se quede atrapado.

### Pregunta 21

**Respuesta:** E  
**Justificación:** Hay cuatro líneas con errores: el switch no acepta Long como tipo (línea 22), en el case 10 falta yield y el punto y coma (línea 23), en el case 20 sobra un punto y coma extra (línea 24), y hay dos case 30 duplicados (líneas 25 y 26). Por eso se necesitan al menos cuatro correcciones para que compile.

### Pregunta 22

**Respuesta:** E  
**Justificación:** La correcta es la E (5 2 1) porque tailFeathers vale 3 y entra directamente al case 3, imprimiendo 5. Luego el while se ejecuta mientras sea mayor que 1: primero hace --tailFeathers (pasa de 3 a 2) e imprime 2, y en la siguiente iteración pasa de 2 a 1 e imprime 1. Después ya no entra al ciclo, así que el resultado final es 5 2 1.

### Pregunta 23

**Respuesta:** F  
**Justificación:** El código no compila porque en la línea 19 hay un else if sin un if previo al que pertenezca (ya hay un else antes), lo cual es un error de sintaxis. Por eso ninguna salida aplica.

### Pregunta 24

**Respuesta:** G  
**Justificación:** El código no compila porque el for-each en Java no usa in, sino :. Como la sintaxis está mal, ninguna opción de tipo importa. Si se corrigiera a for (var friend : friends), entonces sí funcionarían tipos como Set, int[] y Collection.

### Pregunta 25

**Respuesta:** D  
**Justificación:** "violin" no es igual a "VIOLIN" (Java sí distingue mayúsculas), entonces entra al default. Como no hay break, sigue ejecutando los siguientes casos: primero hace p++ (-1 a 0), luego otro p++ (0 a 1) y al final ++p (1 a 2). Por eso termina en 2.

### Pregunta 26

**Respuesta:** F  
**Justificación:** El código sí compila, pero entra en un loop infinito. El problema es que r solo se incrementa fuera del do-while, entonces dentro del loop la condición r <= 1 siempre se queda verdadera en la primera vuelta, haciendo que el do-while nunca termine y el programa se quede ejecutando para siempre.

### Pregunta 27

**Respuesta:** F  
**Justificación:** El código no compila porque en el case 2 hay un if que solo hace yield "Green" si se cumple la condición, pero si no se cumple, no devuelve nada. En un switch expression todos los caminos deben retornar un valor, así que falta un yield en ese caso y por eso falla la compilación.

### Pregunta 28

**Respuesta:** F  
**Justificación:** El código no compila porque se está declarando dos veces la variable guppy dentro del mismo flujo usando instanceof, lo cual no está permitido por el flow scoping. Eso causa un error de compilación, así que ninguna salida es válida.

### Pregunta 29

**Respuesta:** C  
**Justificación:** Se usa pre-incremento (++y), entonces el primer valor que imprime es -1 (no -2). El ciclo sigue mientras y <= 5, así que llega hasta imprimir 6: cuando y vale 5 aún entra, se incrementa a 6, se imprime, y luego ya se detiene porque 6 <= 5 es false. Por eso la salida es -1 0 1 2 3 4 5 6.
