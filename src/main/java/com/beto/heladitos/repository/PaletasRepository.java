package com.beto.heladitos.repository;

import com.beto.heladitos.documentos.Paletas;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * En el contexto de Spring Boot en Java, un "repository" es una clase de Java que se utiliza para interactuar con una
 * base de datos o cualquier otra fuente de datos. Estos repositorios proporcionan una capa de abstracción sobre
 * las operaciones de acceso a datos, lo que permite a los desarrolladores realizar operaciones CRUD
 * (Crear, Leer, Actualizar, Borrar) de manera más sencilla y con menos código.
 */

//MongoRepository<ClaseDeCollection, tipoDatoId>
public interface PaletasRepository extends MongoRepository<Paletas, ObjectId> {
}
