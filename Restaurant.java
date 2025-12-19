import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Restaurant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int[] foodnum={1,2,3,4};
            ArrayList<String> foodName=new ArrayList<>();
            foodName.add("Pizza");
            foodName.add("Burgger");
            foodName.add("Coffee");
            foodName.add("Tea");
            LinkedList<Integer> foodprice = new LinkedList<>();
            foodprice.add(250);
            foodprice.add(200);
            foodprice.add(50);
            foodprice.add(30);
            int totalBill=0;
            ArrayList<Integer> ordercount = new ArrayList<>();
            for (int i=0;i<foodnum.length;i++){
                ordercount.add(0);
            }
            int choice;
            {System.out.println("=*=*=*=*=*=*Welcome to the resturant=*=*=*=*=");}
            while(true){
                System.out.println("\nMenu: ");
                for (int i = 0; i < foodnum.length; i++) {
                    System.out.println(foodnum[i]+". "+foodName.get(i)+"-Rs."+foodprice.get(i));
                    
                }
                System.out.print("Enter food number to order (0 to exit): ");
                choice=sc.nextInt();
                if (choice==0){
                    break;
                }
                if (choice>=1 && choice<=foodnum.length){
                    int index=choice-1;
                    ordercount.set(index,ordercount.get(index)+1);
                    System.out.println(foodName.get(choice-1)+ "Added to your order. ");
                }
                else{
                    System.out.println("Invalid choice. Try again. ");
                }
            }
            int totalItems=0;
            for (int i = 0;i < foodnum.length; i++){
                int count = ordercount.get(i);
                if (count>0){
                    int itemtotal=count*foodprice.get(i);
                    System.out.println(
                        foodName.get(i)+ 
                        "  price: Rs."+ foodprice.get(i)+
                        "  Quantity: "+ count+
                        "  -> Total= Rs. "+ itemtotal
                    );
                    totalItems+=count;
                    totalBill+=itemtotal;
                }
        }
            System.out.println("Total items ordered: "+totalItems);
            System.out.println("Total Bill = Rs."+totalBill);
            System.out.print("Thankyou! Visit again");
            sc.close();
        }
    }