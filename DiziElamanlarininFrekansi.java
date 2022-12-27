import java.sql.SQLOutput;

public class DiziElamanlarininFrekansi {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 20, 5, 20};
        int k = 1, toplam = 0, j;
        System.out.println("Tekrar Eden Sayilar");
        for (int i = 0; i < dizi.length - 1; i++) {
            for (j = 0; j < dizi.length - 1 - i; j++) {
                if (dizi[i] <= dizi[i + 1]) {

                }
            }
        }


        for (int i = 0; i < dizi.length - 1; i++) {
            k = 1;
            for (j = 1; j < dizi.length - 1; j++) {
                if ((dizi[i] == dizi[j]) && i != j) {
                    k++;

                }
                toplam = k;
            }
            if(i!=j){
                System.out.println(dizi[i]+" Elamni "+toplam+"Kere Kullanildi");
            }

        }
    }
}
