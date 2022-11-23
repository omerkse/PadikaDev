import java.util.Scanner;

public class GirilenSayiyaKadarOrtalamaBulma {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sayi,mod3=0,mod4=0,bolunensayi=0;
        System.out.print("Sayi Giriniz:");
        sayi=scn.nextInt();
        for (int i = 0; i <=sayi ; i++) {
            if(i%3==0){
            mod3+=i;
            bolunensayi++;
            } else if (i%4==0) {
                mod4+=i;
                bolunensayi++;
            }
        }
        bolunensayi+=1;//0 her iki sayıya da tam bölündüğü için else if in içindeki 0 ı almıyor bu yüzden bolunensayı yı 1 arttırıyoz
        System.out.println("Uc ile Bolunen Sayilarin Toplami:"+mod3);
        System.out.println("Dort Ile Bolunen Sayilarin Toplami:"+mod4);
        System.out.println("Ortalamaya Giren Sayi Adeti:"+bolunensayi);
        double ortlama= (double) (mod4+mod3)/bolunensayi;
        System.out.println("Sayilarin Ortalamasi:"+ortlama);
    }

}
