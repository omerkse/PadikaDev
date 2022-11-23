import java.util.Scanner;

public class DortIleBolunenSayilarinToplami {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sayi,toplam=0;
        do {
            System.out.println("Sayi Giriniz");
            sayi=scn.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }
        }while (sayi>0);
        System.out.println("Toplam: "+toplam);
    }
}
