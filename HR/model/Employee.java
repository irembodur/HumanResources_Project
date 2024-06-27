package com.example.HR.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // bu anotasyon, bu sınıfın bir veritabanı tablosuna karşılık geldiğini belirtir.
public class Employee {

    @Id  // bu anotasyon,'id' alanının bbirincil anahtar olduğunu belirtilir.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // bu anotasyon, 'id' alanının otomatik oolarak arttırılacağını belirtir.

    private Long Id; //çalışanın benzersiz kimliği
    private String name; //çalışanın adı
    private String position; //çalışanın pozisyonu

    // getter vve setter metodları
    // getter, özel alanların dğeerini okumak için kullanılır.
    // setter, özel alanların değerini ayarlamak için kullanılır.


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
