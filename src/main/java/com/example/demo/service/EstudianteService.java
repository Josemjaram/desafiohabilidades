package com.example.demo.service;

import com.example.demo.model.Estudiante;
import com.example.demo.repository.Estudianterepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private final Estudianterepository repository;

    public EstudianteService(Estudianterepository repository) {
        this.repository = repository;
    }

    public Estudiante registrar(Estudiante estudiante) {

        repository.buscarPorId(estudiante.getId())
                .ifPresent(e -> {
                    throw new RuntimeException("ID duplicado");
                });

        return repository.guardar(estudiante);
    }

    public List<Estudiante> listar() {
        return repository.listar();
    }
}
