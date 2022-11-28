import java.util.Scanner;

public class fibonacciSayilar {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sayi;
        int ilksayi=0, sonsayi =1,toplam;
        System.out.print("Kaç Serilik Fibonacci Sayisi Olsun:");
        sayi = scn.nextInt();
        for (int i = 0; i <sayi ; i++) {
            System.out.println(ilksayi);
            toplam=ilksayi+sonsayi;
            ilksayi=sonsayi;
            sonsayi=toplam;
        }





    }
}

