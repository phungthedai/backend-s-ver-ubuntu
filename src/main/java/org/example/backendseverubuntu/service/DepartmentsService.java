package org.example.backendseverubuntu.service;

import lombok.RequiredArgsConstructor;
import org.example.backendseverubuntu.entity.Departments;
import org.example.backendseverubuntu.repository.DepartmentsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentsService {

    private final DepartmentsRepository departmentsRepository;

    public List<Departments> getAllDepartments() {
        return departmentsRepository.findAll();
    }
}
