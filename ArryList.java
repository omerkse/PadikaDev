public class ArryList {
    public static void main(String[] args) {
        int[] harmonik={1,2,3,4,5,6};
        double harmonikOrt=0;


        for (int i = 0; i <harmonik.length ; i++) {
            harmonikOrt+=(double)1/harmonik[i];
        }
        System.out.println(harmonikOrt);
    }
}
