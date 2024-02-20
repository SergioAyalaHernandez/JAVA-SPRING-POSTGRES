package com.example.javaspringmarket.persistence.crud;

import com.example.javaspringmarket.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //se puede usar el modo de "findBy..." y él nos ayuda con lo que queremos, sin el query native
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    //query native
    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> getByCategoria(int idCategoria);


    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
