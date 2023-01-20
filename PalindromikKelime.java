public class PalindromikKelime {


    public static void palindrom(String str) {
        String tersKelime = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersKelime += str.charAt(i);
        }

        if (str.equals(tersKelime))
            System.out.println("Girdiginiz Kelime Palindromik Kelimedir");
        else
            System.out.println("Girdiginiz Klelime Palindromik Kelime Degildir");
    }
    public static void main(String[] args) {
        palindrom("abba");
    }
}
