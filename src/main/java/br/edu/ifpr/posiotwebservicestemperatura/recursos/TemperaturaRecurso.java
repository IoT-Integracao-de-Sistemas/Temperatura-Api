package br.edu.ifpr.posiotwebservicestemperatura.recursos;

import br.edu.ifpr.posiotwebservicestemperatura.modelos.Temperatura;
import br.edu.ifpr.posiotwebservicestemperatura.repositorios.TemperaturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/temperaturas")
public class TemperaturaRecurso {

    @Autowired
    TemperaturaRepositorio repositorio;

    @GetMapping
    public ResponseEntity obterTemperaturas(){
        
        List<Temperatura> temperaturas = repositorio.findAll();

        return ResponseEntity.ok().body(temperaturas);
    }

    @PostMapping
    public ResponseEntity<Temperatura> cadastrar(@RequestBody Temperatura temp){

        repositorio.save(temp);

        return ResponseEntity.ok().build();
    }
}
