public class TekrarEdenCiftSayilariBulma {
    public static void main(String[] args) {
        int[] dizi={1,2,3,4,5,6,1,2,3,8,6,4,3};
        int k=0;
        int[] cift = new int[dizi.length];

        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (i!=j && (dizi[i]%2==0) && dizi[i]==dizi[j]){
                    cift[k++]=dizi[i];

                }
            }
        }
        for (int value:cift) {
            if(value!=0){
                System.out.println(value);
            }
        }
    }
}
