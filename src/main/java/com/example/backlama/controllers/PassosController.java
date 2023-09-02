package com.example.backlama.controllers;

import com.example.backlama.models.Passos;
import com.example.backlama.services.PassosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passos")
public class PassosController {
    private final PassosService passosService;

    public PassosController(PassosService passosService) {
        this.passosService = passosService;
    }
    @PostMapping("/criar")
    public ResponseEntity<Passos> criarPassos(@RequestBody Passos passos) {
        Passos novaPassos = passosService.criarPassos(passos);
        return new ResponseEntity<>(novaPassos, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Passos> visualizarPassos(@PathVariable Long id) {
        Passos passos = passosService.buscarPassosPorId(id);
        if (passos != null) {
            return new ResponseEntity<>(passos, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<Passos> editarPassos(@PathVariable Long id, @RequestBody Passos passos) {
        Passos passosEditada = passosService.editarPassos(id, passos);
        if (passosEditada != null) {
            return new ResponseEntity<>(passosEditada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
