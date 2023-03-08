import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] listStudent;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap So luong hoc sinh");
            size = scanner.nextInt();
            if (size > 15)
                System.out.println("Khong duoc qua 15 ");
        } while (size > 15);
        listStudent = new int[size];
        int i = 0;
        while (i < listStudent.length) {
            System.out.println("Nhap diem cua hoc sinh" + (i+1)+":");
            listStudent[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        int j;
        System.out.println("Danh sach hoc sinh do");
        for ( j = 0; j < listStudent.length; j++) {

            if (listStudent[j] >= 5 && listStudent[j] <= 10) {
                count++;
                System.out.println(listStudent[j] + "\t");
            }

        }

        System.out.print(" So hoc sinh do " + count);
    }
    }
