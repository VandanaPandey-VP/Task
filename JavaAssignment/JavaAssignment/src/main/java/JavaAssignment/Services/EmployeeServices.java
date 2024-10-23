package JavaAssignment.Services;


import JavaAssignment.Entity.Employee;
import JavaAssignment.Repository.MyJpaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeServices {

    @Autowired
   private MyJpaInterface myjpainterface;


    public List<Employee> saveEmployees(List<Employee> employees) {
        return myjpainterface.saveAll(employees);
    }

    public List<Employee> getEligibleEmployees(LocalDate date) {
        return myjpainterface.findByExitDateAfter(date);
    }

}
