import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int kilo;
        double boy,vkIndeks;
        System.out.print("Lutfen Boyunuzu Metre Cinsinden Giriniz: ");
        boy=scn.nextDouble();
        System.out.print("Lutfen Kilonuzu Giriniz");
        kilo= scn.nextInt();
        vkIndeks=kilo/(boy*boy);
        System.out.println("vucut Kitle Indeksiniz: "+ vkIndeks);


    }
}
