public class Main {
    public static void main(String[] args) {
        teacher ogretmen = new teacher("Mahmut", "PHY", "530");

        course fizikquiz = new course("Fizik", "101", "PHY");
        fizikquiz.addTeacher(ogretmen);

        course fizikfinal = new course("Fizik", "102", "PHY");
        fizikfinal.addTeacher(ogretmen);


        student s1 = new student("Omer", "512", "2", fizikquiz, fizikfinal);
        s1.addBulkExamNote(78, 56);
        s1.isPass();
        s1.printNote();

    }
}