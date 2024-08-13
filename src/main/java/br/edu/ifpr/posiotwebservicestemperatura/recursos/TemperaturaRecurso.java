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

        Temperatura t1 = new Temperatura();
        t1.temperatura = 33.5;
        t1.timestamp = LocalDateTime.now();
        t1.sensor = "S555";

        Temperatura t2 = new Temperatura();
        t2.temperatura = 35.8;
        t2.timestamp = LocalDateTime.now();
        t2.sensor = "S555";

        Temperatura t3 = new Temperatura();
        t3.temperatura = 38.8;
        t3.timestamp = LocalDateTime.now();
        t3.sensor = "S555";

        List<Temperatura> temperaturas = Arrays.asList(t1, t2, t3);

        return ResponseEntity.ok().body(temperaturas);

    }

    @PostMapping
    public ResponseEntity<Temperatura> cadastrar(@RequestBody Temperatura temp){

        repositorio.save(temp);

        return ResponseEntity.ok().build();
    }
}
