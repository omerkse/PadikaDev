import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sayi1,sayi2,i=1,ekok=0,ebob = 0;
        System.out.print("Birinci Sayiyi Giriniz: ");
        sayi1=scn.nextInt();
        System.out.print("Ikinci Sayiyi Griniz: ");
        sayi2=scn.nextInt();
        if(sayi1>=sayi2){
            while (i<=sayi2){
                if(sayi1%i==0 && sayi2%i==0){
                    ebob=i;
                    ekok=(sayi1*sayi2)/ebob;
                }
                i++;
            }
        }else{
            while (i<=sayi1){
                if (sayi1%i==0 && sayi2%i==0){
                    ebob=i;
                    ekok=(sayi1*sayi2)/ebob;
                }
                i++;
            }
        }
        System.out.println("Sayilarin EBOB'U: "+ebob);
        System.out.println("Sayilarin EKOK'u: "+ekok);
    }
}
