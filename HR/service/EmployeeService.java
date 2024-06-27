package com.example.HR.service;


import com.example.HR.model.Employee;
import com.example.HR.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired  // Spring bu alanı otomatik olarak inject eder.
    private EmployeeRepository employeeRepository;

    public Employee hireEmployee (Employee employee){
        // yeni bir çalışanı veritabanına JPA'den gelen 'save' metodu ile kaydeder.
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        //tüm çalışanları veritabanından "findAll" metodyu ile getir.
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id){
        // belirtilen kimlikteki çalışanı veritabanına getirir.
        return  employeeRepository.findById(id);
    }

    public Employee updateEmployee(Long id, Employee employeeDetails){
        //belirtilen kimlekte çalışanı güncelleyen metod.

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Çalışan bulunamadi."));
        // orElse yani if öngüsünün else kısmı gibi düşünebilriz. Aradığımız çalışan bulunamadığında kullanıcıya böyle bir metin gösteriyoruz.

        employee.setName(employeeDetails.getName());
        employee.setPosition(employeeDetails.getPosition());


        return  employeeRepository.save(employee);
    }

    public void fireEmployee(Long id){
        //belirtilen kimlikteki çalışanı silen metod.
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Employee not found!"));

        //silme işkemini yapan 'delete' metodunu JPA repository içersinde çağırarak kullandık.4
        employeeRepository.delete(employee);
    }



}
