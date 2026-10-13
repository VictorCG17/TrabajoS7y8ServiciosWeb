package org.uam.gestionproductos.controller;

import org.uam.gestionproductos.entity.Etiqueta;
import org.uam.gestionproductos.repository.EtiquetaRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/etiquetas")
public class EtiquetaController {
    private final EtiquetaRepository repository;

    public EtiquetaController(EtiquetaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Etiqueta guardar(@RequestBody Etiqueta etiqueta) {
        return repository.save(etiqueta);
    }
}