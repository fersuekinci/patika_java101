public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){

        if(isCheckWeight()){
            startChance();
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("-------Yeni Round---------");
                this.f2.health = this.f1.hit(this.f2);
                if(isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if(isWin()){
                    break;
                }
                printScore();
            }
        }
        else{
            System.out.println("Sporcuların sıkletleri uymuyor");
        }
    }

    boolean isCheckWeight(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.health==0) {
            System.out.println(this.f2.name + " kazandı.");
            return true;
        }
        else if(this.f2.health==0){
            System.out.println(this.f1.name + " kazandı.");
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can :" + f1.health);
        System.out.println(f2.name + " Kalan Can :" + f2.health);
    }

    boolean startChance(){
        int randomNumber = (int) (Math.random() * 2);
        if(randomNumber == 0){
            System.out.println("maça " + this.f1.name + " başlayacak.");
            this.f2.health = this.f1.hit(this.f2);
            return true;
        }
        else if(randomNumber == 1){
            System.out.println("maça " + this.f2.name + " başlayacak.");
            this.f1.health = this.f2.hit(this.f1);
            return true;
        }
        return false;
    }
}
