import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int fizik,kimya,biyoloji,matematik,turkce,tarih,edebiyat,muzik;
        System.out.println("Yıl Sonu Karne Ortlama Sistemine Hosgeldiniz");
        System.out.println("===========================================");
        System.out.print("Matematik Notunuzu Giriniz:");
        matematik=scn.nextInt();

        System.out.print("Fizik Notunuzu Girin:");
        fizik=scn.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        kimya=scn.nextInt();

        System.out.print("Biyoloji Notunuzu Girin:");
        biyoloji=scn.nextInt();

        System.out.print("Turkce Notunuzu Giriniz:");
        turkce=scn.nextInt();

        System.out.print("Tarih Notunuzu Giriniz:");
        tarih=scn.nextInt();

        System.out.print("Edebiyat Notunuzu Giriniz:");
        edebiyat=scn.nextInt();

        System.out.print("Muzik Notunuzu Girin:");
        muzik=scn.nextInt();

        int toplam=matematik+fizik+kimya+biyoloji+turkce+tarih+edebiyat+muzik;
        double ortalama=toplam/8;
        System.out.println("Yıl Sonu Karne Ortalamanız: "+ortalama);

        String str= (ortalama>=50) ? "Sınıfı Gectniz" : "Sınıf Tekrarı";
        System.out.println(str);
    }
}