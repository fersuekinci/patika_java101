public class Student {
    String name;
    String studentNo;
    int classes;
    double avarage;
    boolean isPass;

    Course c1;
    Course c2;
    Course c3;

    Student(String name, String studentNo, int classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addExamNote(int note1, int note2, int note3){
        if(note1 >= 0 && note1 <= 100)
            this.c1.note = note1;
        if(note2 >= 0 && note2 <= 100)
            this.c2.note = note2;
        if(note3 >= 0 && note3 <= 100)
            this.c3.note = note3;
    }

    void addOralNote(int oralNote1, int oralNote2, int oralNote3){
        if(oralNote1 >= 0 && oralNote1 <= 100)
            this.c1.oralNote = oralNote1;
        if(oralNote2 >= 0 && oralNote2 <= 100)
            this.c2.oralNote = oralNote2;
        if(oralNote3 >= 0 && oralNote3 <= 100)
            this.c3.oralNote = oralNote3;
    }

    void isPass(){
        this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
    }

    void calcAvarage(){
        this.avarage = ((this.c1.note + this.c2.note + this.c3.note)/3.0)*0.8 + ((this.c1.oralNote + this.c2.oralNote + this.c3.oralNote)/3.0)*0.2;
    }
    boolean isCheckPass(){
        calcAvarage();
        return this.avarage > 55;
    }

    void printNote()
    {
        System.out.println(c1.name + " Sınav Notu\t : " + c1.note + " \tSözlü Notu\t : " + c1.oralNote);
        System.out.println(c2.name + " Sınav Notu\t : " + c2.note + " \tSözlü Notu\t : " + c2.oralNote);
        System.out.println(c3.name + " Sınav Notu\t : " + c3.note + " \tSözlü Notu\t : " + c3.oralNote);
    }
}
