package com.example.HR.controller;

import com.example.HR.model.Employee;
import com.example.HR.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // bu anatasyon, bu sınıfın kontrol sınıfı/restful web servisi olduğunu belirtir.
@RequestMapping //Temel URLini belirtir.
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/hire") // Bu anotasyon ile işaretlenen bu metot, bir çalışanı işe almak için kullanılır.
    public Employee hireEmployee(@RequestBody Employee employee) {
        return employeeService.hireEmployee(employee);
    }

    @GetMapping /* Çalışanları getirmek için service sınfımızdan oluşturduğumuz "getAllEmployees"
     metotu çağırarak döndürüyoruz.*/
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}") /* Belitilen kimlikteki çalışan bilgilerini bu metot
    ile update/güncelliyoruz.*/
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        return employeeService.updateEmployee(id, employeeDetails);
    }


}
