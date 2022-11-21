import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int math, physics,turkish,science,music,lessons = 0;
        double average,sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Matematik notunuz :");
        math = sc.nextInt();
        if (0<=math && math<=100){
            lessons +=1;
            sum += math;
        }
        System.out.println("Fizik notunuz :");
        physics = sc.nextInt();
        if (0<=physics && physics<=100){
            lessons +=1;
            sum += physics;
        }

        System.out.println("Türkçe notunuz :");
        turkish = sc.nextInt();
        if (0<=turkish && turkish<=100){
            lessons +=1;
            sum += turkish;
        }

        System.out.println("Kimya notunuz :");
        science = sc.nextInt();
        if (0<=science && science<=100){
            lessons +=1;
            sum += science;
        }

        System.out.println("Müzik notunuz :");
        music = sc.nextInt();
        if (0<=music && music<=100){
            lessons +=1;
            sum += music;
        }


        average = sum / lessons;

        if (average <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere");
            System.out.println("Ortalamanız :" + average);
        }else {
            System.out.println("Tebrikler , geçtiniz !");
            System.out.println("Ortalamanız :" + average);
        }
        System.out.println("Ortalamanız :" + average);
    }
}
