import java.util.Scanner;
public class Vivasimulator {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int Students=10;
        int questions=3;
        for (int i = 1; i <Students; i++) {
            int totalmarks=0;
            System.out.println("\n Student "+i+" Viva:");
            for (int j = 1; j <= questions; j++) {
                System.out.print("enter marks of Question"+j+": ");
                int marks=sc.nextInt();
                totalmarks+=marks;
            }
            System.out.println("Total marks for Student"+i+"="+totalmarks);
        }
        sc.close();
    }
}
