package com.ecommerceutn.market.repositories;

import com.ecommerceutn.market.models.UsuarioModel;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepositoryImplementation<UsuarioModel, Long> {


}
