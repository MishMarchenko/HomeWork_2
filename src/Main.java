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
        System.out.println("Let's count to 10 using While Loop");
        int a = 0;
        while(a < 10){
            a = a + 1;
            System.out.println(a);
        }
        System.out.println("Let's count from 10 to 1 using Do-While Loop");
        int b = 10;
        do{
            System.out.println(b);
            b = b - 1;
        } while(b > 0);

        System.out.println();

        int [] [] multyArray = new int[8][9];
        for(int c = 0; c < multyArray.length; c++){
            for(int d = 0; d < multyArray[0].length; d++){
                multyArray[c][d] = c + d;
            }
        }
        for(int c = 0; c < multyArray.length; c++){
            for(int d = 0; d < multyArray[0].length; d++){
                System.out.println(multyArray[c][d]);
            }
            System.out.println();
        }
    }
}