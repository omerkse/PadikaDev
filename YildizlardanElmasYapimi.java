import java.util.Scanner;

public class YildizlardanElmasYapimi {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sayi;
        System.out.print("Lütfen Sayi Giriniz: ");
        sayi=scn.nextInt();
        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <=(sayi-i) ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i)-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<sayi; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*sayi-(2*i+1)); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
