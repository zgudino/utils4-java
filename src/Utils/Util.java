package Utils;
import static java.lang.Math.sqrt;

public class Util {
    public static boolean isPrime(Integer number) {
        try {
            if (! (number > 0))
                throw new IllegalArgumentException("(Argumento Inválido): Argumento `number` debe ser mayor a cero.");
        }
        catch (IllegalArgumentException error) {
            error.printStackTrace();
        }

        if (number % Math.sqrt(number) == 0)
            return false;
        else {
            for (int i = 2; i <= sqrt(number) ; i++) {
                if (number % i == 0)
                    return false;
            }
        }

        return true;
    }

    public static String inReverse(String string) {
        if (string.length() <= 1)
            return string;

        return inReverse(string.substring(1, string.length())) + string.charAt(0);
    }
}
