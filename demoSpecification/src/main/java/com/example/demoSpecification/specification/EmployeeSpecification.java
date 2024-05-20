package com.example.demoSpecification.specification;


import com.example.demoSpecification.entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

public class EmployeeSpecification {


    public static Specification<Employee> hasAgeGreaterThanOrEqual(Integer age) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.greaterThanOrEqualTo(root.get("age"), age);
    }

    public static Specification<Employee> hasAgeLessThanOrEqual(Integer age) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.lessThanOrEqualTo(root.get("age"), age);
    }

    public static Specification<Employee> emailContains(String emailFragment) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(root.get("email"), "%" + emailFragment + "%");
    }

    public static Specification<Employee> firstNameStartsWith(String prefix) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(root.get("firstName"), prefix + "%");
    }

    public static Specification<Employee> lastNameEndsWith(String suffix) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(root.get("lastName"), "%" + suffix);
    }

    public static Specification<Employee> ageBetween(Integer startAge, Integer endAge) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.between(root.get("age"), startAge, endAge);
    }

}
