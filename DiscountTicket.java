import java.util.Scanner;
public class DiscountTicket{
public static void main(String[] args){

int TicketPrice = 1000;
Scanner sc = new Scanner(System.in);
System.out.println("==============================================");
System.out.println("Movie ticket Discount eligablity System");
System.out.println("==============================================");
System.out.print("Enter your age : ");
int Age = sc.nextInt();


double DiscForStudent = 0.2;

double DiscForElder = 0.3;
// int ElderAge = 40;


boolean isStudent = true;
// boolean isElder = true;

double finalPrice = TicketPrice;

if(Age >= 12){


 if(isStudent){
 double discount = TicketPrice * DiscForStudent;
 finalPrice -= discount;
 System.out.println("You get Student discount and save " + discount);
 }else{
 System.out.println("You are not eligible for Student discount");
 }


 if(Age >= 40){
 double discount = TicketPrice * DiscForElder;
 finalPrice -= discount;
 System.out.println("You get Elder discount and save " + discount);
 }else{
 System.out.println("You are not eligible for Elder discount");
 }
 
System.out.println("==============================================");
System.out.println("Final ticket price: " + finalPrice);
System.out.println("==============================================");

}else{
 System.out.println("You are under age and not able to watch this movie.");
}
}
}