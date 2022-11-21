import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double sicaklik;
        System.out.print("Lütfen Hava Sicakligini Giriniz:");
        sicaklik=scn.nextDouble();
        if(sicaklik<5){
            System.out.println("Sobada Kestane Cok Iyi Olur :)");
        } else if (sicaklik>=5 && sicaklik<=15) {
            System.out.println("Sicak Bir Kahve ile Kitap Okumak Cok Iyi Olur");
        } else if (sicaklik>15 && sicaklik<=25) {
            System.out.println("Arkadaslarla Kahve Toplantısı");
        } else {
            System.out.println("Aile veya Arkadaslarla Mangal Keyfi");
        }


    }
}
