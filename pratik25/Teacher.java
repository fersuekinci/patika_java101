public class Teacher {
    String name;
    String pno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name = name;
        this.pno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("adı : " + this.name);
        System.out.println("telefonu : " + this.pno);
        System.out.println("branşı : " + this.branch);
    }
}
