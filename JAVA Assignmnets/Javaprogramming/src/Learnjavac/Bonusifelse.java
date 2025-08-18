package Learnjavac;

public class Bonusifelse {

	public static void main(String[] args) {
		int salary = 20000;
        int bonus;

        if (salary == 20000) {
            bonus = 2000;
        } else {
            bonus = 1000;
        }

        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Amount: " + (salary + bonus));

	}

}
