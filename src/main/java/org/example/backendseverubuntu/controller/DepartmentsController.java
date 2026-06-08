package org.example.backendseverubuntu.controller;

import lombok.RequiredArgsConstructor;
import org.example.backendseverubuntu.entity.Departments;
import org.example.backendseverubuntu.repository.DepartmentsRepository;
import org.example.backendseverubuntu.service.DepartmentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/departments")
@RequiredArgsConstructor
public class DepartmentsController {

    private final DepartmentsService departmentsService;

    @GetMapping
    public List<Departments> findAll() {
        return departmentsService.getAllDepartments();
    }
}
