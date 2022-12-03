import java.util.Scanner;

public class gelismisHesapMakinasi {
    public static int topla() {
        Scanner scn = new Scanner(System.in);
        int sayi, i = 1, toplam = 0;
        do {
            System.out.print(i++ + ". Sayiyi Giriniz:");
            sayi = scn.nextInt();
            if (sayi == 0) {
                break;
            }
            toplam += sayi;
        } while (sayi != 0);
        System.out.println("Sonuc: " + toplam);
        return toplam;

    }

    public static int cikar() {
        Scanner scn = new Scanner(System.in);
        int sayi, fark = 0, i = 1;
        do {
            System.out.print(i++ + ". Sayiyi Giriniz:");
            sayi = scn.nextInt();
            if (i == 2) {
                fark += sayi;
                continue;
            }
            fark -= sayi;
        } while (sayi != 0);
        System.out.println("Sonuc: " + fark);
        return fark;
    }

    public static double carp() {
        Scanner scn = new Scanner(System.in);
        double sayi, carpim = 1;
        int i = 1;
        while (true) {
            System.out.println("Carpma Islemini Bitirmek İcin 1 Degeri Giriniz");
            System.out.print(i++ + ".Sayiyi Giriniz:");
            sayi = scn.nextDouble();
            if (sayi == 1) {
                break;
            }
            if (sayi == 0) {
                carpim = 0;
                break;
            }
            carpim *= sayi;
        }
        System.out.println("Sonuc:" + carpim);
        return carpim;
    }

    public static double bol() {
       Scanner scn = new Scanner(System.in);
        System.out.print("Kac Adet Sayi Girceksiniz");
        int adet =scn.nextInt();
        double sayi,sonuc=0.0;
        for (int i = 1; i <=adet ; i++) {
            System.out.println(i+".Sayiyi Giriniz:");
            sayi=scn.nextDouble();
            if(i != 1 && sayi==0){
                System.out.println("Böleni 0 Giremezsiniz");
                continue;
            }
            if (i==1){
                sonuc=sayi;
                continue;
            }
            sonuc/=sayi;
        }
        System.out.println("Sonuc:"+sonuc);
        return sonuc;
    }

    public static int uslu() {
        Scanner scn = new Scanner(System.in);
        int taban, us, carpim = 1;
        System.out.print("Taban Degerini Giriniz:");
        taban = scn.nextInt();
        System.out.print("Us Degerini Giriniz:");
        us = scn.nextInt();
        for (int i = 1; i <= us; i++) {
            carpim *= taban;

        }
        System.out.println("Sonuc:" + carpim);
        return carpim;
    }
    public static int fakt(){
        Scanner scn = new Scanner(System.in);
        int sayi,carpim=1;
        System.out.print("Fatoriyelini Alacaginiz Sayiyi Giriniz:");
        sayi= scn.nextInt();
        do {
            if(sayi==0){
                carpim=1;
                break;
            }
            carpim*=sayi;
            sayi--;
        }while (sayi!=0);
        System.out.println("Sonuc:"+carpim);
        return carpim;
    }

    public static int mod(){
        Scanner scn = new Scanner(System.in);
        int kalan;
        System.out.print("Bolunen Sayiyi Girniz");
        int bolunen=scn.nextInt();
        System.out.print("Hangi Sayi Ile Bolumunden Kalan Ariyorsunuz");
        int bolen= scn.nextInt();
        kalan=bolunen%bolen;
        System.out.println("Sonuc:"+kalan);
        return kalan;
    }
    public static int dikdorgen(){
        Scanner scn = new Scanner(System.in);
        int uKenar,kKenar,alan,cevre;
        System.out.print("Dikdorgenin Uzun Kenarini Giriniz:");
        uKenar=scn.nextInt();
        System.out.print("Dikdorgenin Kisa Kenarini Giriniz:");
        kKenar= scn.nextInt();
        alan=uKenar*kKenar;
        cevre=2*(kKenar+uKenar);
        System.out.println("Alan:"+alan);
        System.out.println("Cevre:"+cevre);
        return alan;
    }



    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int secim;
        String menu ="1)Toplama\n"+"2)Cikarma\n"+"3)Carpma\n"+"4)Bolme\n"+"5)Uslu Sayi Hesaplama\n"+"6)Faktoriyel Hesaplama\n"
                +"7)Mod Alma\n"+"8)Dikdortgen Alan Cevre Hesabi\n"+"9)Cikis";
        do {
            System.out.println(menu);
            System.out.println("Lutfen Bir Islem Seciniz:");
             secim=scn.nextInt();
            switch (secim){
                case 1:
                    topla();
                    break;
                case 2:
                    cikar();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bol();
                    break;
                case 5:
                    uslu();
                    break;
                case 6:
                    fakt();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdorgen();
                    break;
                case 9:
                    System.out.println("GULE GULE YINE BEKLERIZ");
                    break;
                default:
                    System.out.println("Gecersiz Islem Sectiniz");
                    break;

            }

        }while (secim !=9);


    }
}
