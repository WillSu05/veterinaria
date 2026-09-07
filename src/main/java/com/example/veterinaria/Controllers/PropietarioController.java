package com.example.veterinaria.Controllers;

import com.example.veterinaria.Entity.Propietario;
import com.example.veterinaria.Exceptions.RecursoNoEncontrado;
import com.example.veterinaria.Service.PropietarioService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propietario")
@AllArgsConstructor
public class PropietarioController {
    private final PropietarioService propietarioService;

    @GetMapping("/listarPropietarios")
    public ResponseEntity<List<Propietario>> listarTodos() {
        var propietarios = propietarioService.listarTodos();
        return ResponseEntity.ok(propietarios);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity <Propietario> buscarPorId(@PathVariable Long id) {
        var propietario = propietarioService.buscarPorId(id);
        return ResponseEntity.ok(propietario);
    }


    @PostMapping("/crearPropietario")
    public ResponseEntity <Propietario> guardar(@RequestBody Propietario propietario) {
        return ResponseEntity.ok(propietarioService.guardar(propietario));
    }

    @PutMapping("/actualizarPropietario")
    public ResponseEntity <Propietario> actualizar(@PathVariable Long id, @RequestBody Propietario propietario) {
        var propietarioActu =propietarioService.actualizar(id, propietario);

        return(propietarioActu !=null)
                ? ResponseEntity.ok(propietarioActu)
                : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(Long id) {
        propietarioService.eliminar(id);
    }

}
