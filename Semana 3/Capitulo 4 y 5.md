## Preguntas del Capitulo 4 de OCP Oracle Certified Professional Java SE 17 Developer Study Guide

### Pregunta 1

**Respuesta:** F  
**Justificación:** En la línea String anotherFish = numFish + 1; se está haciendo una suma entre enteros (4 + 1 = 5), lo que da un int, y no se puede asignar directamente a un String. Faltaría convertirlo a texto agregando "".

### Pregunta 2

**Respuesta:** C, E y F  
**Justificación:** En C se intenta usar beans como tipo cuando en realidad es el nombre de la variable (debería ser String), y en E y F no se especifica el tamaño del primer nivel del arreglo, lo cual es obligatorio en Java. En cambio, A, B y D sí son válidas porque aunque dejen dimensiones internas sin tamaño, el primer nivel sí está correctamente definido.

### Pregunta 3

**Respuesta:** A, C y D  
**Justificación:** Las correctas son A, C y D porque son fechas válidas y Java maneja automáticamente los cambios de horario de verano. Aunque el 13 de marzo y el 6 de noviembre tienen ajustes de hora, ZonedDateTime los corrige internamente sin lanzar excepción. En cambio, B es inválida (no existe marzo 40), E falla porque 2023 no es año bisiesto (no hay 29 de febrero), y F no compila porque el enum correcto es Month, no MonthEnum.

### Pregunta 4

**Respuesta:** A, C y D  
**Justificación:** "Hello".equals(s) es true (mismo contenido), así que imprime one. Luego t == s es false porque t es un objeto nuevo y no el mismo en memoria. En cambio, t.intern() == s es true porque intern() devuelve la referencia del string pool, igual que s, así que imprime three. Finalmente, "Hello" == s también es true porque ambos apuntan al mismo string del pool, por eso imprime four.

### Pregunta 5

**Respuesta:** B  
**Justificación:** La correcta es la B porque primero append("aaa") deja "aaa", luego insert(1, "bb") inserta en la posición 1 y queda "abbaa", y finalmente insert(4, "ccc") inserta en la posición 4 y resulta "abbaccca".

### Pregunta 6

**Respuesta:** C  
**Justificación:** Hay dos errores de compilación: en la línea 24 Math.round(1.0) devuelve un long (porque recibe un double), y no se puede asignar directamente a un int; y en la línea 25 Math.random() devuelve un double, que no se puede asignar a un float sin cast.

### Pregunta 7

**Respuesta:** A y E  
**Justificación:** Las correctas son A y E porque al convertir ambas horas a GMT, la primera queda en 9:00 y la segunda en 15:00. Eso significa que la primera es más temprana y que hay una diferencia de 6 horas entre ambas.

### Pregunta 8

**Respuesta:** A, B y F  
**Justificación:** Los índices empiezan en 0, así que en A charAt(4) devuelve '5'. En B, replace(2, 4, "6") convierte "12345" en "1265" y el índice 3 es '5'. En F, replace("123", "1") da "145" y en el índice 2 también está '5'.

### Pregunta 9

**Respuesta:** A, C y F  
**Justificación:** Los arrays en Java empiezan en índice 0, tienen tamaño fijo una vez creados y no sobreescriben el método equals, por lo que comparan referencias en memoria; así, dos arrays distintos con los mismos valores siempre dan false al usar equals.

### Pregunta 10

**Respuesta:** A  
**Justificación:** Todas las líneas compilan: Math.min(5, 3) devuelve int, Math.round(5.5) devuelve long, y Math.floor(6.6) devuelve double, así que todas las asignaciones son válidas. Además, en el array double[], los valores int y long se convierten automáticamente a double, por lo que tampoco hay error ahí.

### Pregunta 11

**Respuesta:** E  
**Justificación:** El código no compila: LocalDate no tiene el método plusHours(), ya que solo maneja fechas (sin hora). Además, aunque plusDays() existe, no se reasigna el resultado, pero el error real que impide compilar es el uso de un método inexistente en la línea date.plusHours(3).

### Pregunta 12

**Respuesta:** A, D y E  
**Justificación:** Las correctas son A, D y E porque después de indent() y stripLeading() la cadena vuelve a ser "012345678". Luego, substring(1,3) toma los caracteres en índices 1 y 2, dando "12". substring(7,7) no toma ningún carácter porque el inicio y fin son iguales, así que imprime una línea en blanco. Finalmente, substring(7) toma desde el índice 7 hasta el final, dando "78".

