package Merve_Hoca_Mext.Day2;

public class Salesperson extends Employee {
    // "extends" Employee, Salesperson classını (sınıfını) Employee sınıfından miras aldığını belirtir.
    //    // "Employee" sınıfından miras aldığını belirtir. Yani " salesperson" sınıfının tüm özelliklerine ve metotlarına sahip olur.
    private double comissionPercentage;

    public Salesperson(String name, double salary, int age,
                       double comissionPercentage) {
        super(name, salary, age); // name, salary ve age i başka sınıftan aldığımız için super'i kullandık.
        this.comissionPercentage = comissionPercentage;
    }

    public double getComissionPercentage() {
        return this.comissionPercentage;
    }

    public void raiseComission() {
        if (this.comissionPercentage < .30) {
            this.comissionPercentage =
                    this.comissionPercentage * 1.2;
        }
    }


}