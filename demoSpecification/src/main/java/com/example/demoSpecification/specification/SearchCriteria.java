package com.example.demoSpecification.specification;

import jakarta.persistence.Entity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchCriteria {
        private String key;
        private String operation;
        private Object value;

}
