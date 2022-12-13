public class student {
    String name;
    String stuno;
    String year;
    course quiz;
    course finalexam;
    double average;
    boolean isPass;

    student(String name, String stuno, String year, course quiz, course finalexam) {
        this.name = name;
        this.stuno = stuno;
        this.year = year;
        this.quiz = quiz;
        this.finalexam = finalexam;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2) {
        if (note1 >= 0 && note1 <= 100) {
            this.quiz.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.finalexam.note = note2;
        }
    }

    void isPass() {
        System.out.println("====================");
        this.average = (this.quiz.note) * 0.2 + (this.finalexam.note) * 0.8;
        if (this.average >= 55) {
            System.out.println("Congrats, You passed!");
            this.isPass = true;
        } else {
            System.out.println("Sorry, you didn't pass:(");
            this.isPass = false;
        }
    }

    void printNote() {
        System.out.println(this.quiz.name + " Grade:" + this.quiz.note);
        System.out.println(this.finalexam.name + " Final Grade:" + this.finalexam.note);
        System.out.println("Your GPA:" + this.average);
    }
}
