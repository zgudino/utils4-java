# Utils
> Paquete de funciones comunes utilizadas académicamente por cursos de programación.

### Util.isPrime(Integer number)
Parámetro: `int` <br />
Retorna: `boolean`

Retorna verdadero si el argumento numérico es un número primo.
Excepción `IllegalArgumentException` es elevada si el argumento numérico es *cero* o mejor a *cero*.

###### Uso
```java
import Utils.Util;

public class Main {
    public static void main(String[] args) {
        System.out.println(Util.isPrime(311)); // true
    }
}
```

### Util.inReverse(String string)
Parámetro: `String` <br />
Retorna: `String`

Retorna una cadena de caracteres de orden inverso.

###### Uso
```java
import Utils.Util;

public class Main {
    public static void main(String[] args) {
        System.out.println(Util.inReverse("Hello World")); // dlroW olleH
    }
}
```
