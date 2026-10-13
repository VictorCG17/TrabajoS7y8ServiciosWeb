package org.uam.gestionproductos.repository;

import org.uam.gestionproductos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    // Método del Paso 9
    List<Producto> findByCategoriaId(Integer categoriaId);

    // Método del Reto 2 (Fase 5)
    List<Producto> findByEtiquetas_Id(Integer etiquetaId);
}