package com.joel.ec.service.impl;


import com.joel.ec.model.dao.PersonaDao;
import com.joel.ec.model.entity.Persona;
import com.joel.ec.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private PersonaDao personaDao;

    @Override
    public List<Persona> listAll() {
        return (List) personaDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Persona findById(Integer id) {
        return personaDao.findById(id).orElse(null);
    }
}
