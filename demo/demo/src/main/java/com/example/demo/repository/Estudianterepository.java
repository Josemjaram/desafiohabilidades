package com.example.demo.repository;

import com.example.demo.model.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class Estudianterepository {

    // Lista en memoria
    private List<Estudiante> estudiantes = new ArrayList<>();

    // Guardar estudiante
    public Estudiante guardar(Estudiante estudiante) {
        estudiantes.add(estudiante);
        return estudiante;
    }

    // Buscar por ID
    public Optional<Estudiante> buscarPorId(String id) {
        return estudiantes.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }

    // Listar todos
    public List<Estudiante> listar() {
        return estudiantes;
    }
}
