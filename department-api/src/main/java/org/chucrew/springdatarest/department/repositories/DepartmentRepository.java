package org.chucrew.springdatarest.department.repositories;


import org.chucrew.springdatarest.department.entities.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
