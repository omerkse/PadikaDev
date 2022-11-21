import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int gun,ay;
        System.out.print("Dogdugunuz Gunu Giriniz:");
        gun=scn.nextInt();
        System.out.print("Dogdugunuz Ayi Giriniz:");
        ay=scn.nextInt();
        System.out.println("======================");
        if(ay==1){
            if (gun>=1 && gun<=21 && gun<=31){
                System.out.println("Oglak Burcusunuz");
            }else{
                System.out.println("Kova Burcusunuz");
            }
        }
        if (ay==2){
            if(gun>=1 && gun<=19){
                System.out.println("Kova Burcusunuz");
            }else{
                System.out.println("Balik Burcusunuz");
            }
        }
        if(ay==3){
            if(gun>=1 && gun<=20){
                System.out.println("Balik Burcusunuz");
            }else{
                System.out.println("Koc Burcusunuz");
            }
        }
        if(ay==4){
            if(gun>=1 && gun<=20){
                System.out.println("Koc Burcusunuz");
            }else{
                System.out.println("Boga Burcusunuz");
            }
        }
        if(ay==5){
            if(gun>=1 && gun<=21){
                System.out.println("Boga Burcusunuz");
            }
            else{
                System.out.println("Ikizler Burcusunuz");
            }
        }
        if(ay==6){
            if(gun>=1 && gun<=22){
                System.out.println("Ikizler Burcusunuz");
            }else{
                System.out.println("Yengec Burcusunuz");
            }
        }
        if(ay==7){
            if(gun>=1 && gun<=22){
                System.out.println("Yengec Burcusunuz");
            }else{
                System.out.println("Aslan Burcusunuz");
            }
        }
        if(ay==8){
            if(gun>=1 && gun<=22){
                System.out.println("Aslan Burcusunuz");
            }else{
                System.out.println("Basak Burcusunuz");
            }
        }
        if(ay==9){
            if(gun>=1 && gun<=22){
                System.out.println("Basak Burcusunuz");
            }else{
                System.out.println("Terazi Burcusunuz");
            }
        }
        if (ay == 10) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Terazi Burcusunuz");
            }else{
                System.out.println("Akrep Burcusunuz");
            }
        }
        if (ay == 11) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Akrep Burcusunuz");
            }else{
                System.out.println("Yay Burcusunuz");
            }
        }
        if (ay == 12) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Yay Burcusunuz");
            }else{
                System.out.println("Oglak Burcusunuz");
            }
        }

    }
}
