package com.example.DemoAPI.services;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@org.springframework.stereotype.Service
public interface Service<T, ID> {
    List<T> findAll();
    Optional<T> findById(ID id);
    T save(T entity);
    Optional<T> update(ID id, T entity);
    boolean deleteById(ID id);
}
