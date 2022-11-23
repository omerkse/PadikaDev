import java.util.Scanner;

public class UsBulma {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sayi,us,carpim=1;
        System.out.print("Sayiyi Girniz:");
        sayi=scn.nextInt();
        System.out.print("Ussunu Girin:");
        us=scn.nextInt();
        for (int i =1; i<=us ;i++) {
            carpim*=sayi;
        }
        System.out.println(carpim);
    }
}
