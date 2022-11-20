import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double sayi1,sayi2;
        int islem;
        System.out.print("1.Sayiyi Giriniz: ");
        sayi1=scn.nextDouble();
        System.out.print("2.Sayiyi Giriniz");
        sayi2=scn.nextDouble();
        System.out.println("Yapmak Istediginiz Islemi Seciniz:");
        System.out.println("1)Toplama\n2)Cikarma\n3)Carpma\n4)Bolme");
        islem= scn.nextInt();
        switch (islem){
            case 1:
                double sonuc=sayi1+sayi2;
                System.out.println("Toplama Islemei Sonucu: "+sonuc);
                break;
            case 2:
                sonuc=sayi1-sayi2;
                System.out.println("Cikarma Islemi Sonucu: "+sonuc);
                break;
            case 3:
                sonuc=sayi1*sayi2;
                System.out.println("Carpma Isleminin Sonucu: "+sonuc);
                break;
            case 4:
                sonuc=sayi1/sayi2;
                System.out.println("Bolme Isleminin Sonucu: "+sonuc);
                break;
        }
    }
}
