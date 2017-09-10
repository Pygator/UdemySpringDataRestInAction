package org.chucrew.springdatarest.employee.repository;

import org.chucrew.springdatarest.employee.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{



}
