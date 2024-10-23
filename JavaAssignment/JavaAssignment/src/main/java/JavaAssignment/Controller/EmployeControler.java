package JavaAssignment.Controller;


import JavaAssignment.Entity.Employee;
import JavaAssignment.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/tci/employee-bonus")
public class EmployeControler {
    @Autowired
    private EmployeeServices employeeServices;

    @PostMapping
    public ResponseEntity<List<Employee>> createEmployees(@RequestBody List<Employee> employees) {
        List<Employee> savedEmployees = employeeServices.saveEmployees(employees);
        return ResponseEntity.ok(savedEmployees);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getEligibleEmployees(@RequestParam String date) {
        LocalDate eligibleDate = LocalDate.parse(date);
        List<Employee> eligibleEmployees = employeeServices.getEligibleEmployees(eligibleDate);
        return ResponseEntity.ok(eligibleEmployees);
    }
}
