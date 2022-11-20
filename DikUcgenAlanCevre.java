import java.util.Scanner;

public class DikUcgenAlanCevre {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int kenar1,kenar2,kenar3;
        System.out.print("Ucgenin Kenar Uzunluklarini Giriniz:");
        kenar1=scn.nextInt();
        kenar2=scn.nextInt();
        kenar3=scn.nextInt();
        double u=(kenar1+kenar2+kenar3)/2;
        double cevre=2*u;
        double alan= Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Ucgenin Cevresi:"+cevre);
        System.out.println("Ucgenin Alani: "+alan);



    }
}
