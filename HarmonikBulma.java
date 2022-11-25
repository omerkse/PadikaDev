import java.util.Scanner;
public class HarmonikBulma {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sayi;
        double bolum=1,toplam=0;
        System.out.println("Bir Sayi Giriniz");
        sayi=scn.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            bolum=1;
            bolum/=i;
            toplam+=bolum;
        }
        System.out.println(toplam);
    }
}
