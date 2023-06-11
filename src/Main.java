import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Dmitriy! Check my full homework!");
        System.out.println("What homework item do you want to check?");
        System.out.println("Choose 1,2,3,4,5,6");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                System.out.println(partOne());
                break;
            case 2:
                System.out.println(partTwo());
                break;
            case 3:
                System.out.println(partThree());
                break;
            case 4:
                System.out.println(partFour());
                break;
            case 5:
                System.out.println(partFive());
                break;
            case 6:
            System.out.println(partSix());
                break;
            default:
                System.out.println("Don't be cunning, you set only 6 tasks!)))");
        }
    }
    public static String partOne() {
        System.out.println("Enter any number of array cells!");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int a = 0; a < array.length; a++) {
            array[a] = a + 1;
        }
        System.out.println("Completed them in order");
        String str = Arrays.toString(array);
        return str;
    }
    public static String partTwo(){
        System.out.println("Let me show you the multiplication table in reverse:");
        System.out.println();
        int b;
        int c;
        for (b = 10; b > 0; b--){
            for (c = 10; c > 0; c--) {
                System.out.println(b + "*" + c + "=" + b*c);
            }
            System.out.println();
        }
        return "";
    }
    public static String partThree(){
        System.out.println("Let's count to 10 using While Loop");
        int a = 0;
        while(a < 10){
            a = a + 1;
            System.out.println(a);
        }
        System.out.println();
        System.out.println("Let's count from 10 to 1 using Do-While Loop");
        int b = 10;
        do{
            System.out.println(b);
            b = b - 1;
        } while(b > 0);
        return "";
    }
    public static String partFour(){
        System.out.println("Let's fill the multi array with data");
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
        return "";
    }
    public static String partSix(){
        int [] array = {98, 56, 87, 4, 90, 54};
        for (int i = 1; i < array.length; i++){
            int tmp = array[i];
            int a = i;
            while (a > 0 && array[a - 1] > tmp){
                array[a] = array[a - 1];
                a--;
            }
            array[a] = tmp;
        }
        String str = Arrays.toString(array);
        return str;
    }
    public static int partFive(){
        int [] array = {9, 98, 67, 45, 4, 69, 32, 5, 1, 45};
        int i = array[0];
        for (int a = 1; a < array.length; a++){
            if (array[a] < i){
                i = array[a];
            }
        }return i;
    }
}