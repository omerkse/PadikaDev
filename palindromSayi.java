public class palindromSayi {
    public static int palindrom(int sayi){
        int tersSayi=0,geciciSayi,toplam;
        geciciSayi=sayi;
        while (geciciSayi !=0){
            toplam=geciciSayi%10;
            tersSayi=(tersSayi*10)+toplam;
            geciciSayi/=10;
        }
        if(tersSayi==sayi){
            System.out.println("Girdiğiniz Sayi Palindrom");
        }else {
            System.out.println("palindrom degil");
        }

        return tersSayi;
    }
    public static void main(String[] args) {
        int sayi=palindrom(77);
        System.out.println(sayi);

    }
}
