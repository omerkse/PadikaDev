public class course {
    String name;
    String code;
    String prefix;
    int note;
    teacher teacher;

    course(String name, String code, String prefix) {
        int note = 0;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(teacher teacher) {
        if (teacher.branch.equals(prefix)) {
            this.teacher = teacher;
            printTeacher();
        } else {
            System.out.println("Branch and Teacher aren't compatible!");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }
}