import java.util.Scanner;
public class SecDiscount{
public static void main(String[] args){

int TicketPrice = 1000;
Scanner sc = new Scanner(System.in);
System.out.println("==============================================");
System.out.println("Movie ticket Discount eligablity System");
System.out.println("==============================================");
System.out.print("Enter your age : ");
int Age = sc.nextInt();

boolean isStudent = true;

if(Age >= 12){
 if(isStudent){
                if(Age >= 40){
                TicketPrice *= 0.5; }
                else{TicketPrice *= 0.8; }
 }else{
                  if(Age >= 40){
                  TicketPrice *= 0.7; }
                  else{System.out.println("You are under age and not able to watch this movie."); }
 }

 System.out.println("Your price for the ticket is " + TicketPrice);
}else{
 System.out.println("You are under age and not able to watch this movie.");
}



}
}