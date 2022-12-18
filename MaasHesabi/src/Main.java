public class Main {
    public static void main(String[] args) {

        Calisan calisan = new Calisan("Omer Kose",3000,45,2010);
        System.out.println(calisan.toString());
        System.out.println("Vergi: "+calisan.vergiHesapla());
        System.out.println("Mesai Ucreti: "+calisan.mesai());
        System.out.println("Yıllik Zam Miktari:"+calisan.yillikZam());
        System.out.println("Net Maas:"+calisan.toplam());
    }
}