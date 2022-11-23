import java.util.Scanner;

public class CombinasyonHesabı {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sayi,sayi1,fakt=1,fakt1=1,fakt2=1;

        System.out.print("Kumenin Elaman Sayisini Giriniz");
        sayi=scn.nextInt();
        System.out.print("Combine Etmek Istediginiz Sayiyi Giriniz:");
        sayi1=scn.nextInt();
        for (int i = 1; i <=sayi ; i++) {
             fakt*=i;
        }
        for (int j = 1; j <=sayi1; j++) {
            fakt1*=j;
        }

        int sayi2=sayi-sayi1;
        for (int k = 1; k <=sayi2 ; k++) {
            fakt2*=k;
        }
        int sonuc=fakt/(fakt1*fakt2);
        System.out.println("Sonuc: "+sonuc);

    }
}
