import java.util.Scanner;

public class ArtıkYilBulma {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int yil;
        System.out.print("Yil Giriniz: ");
        yil=scn.nextInt();
        if(yil%4==0 && (yil%100==0 && yil%400==0)){
            System.out.println(yil+"Yili Artik Yildir");
        }else{
            System.out.println(yil+"Yili Artik Yil Degil");
        }


    }
}
