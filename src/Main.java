import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Homework 8");

        task1234();
    }

    public static void task1234(){
        System.out.println("Task 1");

        System.out.println("Create arrays...");
        // Integers array
        int[] numbers = new int[]{1, 2, 3};
        // Double array
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        // My array
        char[] chars = {'a', 'b', 'c', '!'};
        System.out.println("Arrays created!");
        System.out.println();

        System.out.println("Task 2");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < fractionalNumbers.length; i++) {
            System.out.print(fractionalNumbers[i]);
            if (i < fractionalNumbers.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            if (i < chars.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        System.out.println("Task 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            System.out.print(fractionalNumbers[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        System.out.println("Task 4");

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0){
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}