package br.edu.ifpr.posiotwebservicestemperatura.repositorios;

import br.edu.ifpr.posiotwebservicestemperatura.modelos.Temperatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperaturaRepositorio extends JpaRepository<Temperatura, Long> {}
