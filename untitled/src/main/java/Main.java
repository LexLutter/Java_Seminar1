import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] ints = new int[12];
        Random random = new Random();
        for (int j = 0; j < ints.length; j++) {
            ints[j] = random.nextInt(2000);
        }
        int[] tmp = new int[ints.length + 3];
        for (int j = 0; j < ints.length; j++) tmp[j] = ints[j];
        ints = tmp;

        String str = "Привет мир!";

        System.out.println(str.substring(1, str.length() - 1));

        Scanner scanner = new Scanner(System.in);

        String s;
        do {
            s = scanner.nextLine();
            System.out.println(s);
        } while (!s.equals("q"));

    }
}

