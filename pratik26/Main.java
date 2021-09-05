public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("a",10,120,100,100);
        Fighter f2 = new Fighter("b",20,85,95,50);

        Match match1 = new Match(f1,f2,90,100);
        match1.run();
    }
}
