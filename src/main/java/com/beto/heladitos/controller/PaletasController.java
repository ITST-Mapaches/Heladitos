package com.beto.heladitos.controller;

import com.beto.heladitos.documentos.Paletas;
import com.beto.heladitos.repository.PaletasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// RestController indica que este será un controlador rest
//requestMapping: indica que url usaremos para usar este controlador
@RestController
@RequestMapping("/paletas")
public class PaletasController {

    //
    @Autowired
    private PaletasRepository paletas;

    //endpoint para agregar una paleta
    @PostMapping("/agregar")
    public ResponseEntity<?> savePaleta(@RequestBody Paletas paleta) {
        try {
            Paletas paletaSave = paletas.save(paleta);
            return new ResponseEntity<Paletas>(paletaSave, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getCause().toString(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //endpoint para recuperar las paletas
    @GetMapping("/mostrar")
    public ResponseEntity<?> mostrarPaletas() {
        try {
            List<Paletas> paletasList = paletas.findAll();
            return new ResponseEntity<List<Paletas>>(paletasList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getCause().toString(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //endpoint para actualizar una paleta
    @PutMapping("/editar")
    public ResponseEntity<?> editarPaleta(@RequestBody Paletas paleta) {
        try {
            Paletas paletaUpdate = paletas.save(paleta);
            return new ResponseEntity<Paletas>(paletaUpdate, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getCause().toString(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //endpoint para eliminar una paleta
    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminarPaleta(@RequestBody Paletas paleta) {
        try {
            paletas.delete(paleta);
            return new ResponseEntity<Paletas>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getCause().toString(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
