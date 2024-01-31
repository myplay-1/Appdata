import java.util.Scanner;

void main(){
    System.out.println("ENTER YOUR FULL DETAILS");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your first name :");
    String x = scanner.nextLine();
    System.out.println("Enter your last name :");
    String y = scanner.nextLine();
    System.out.println("Your full name is :"+x+" "+y);
}