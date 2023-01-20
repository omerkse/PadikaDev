import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int randomSayi,girilenSayi,kalanHak=5;
        String cevap;
        randomSayi=(int)(1+Math.random()*40);
        System.out.println(randomSayi);

        System.out.println("    Sayi Bulma Oyununa Hosgeldiniz    \n\n");
        System.out.println("Sistem 1 ile 40 Arasında Rastgele Sayi Uretecektir ve Toplamda 5 Deneme Hakkı Tanınmaktadır\n");
        System.out.print("Oyuna Baslamak Istermisiniz(e/h):");
        cevap = scn.nextLine();
        if(cevap.equals("e")){
            do {
                System.out.print("Tahmin Ettiginiz Sayiyi Giriniz:");
                girilenSayi= scn.nextInt();
                if(girilenSayi==randomSayi){
                    System.out.println("Tebrikler Sayiyi Dogru Tahmin Ettiniz");
                    break;
                } else if (Math.abs(randomSayi-girilenSayi)<10) {
                    System.out.println("Sayiya Yakinsiniz!!");
                    kalanHak--;
                }else if (Math.abs(randomSayi-girilenSayi)>10){
                    System.out.println("Sayidan  Uzaksiniz!!");
                    kalanHak--;
                }
                System.out.println("Kalan Hakkınız:"+kalanHak);
            }while (kalanHak!=0);
            if(kalanHak==0)
            System.out.println("Oyunu Kaybettiniz");
        }else {
            System.out.println("Allah'a Amanat");
        }

    }
}
