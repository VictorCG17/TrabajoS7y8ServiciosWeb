package org.uam.gestionproductos.repository;

import org.uam.gestionproductos.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}