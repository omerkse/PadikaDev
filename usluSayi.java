import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int taban = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = scan.nextInt();
        int sonuc = 1;
        System.out.print("Sonuç: " + calculate(taban, us, sonuc));
    }

    static int calculate(int taban, int us, int sonuc) {
        if (us == 0 && sonuc == 1) {
            return 1;
        }
        sonuc *= taban;
        us -= 1;
        if (us > 0) {
            return calculate(taban, us , sonuc);
        } else return sonuc;

    }

}


