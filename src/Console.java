import java.util.Scanner;

public class Console {
    private static Scanner console = new Scanner(System.in);

    public static int lerInt() {
        return console.nextInt();
    }

    public static String lerString() {
        return console.nextLine();
    }

    public static float lerFloat() {
        return console.nextFloat();
    }
}
