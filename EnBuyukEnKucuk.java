import java.util.Scanner;

public class EnBuyukEnKucuk {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int adet, sayi, max = 0;
        System.out.println("Kac Adet Sayi Gireceksiniz:");
        adet = scn.nextInt();
        int min = 0;
        for (int i = 1; i <= adet; i++) {
            System.out.println(i + ". Sayiyi Giriniz:");
            sayi = scn.nextInt();
            if (i == 1) {
                max = sayi;
                min = sayi;
            }
            if (sayi <= min) {
                min = sayi;
            } else if (sayi >= max) {
                max = sayi;
            }
        }

        System.out.println("En Büyük Sayı: "+max);
        System.out.println("En Küçük Sayı"+min);
    }
}
