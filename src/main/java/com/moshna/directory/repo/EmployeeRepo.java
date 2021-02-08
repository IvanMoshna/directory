package com.moshna.directory.repo;

import com.moshna.directory.model.Employee;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long>, EmployeeRepoCustom, JpaSpecificationExecutor<Employee> {

    static Specification<Employee> hasFirstName(String fullName) {
        return (employee, cq, cb) -> cb.like(employee.get("fullName"), "%" + fullName + "%");
    }

    static Specification<Employee> hasPosition(String position) {
        return (employee, cq, cb) -> cb.like(employee.get("position"), "%" + position + "%");
    }


    static Specification<Employee> hasDepartment(String departmentName) {
        return (employee, cq, cb) -> cb.like(employee.get("departmentName"), "%" + departmentName + "%");
    }
}
