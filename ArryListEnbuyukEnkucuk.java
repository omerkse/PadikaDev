public class ArryListEnbuyukEnkucuk {
    public static void main(String[] args) {
        int[] dizi={22,36,1,-2,3,7,65,-10,5};

        int enBuyuk=dizi[0];
        int enKucuk=dizi[0];

        for (int i:dizi) {
            if (i < enKucuk) {
                enKucuk = i;
            }
            if (i >enBuyuk) {
                enBuyuk = i;
            }

        }
        System.out.println("Dizideki En Buyuk Sayi:"+enBuyuk);
        System.out.println("Dizideki En Kucuk Sayi:"+enKucuk);

    }
}
