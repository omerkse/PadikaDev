import java.util.Scanner;
public class DortveBesinKatları {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int sayi;
        System.out.print("Bir Sayi Girin:");
        sayi=scn.nextInt();
        for (int i=1; i<=sayi ; i*=4) {
            System.out.println("Dortun Kuvvetleri:"+i+",");

        }
        for (int i = 1; i <sayi ; i*=5) {
            System.out.println("Besin Kuvvetleri:"+i+",");
        }

    }
}
