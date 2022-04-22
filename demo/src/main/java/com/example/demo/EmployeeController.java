package com.example.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {
    @Autowired private EmployeeRepository repository;
    @Autowired private EmployeeService employeeService;

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/employees")
    List<Employee> all() {

        return repository.findAll();
    }


    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    // Single item

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
        return employeeService.putEmployee(newEmployee, id);
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

    //////////////////////////////////////
    //////////////////////////////////////
    //update bulk operation**************

    @PutMapping("/employees/bulk")
    int bulkUpdate(@RequestBody List<Employee> newEmployees) {
        return employeeService.putEmployees(newEmployees);
    }

//    @DeleteMapping("/employees/delete/bulk")
//    void BulkDeleteEmployee(@RequestBody List<Long> ids){
//        repository.deleteAllById(ids);
//    }
//
    @DeleteMapping("/employees/delete/bulk/{id}")
    void bulkDeleteEmployee(@RequestBody List<Long> ids){
        repository.deleteAllById(ids);
    }

//    @DeleteMapping("/employees/delete/bulk")
//    void BulkDeleteEmployee(@RequestBody List<Employee> ids){
//        repository.deleteAllById(ids);
//        for(int i = 0; i < ids.size(); i++) {
//            repository.deleteById(ids.get(i));
//        }
//
//        Iterator<Long> idsIterator = ids.iterator();
//        while(idsIterator.hasNext()) {
//            repository.deleteById(idsIterator.next());
//        }
//
//        for(Long id : ids) {
//
//        }

//        ids
//                .stream()
//                .forEach(
//                        a -> repository.deleteById(a)
//                );

//        Map<Long, Employee> employeeMap = new HashMap<>();
//        for (Employee employee: ids) {
//            employeeMap.put(employee.getId(), employee);
//        }
//
//        ids.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
//    }

//    @DeleteMapping("/employees/delete/bulk")
//    void BulkDeleteEmployee(@RequestBody List<Employee> employees){
//        repository.deleteAll(employees);
//    }



}