import java.util.Scanner;

public class DaireAlanHesabi {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int yaricap,aci;
        double pi=3.14,alan;
        System.out.print("Dairenin Yari Capini Giriniz: ");
        yaricap=scn.nextInt();
        System.out.print("Aciyi Giriniz: ");
        aci=scn.nextInt();
        alan=(pi*yaricap*yaricap*aci)/360;
        System.out.println("Dairenin Alani: "+alan);

    }
}
