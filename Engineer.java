package Merve_Hoca_Mext.Day2;

public class Engineer extends Employee { // 'public' bu sınıfın her yerden erişilebilir olduğunu belirtir.
    //'extend' , employee, engineer classını Employee sınıfından miras aldığını belirtir.
    // ' employee' sınıfından miraz aldığını belritir. Yani 'Engineer' sınıfının tüm özelliklerine ve metotlarına sahio olur.

    //CONSTUCTER ASLA RETURN DÖNDÜRMEZZ!!!!

    public Engineer(String name, double salary, int age) { // BU SINIFIN ÖRNEĞİNİ OLUŞTURURKEN ÇAĞIRILAN METOD.
        super(name, salary, age); // Employee, sınıfınınn yapıcı metodunu çaağırır. 'name' , 'salary', 'age' parametrelerini Employee sınıfına iletir.
    }

    public double getAnnualBonus(){ // Engineer'in yıllık bonusunu hesaplayan metottur. Ve bu metodu döndürür. (return ile)
        return super.salary * .05;
    }

}


