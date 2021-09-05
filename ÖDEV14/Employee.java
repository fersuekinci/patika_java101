public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int tax(int salary){
        int tax=0;
        if(salary>=1000) {
            tax = (int) (this.salary * 0.03);
        }
        return tax;
    }

    int bonus(int workHours){
        int bonus=0;
        if(workHours>40){
            bonus = (this.workHours - 40)*30;
        }
        return bonus;
    }

    int raiseSalary(int salary){
        int date = 2021;
        int raise=0;
        if(date-this.hireYear<10){
            raise = (int) (this.salary*0.05);
        }
        if((date-this.hireYear>=10) && (date-this.hireYear<20)){
            raise = (int) (this.salary*0.10);
        }
        if(date-this.hireYear>=20){
            raise = (int) (this.salary*0.15);
        }
        return raise;
    }

    void toStringEmp(){
        System.out.println("Adı : " + this.name +"\n"
                + "Maaşı : " + this.salary + "\n"
                + "Çalışma Saati : " + this.workHours +"\n"
                + "Başlangıç Yılı : " + this.hireYear + "\n"
                + "Vergi : " + tax(salary) + "\n"
                + "Bonus : " + bonus(workHours) + "\n"
                + "Maaş Artışı : " + raiseSalary(salary) + "\n"
                + "Vergi ve Bonuslarla birlikte maaş : " + (salary - tax(salary) + bonus(workHours)) + "\n"
                + "Toplam Maaş : " + ((salary - tax(salary) + bonus(workHours)) + raiseSalary(salary)));
    }
}
