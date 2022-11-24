import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sayi , basamakdegeri=0 ,basamak ,carpim=1 ,toplam=0;
        System.out.print("Sayi Girin: ");
        sayi=scn.nextInt();
        int sayicopy = sayi;
        while (sayicopy !=0){
            sayicopy/=10;
            basamakdegeri++;
        }
        sayicopy = sayi;
        while (sayicopy!=0){
            basamak=sayicopy%10;
            carpim=1;
            for (int i = 1; i <=basamakdegeri ; i++) {
                carpim*=basamak;
            }
            toplam+=carpim;
            sayicopy/=10;
        }
            if(toplam==sayi){
                System.out.println(sayi+" Bir Armstrong Sayidir");
            }else {
                System.out.println(sayi+" Bir Armstrong Sayidir Degildir");
            }
    }
}
