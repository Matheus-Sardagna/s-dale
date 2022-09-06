package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.FranquiaListagenDTO;
import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FranquiaService {

    @Autowired
    private FranquiaRepository franquiaRepository;

    public List<FranquiaListagenDTO> getAll(){
        return franquiaRepository.findAll().stream().map(fr ->{
            FranquiaListagenDTO dto = new FranquiaListagenDTO();
            dto.setId(fr.getNome());

        })
    }
}
