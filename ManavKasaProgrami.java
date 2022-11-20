import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double armutf=2.14,elmaf=3.67,domatesf=1.11,muzf=0.95,patlicanf=5.0;
        double armutk,elmak,domatesk,muzk,patlicank;
        System.out.print("Kac Kilo Armut Aldinz: ");
        armutk=scn.nextDouble();
        System.out.print("Kac Kilo Elma Aldinz: ");
        elmak=scn.nextDouble();
        System.out.print("Kac Kilo Domates Aldinz: ");
        domatesk=scn.nextDouble();
        System.out.print("Kac Kilo Muz Aldinz: ");
        muzk=scn.nextDouble();
        System.out.print("Kac Kilo Patlican Aldinz: ");
        patlicank=scn.nextDouble();

        armutf*=armutk;
        elmaf*=elmak;
        domatesf*=domatesk;
        muzf*=muzk;
        patlicanf*=patlicank;
        double toplam=armutf+elmaf+domatesf+muzf+patlicanf;
        System.out.println("Meyve Sebzelerin Toplam Tutari: "+toplam);

    }
}
