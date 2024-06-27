package Merve_Hoca_Mext.Day2;

public class Employee {

    //Çalışanın adını tutan bir metin değişkenidir.
    private String name; // "private" bu değişkenin sadece bu sınıfın içinden erişilebilir olduğunu belirtir.

    //Çalışanın  maaşını tutan ondalıklı sayı değişkeni
    protected double salary; // Bu değişkene aynı paket içerisinden veya alt sınıflardan erişilebilir.

    //Çalışanın yaşını tutan tam sayı değişkeni.
    private int age; // "private"

    public Employee(String name, double salary, int age) { //Bu sınıfın bir örneği oluşturulurken çağrılan metottur.
        this.name = name; // "name" parametresini sınıfın "name" değişkenine atar.
        this.salary = salary; // "salary" parametresini sınıfın "salary" değişkenine atar.
        this.age = age; // "age" parametresini aınıfın "age" değişkenine atar.
    }

    // Getter ve Setter Metotları:
    // Bu metotlar, özel değişkenlerin ddeğerlerini dış dünyaya(başka sınıflara yani) vermek için kullanılır.
    public String getName() {
        return this.name;

    }

    protected double getSalary() {
        return this.salary;
    }

    private int getAge() {
        return this.age;
    }

    public void raiseSalary() { //Çalışanın maaşını arttıran metot.
        this.salary = this.salary * 1.2; // %20 değerinde maaşı arttırır.
    }
}
