package com.formacionbdi.microservicios.app.cursos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.microservicios.app.cursos.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

}
