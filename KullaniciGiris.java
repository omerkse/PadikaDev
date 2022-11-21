import java.util.Scanner;
import java.util.StringJoiner;

public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String kullaniciAdi,sifre;


        System.out.print("Kullanici Adinizi Giriniz: ");
        kullaniciAdi=scn.nextLine();

        System.out.print("Sifrenizi Giriniz");
        sifre=scn.nextLine();

        if(kullaniciAdi.equals("reddawn1453") && sifre.equals("asd1453")){
            System.out.print("Giris Basarili Sayfaya Yonlendiriliyorsunuz");

        }else{
            System.out.println("Kullanici Adi veya Sifre Hatali");
            System.out.println("Sifrenizi Degistirmek Istermisiniz");
            System.out.println("1)Hayır\n2)Evet");
            int secim=scn.nextInt();

            switch (secim){

                case 1:
                    System.out.printf("Ana Sayfaya Yonlendiriliyorsunuz");
                    break;
                case 2:
                    System.out.printf("Yeni Sifrenizi Giriniz");
                    Scanner input = new Scanner(System.in);
                    String yeniSifre;
                    yeniSifre=input.nextLine();

                    if(yeniSifre.equals("asd1453")){
                        System.out.println("Yeni Sifre Eskisi ile Ayni Olamaz");
                    }else {
                        System.out.println("Sifreniz Basarili Bir Sekilde Degistirildi");
                        break;
                    }

            }
        }

    }
}
