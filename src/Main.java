import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Dmitriy!");
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[scanner.nextInt()];
        for (int a = 0; a < array.length; a++) {
            array[a] = a + 1;
        }
            System.out.println(Arrays.toString(array));

        for (int b = 10; b > 0; b--){
            for (int c = 10; c > 0; c--) {
                System.out.println(b + "*" + c + "=" + b*c);
            }
            System.out.println();
        }
    }
}