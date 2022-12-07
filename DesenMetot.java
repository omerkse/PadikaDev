import java.util.Scanner;

public class DesenMetot {
    static void pattern(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number= scan.nextInt();
        int temp = number;
        do {
            temp=temp-5;
            System.out.println(temp);
        }while (temp>0);
        do {
            temp=temp+5;
            System.out.println(temp);
        }while (temp!=number);
    }
    public static void main(String[] args) {
        pattern();
    }
}