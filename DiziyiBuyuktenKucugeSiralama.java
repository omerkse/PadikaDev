import java.util.Scanner;

public class DiziyiBuyuktenKucugeSiralama {
    public static void main(String[] args) {
        int diziBoyut, temp, diziElaman;
        Scanner scn = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz:");
        diziBoyut = scn.nextInt();
        int[] dizi = new int[diziBoyut];

        for (int i = 0; i < diziBoyut; i++) {
            System.out.print(i + 1 + ". Dizi Elamanini Giriniz:");
            diziElaman = scn.nextInt();
            dizi[i] = diziElaman;
        }


        for (int i = 0; i < diziBoyut - 1; i++) {
            for (int j = 0; j < diziBoyut - i - 1; j++) {
                if (dizi[j] < dizi[j + 1]) {
                    temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Dizinin Buyukten Kucuge Siralanisi");
        for (int i = 0; i < diziBoyut; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
