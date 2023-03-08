import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double DoC;
        double Dof;
        int choice;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("---------Menu--------");
            System.out.println("1.Doi tu do C sang F");
            System.out.println("2.Doi tu do F sang C");
            System.out.println("0.Exit");
            System.out.println("Vui long chon");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap do C");
                    DoC=scanner.nextDouble();
                    Dof=(9.0/5)*DoC+32;
                    System.out.println(DoC +"Do C = "+Dof +"Do F");
                    break;
                case 2:
                    System.out.println("Nhap do f");
                    Dof=scanner.nextDouble();
                    DoC=(5.0 / 9) * (Dof - 32);
                    System.out.println(Dof +"Do F =" +DoC+"Do C" );
            }

        }while (choice != 0);
    }

}
