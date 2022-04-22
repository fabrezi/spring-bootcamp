package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EmployeeService {
    @Autowired private EmployeeRepository repository;

    public Employee putEmployee(Employee newEmployee, Long id) {
        newEmployee.setId(id);
        return putEmployee(newEmployee);
    }

    private Employee putEmployee(Employee newEmployee) {
        long id = newEmployee.getId();
        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }

    public int putEmployees(List<Employee> newEmployees) {
        int updated = 0;
        for (Employee employee : newEmployees) {
            putEmployee(employee);
            updated++;
        }
        return updated;
    }



}
