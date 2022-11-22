import java.util.Scanner;
public class UcakBiletiFiyati {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int km,tip,yas;
        double normalFiyat,indirimliFiyat;
        System.out.print("Yolu KM Cinsinden Giriniz:");
        km=scn.nextInt();
        System.out.print("Yasinizi Giriniz:");
        yas=scn.nextInt();
        System.out.println("1)Tek Yon\n2)Gidis Donus");
        tip=scn.nextInt();
        if(yas>0 && km>0 && (tip==1 || tip==2)){
           normalFiyat=km*0.10;
           if(yas<12){
               indirimliFiyat=normalFiyat*0.5;
           } else if (yas>=12 && yas<=24) {
               indirimliFiyat=normalFiyat*0.1;
           } else if (yas>=65) {
               indirimliFiyat=normalFiyat*0.3;
           }else{
               indirimliFiyat=0;
           }
           normalFiyat-=indirimliFiyat;
            if(tip==2){
                indirimliFiyat=normalFiyat*0.2;
                normalFiyat-=indirimliFiyat;
                normalFiyat*=2;
            }

            System.out.println("Bilet Paraniz: "+normalFiyat+"TL");

        }else{
            System.out.println("Gecersiz Degerler Girdiniz");
        }
    }
}
