package Merve_Hoca_Mext.Day2;

public class Main {
    public static void main(String[] args) {
        Engineer employeeOne = new Engineer("Sally Robersts" , 8000, 34);

        Salesperson employeeTwo = new Salesperson("İrem Bodur" , 90000, 24, .25);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.getComissionPercentage();
        employeeTwo.raiseComission();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getComissionPercentage());
    }
}
