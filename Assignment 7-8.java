import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];

        System.out.println("Enter ten double values:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        double avg = average(array);
        System.out.println("The average value is: " + avg);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}


    

