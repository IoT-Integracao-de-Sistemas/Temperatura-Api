package br.edu.ifpr.posiotwebservicestemperatura.modelos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Temperatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Double temperatura;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime timestamp;

    public String sensor;

    @Override
    public String toString() {
        return "Temperatura{" +
                "id=" + id +
                ", temperatura=" + temperatura +
                ", timestamp=" + timestamp +
                ", sensor='" + sensor + '\'' +
                '}';
    }
}
