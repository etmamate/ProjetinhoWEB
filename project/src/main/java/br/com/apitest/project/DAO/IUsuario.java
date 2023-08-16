package br.com.apitest.project.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.apitest.project.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer>{
    
}
