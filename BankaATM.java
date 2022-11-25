import java.util.Scanner;

public class BankaATM {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String sifre="1453";
        int kalanHak=3,secim;
        int bakiye=500,yatırılanPara,cekilenPara;
        System.out.println("KOSE Banka Hos Geldiniz");
        System.out.print("Lütfen Kart Sİfrenizi Giriniz:");
        while (kalanHak>0) {
            sifre = scn.nextLine();
            if (sifre.equals("1453")) {
                System.out.println("Giriş Başarli Lütfen Yapmak Istediginiz Işlemi Secin");
                do {
                    System.out.println("1)Para Cekme\n2)Para Yatırma\n3)Bakiye Goruntuleme\n4)Cikis Yap");
                    secim = scn.nextInt();
                    switch (secim) {
                        case 1: {
                            System.out.println("Bakiyeniz:" + bakiye);
                            System.out.print("Cekmek İstediginiz Tutari Giriniz:");
                            cekilenPara = scn.nextInt();
                            if (cekilenPara > bakiye) {
                                System.out.println("Bakiye Yetersiz.Kalan Bakiye " + bakiye);
                            } else {
                                bakiye -= cekilenPara;
                                System.out.println("Kalan Bakiye:" + bakiye);
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("Bakiyeniz:" + bakiye);
                            System.out.print("Yatirmak Istediginiz Tutari Giriniz");
                            yatırılanPara = scn.nextInt();
                            bakiye += yatırılanPara;
                            System.out.println("Kalan Bakiye:" + bakiye);
                            break;
                        }
                        case 3: {
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                        }
                    }

                } while (secim != 4);
                System.out.println("Esenlikler Dileriz");
                break;

            } else {
                kalanHak--;
                System.out.println("Hatalı Sifre Girdiniz");

                if(kalanHak==0){
                    System.out.println("Kartiniz Bloke Olmustur. Karti Actirmak Icin Lutfen Bankanizi Arayin ");
                }else {
                    System.out.println("Kalan Hakkınız:"+kalanHak);
                }
            }
        }
    }
}