### Pregunta 13

**Respuesta:** B  
**Justificación:** Los String en Java son inmutables, así que roar1.concat("!!!") no cambia el valor original, solo devuelve uno nuevo que no se guarda. En cambio, StringBuilder sí es mutable, por lo que roar2.append("!!!") modifica el mismo objeto. Por eso al final roar1 sigue siendo "roar" y roar2 se convierte en "roar!!!".

### Pregunta 14

**Respuesta:** A y F  
**Justificación:** Instant representa un punto exacto en el tiempo. Instant.now() lo crea directamente con la hora actual, y zonedDateTime.toInstant() convierte una fecha con zona horaria a un instante universal válido. Las otras opciones fallan porque LocalDate, LocalTime y LocalDateTime no tienen zona horaria, así que no pueden convertirse directamente a un Instant, y además Instant no se puede instanciar con new.

### Pregunta 15

**Respuesta:** C y E  
**Justificación:** Arrays.sort() ordena primero los números antes que las letras, y dentro de las letras las mayúsculas van antes que las minúsculas, así que el arreglo queda [123, PIG, pig]. Luego binarySearch("Pippa") busca dónde se insertaría ese valor en orden, que sería entre PIG y pig, y al aplicar la regla del método devuelve -3.

### Pregunta 16

**Respuesta:** A, B y G  
**Justificación:** Las correctas son A, B y G porque base tiene 11 caracteres contando que \n y \\ ocupan un solo carácter cada uno. Luego indent(2) agrega espacios al inicio de cada línea y además normaliza con un salto de línea final, aumentando el tamaño a 16. Por otro lado, translateEscapes() convierte \\t en un tab real, reduciendo un carácter y dejando 10. Finalmente, el tamaño inicial calculado con length() es 11.

### Pregunta 17

**Respuesta:** A y G  
**Justificación:** substring(1, 2) es válido y devuelve un string de un solo carácter (incluye el índice 1 pero no el 2). En cambio, substring(6, 5) es inválido porque el índice inicial es mayor que el final, lo que provoca una StringIndexOutOfBoundsException. Las demás opciones son incorrectas porque substring(2,2) y substring(6,6) sí son válidas, pero devuelven una cadena vacía, no un carácter ni una excepción.

### Pregunta 18

**Respuesta:** C y F  
**Justificación:** El text block "purr" tiene 4 caracteres y, aunque se llaman toUpperCase(), trim() y substring(), no se reasignan, así que no cambian el valor de s1. Luego s1 += "two" crea una nueva cadena de 7 caracteres, por eso s1.length() da 7. En s2, todo se concatena como String (2 + 'c' + false), formando "2cfalse", y aunque == falla, .equals() sí es verdadero porque compara contenido, así que se imprime equals.

### Pregunta 19

**Respuesta:** A, B y D  
**Justificación:** Arrays.compare() devuelve un valor positivo cuando el primer arreglo “es mayor” en orden lexicográfico. Y Arrays.mismatch() devuelve el índice donde empiezan a diferir los arreglos, que en B y D es mayor o igual a 1, por lo que también da un número positivo. Las demás opciones no cumplen esas condiciones o comparan arreglos iguales.

### Pregunta 20

**Respuesta:** A y D  
**Justificación:** Al sumar una hora a 1:30 en la zona US/Eastern, ocurre el cambio de horario de verano (spring forward), donde la hora 2:00–3:00 no existe. Por eso el resultado salta directamente a 3:30, así que el hour es 3. El diff sigue siendo 1 porque el cálculo entre instantes sigue siendo una hora real transcurrida, aunque el reloj “salte” una hora.

### Pregunta 21

**Respuesta:** A y C  
**Justificación:** reverse() invierte directamente "Java" a "avaJ", así que es la forma más simple. En la opción C se usa method chaining: primero se forma "JavavaJ$", luego se eliminan los primeros 3 caracteres quedando "avaJ$", y finalmente se elimina el último carácter, resultando "avaJ". Las demás opciones fallan porque B no guarda el resultado de substring() y D intenta eliminar un índice inválido.

### Pregunta 22

**Respuesta:** A  
**Justificación:** LocalDate es inmutable, así que los métodos plusDays() y plusYears() no modifican el objeto original si no se reasignan. Como no se guarda el resultado, la fecha sigue siendo la misma al momento del println.
