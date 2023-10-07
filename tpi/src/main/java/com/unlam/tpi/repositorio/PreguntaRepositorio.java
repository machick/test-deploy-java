package com.unlam.tpi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unlam.tpi.modelo.persistente.Pregunta;

public interface PreguntaRepositorio extends JpaRepository<Pregunta, Long>{

}
