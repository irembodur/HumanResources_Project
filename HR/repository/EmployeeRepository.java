package com.example.HR.repository;


import com.example.HR.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // bu anatasyon, bu sınıfın bir spring veri tabanı deposu olduğunu belirtir.
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //
}
