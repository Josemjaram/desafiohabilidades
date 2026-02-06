package com.example.demo.controller;

import com.example.demo.model.Estudiante;
import com.example.demo.repository.Estudianterepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final Estudianterepository repository;

    public EstudianteController(Estudianterepository repository) {
        this.repository = repository;
    }

    // =========================
    // POST → Registrar
    // =========================
    @PostMapping
    public ResponseEntity<?> registrar(@RequestBody Estudiante estudiante) {

        // Validar duplicado
        if (repository.buscarPorId(estudiante.getId()).isPresent()) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("Ya existe un estudiante con ese ID");
        }

        repository.guardar(estudiante);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(estudiante);
    }

    // =========================
    // GET → Listar
    // =========================
    @GetMapping
    public ResponseEntity<List<Estudiante>> listar() {
        return ResponseEntity.ok(repository.listar());
    }
}
