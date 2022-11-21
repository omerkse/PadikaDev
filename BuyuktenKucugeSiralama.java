import java.util.Scanner;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sayi1,sayi2,sayi3;
        System.out.print("1.Sayiyi Giriniz:");
        sayi1=scn.nextInt();
        System.out.print("2.Sayiyi Giriniz:");
        sayi2=scn.nextInt();
        System.out.print("3.Sayiyi Giriniz");
        sayi3=scn.nextInt();
        if(sayi1>=sayi2 && sayi1>= sayi3 && sayi2>=sayi3){
            System.out.println(sayi1+">"+sayi2+">"+sayi3);
        }
        else if (sayi1>=sayi2 && sayi1>= sayi3 && sayi3>=sayi2){
            System.out.println(sayi1+">"+sayi3+">"+sayi2);
        }
        else if (sayi2>=sayi1 && sayi2>= sayi3 && sayi1>=sayi3) {
            System.out.println(sayi2+">"+sayi1+">"+sayi3);
        }
        else if (sayi2>=sayi1 && sayi2>= sayi3 && sayi3>=sayi1) {
            System.out.println(sayi2+">"+sayi3+">"+sayi1);
        }
        else if (sayi3>=sayi1 && sayi3>= sayi2 && sayi1>=sayi2) {
            System.out.println(sayi3+">"+sayi1+">"+sayi2);
        }
        else{
            System.out.println(sayi3+">"+sayi2+">"+sayi1);
        }
    }
}
