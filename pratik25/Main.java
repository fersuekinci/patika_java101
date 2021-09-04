public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("ahmet","0147","TRH");
        Teacher t2 = new Teacher("ahmet1","0123","FZK");
        Teacher t3 = new Teacher("ahmet2","145","BIO");

        Course tarih = new Course("tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyoloji = new Course("biyoloji","101","BIO");
        biyoloji.addTeacher(t3);
        
        Student s1 = new Student("mehmet", "123", 3,tarih,fizik,biyoloji);
        s1.addExamNote(100,100,100);
        s1.addOralNote(100,100,100);
        s1.isPass();
    }
}
