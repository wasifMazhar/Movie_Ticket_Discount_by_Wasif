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


double DiscForStudent = TicketPrice * 0.2;
double DiscForElder = TicketPrice * 0.3;

boolean isStudent = true;

if(Age >= 12){


 if(isStudent){
 TicketPrice -= DiscForStudent;
 System.out.println("You get Student discount and save " + DiscForStudent);
 }else{
 System.out.println("You are not eligible for Student discount");
 }


 if(Age >= 40){
 TicketPrice -= DiscForElder;
 System.out.println("You get Elder discount and save " + DiscForElder);
 }else{
 System.out.println("You are not eligible for Elder discount");
 }

System.out.println("==============================================");
System.out.println("Final ticket price: " + TicketPrice);
System.out.println("==============================================");

}else{
 System.out.println("You are under age and not able to watch this movie.");
}
}
}