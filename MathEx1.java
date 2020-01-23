package Practice01;
import static java.lang.Math.*;
import static java.lang.System.*;

// ~~~Exact methods : to detect "overflow"

public class MathEx1 {
    public static void main(String[] args) {

        int i = Integer.MIN_VALUE;

        out.println("i =" + i);
        out.println("-i=" + (-i));

        try {
            out.printf("negateExact(%d)= %d%n", 10, negateExact(10));
            out.printf("negateExact(%d)= %d%n", -10, negateExact(-10));
            out.printf("negateExact(%d)= %d%n", i, negateExact(i)); // exception occurs
        } catch (ArithmeticException e) {
            // change i to long type
            out.printf("negateExact(%d)= %d%n", (long)i, negateExact((long)i));
        }

    }
}
