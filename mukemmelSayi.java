import java.util.Scanner;

public class mukemmelSayi {


    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int toplam = 0;
        System.out.print("Bir Sayi Giriniz");
        int sayi = scn.nextInt();
        for (int i = 1; i <=sayi/2 ; i++) {
            if(sayi%i == 0){
                toplam+= i;

            }

        }if(toplam == sayi){
            System.out.println("Mükemmel Sayidir");
        }else {
            System.out.println("Mükemmel Sayı Değildir");
        }

    }
}

