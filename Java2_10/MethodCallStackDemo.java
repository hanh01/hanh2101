package Java2_10;
import java.io.FileNotFoundException;

public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

    public static void methodA() {
        System.out.println("Enter methodA()");
        try {
            System.out.println(1 / 0);
        } finally {
            System.out.println("finally in methodA()");
        }
        System.out.println("Exit methodA()");
    }
}
