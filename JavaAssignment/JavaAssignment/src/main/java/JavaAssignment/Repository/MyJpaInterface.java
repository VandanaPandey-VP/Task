package JavaAssignment.Repository;


import JavaAssignment.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MyJpaInterface extends JpaRepository<Employee, Long> {
    List<Employee> findByExitDateAfter(LocalDate date);

}