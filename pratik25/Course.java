public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralNote;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralNote = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix))
            this.teacher = teacher;
        else
            System.out.println("öğretmen ve ders uyuşmuyor.");
    }

    void printTeacher(){
        if (teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
