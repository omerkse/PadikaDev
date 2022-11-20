import java.util.Scanner;

public class KDVTutari {
    public static void main(String[] args) {
        double tutar,kdvOran1=0.18,kdvOran2=0.08;
        Scanner scn=new Scanner(System.in);
        System.out.print("Ücret Fiyatını Giriniz: ");
        tutar=scn.nextInt();
        if(tutar>=0 && tutar<=1000){
            double kdvTutar=tutar*kdvOran1;
            double kdvliTutar=tutar+kdvTutar;
            System.out.println("KDV siz Ürün Fiyati: "+tutar);
            System.out.println("Eklenen KDV Oranı: "+kdvOran1);
            System.out.println("KDV Tutari: "+kdvTutar);
            System.out.println("KDV'li Fiyati: "+kdvliTutar);
        }
        else if (tutar>1000) {
            double kdvTutar=tutar*kdvOran2;
            double kdvliTutar=tutar+kdvTutar;
            System.out.println("KDV siz Ürün Fiyati: "+tutar);
            System.out.println("Eklenen KDV Oranı: "+kdvOran2);
            System.out.println("KDV Tutari: "+kdvTutar);
            System.out.println("KDV'li Fiyati: "+kdvliTutar);

        }else
            System.out.println("Gecersiz Degerler Girdiniz!!");

    }
}
