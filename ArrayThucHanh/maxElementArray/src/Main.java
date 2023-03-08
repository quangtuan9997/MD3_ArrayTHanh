import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter array size :");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Khong duoc qua 20:");

        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("enter Element" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;

        }
        System.out.println("List element off Array");

        int j;
        for (j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");

        }
        int max = 0;
        int index = 1;
        for (int k = 0; k < array.length; k++) {
            max = array[0];

            if (array[k] > max) {
                max = array[k];
                index = k + 1;

            }
        }
        System.out.println("Max = " + max + " Vi tri " + index) ;
    }
}
