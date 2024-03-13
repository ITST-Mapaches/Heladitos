package com.beto.heladitos.documentos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import java.util.Date;

//le indicamos que esta clase representa una coleccion llamada paletas
@Document(collection = "paletas")
public class Paletas {
    //atributos de clase que regresentan los atributos en la base de datos
    //@Id indica que es el atributo de abajo es el id en la base de datos
    @Id
    private ObjectId id;
    private String nombre;
    private int cantidad;
    private Date caducidad;

    //constructor parametrizado
    public Paletas(ObjectId id, String nombre, int cantidad, Date caducidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.caducidad = caducidad;
    }

    //metodos de acceso
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
