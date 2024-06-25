package com.evaluation.symbol.service;

import com.evaluation.symbol.exception.HttpCodeAlreadyExistException;
import com.evaluation.symbol.model.Excuse;
import com.evaluation.symbol.repository.ExcuseRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor

public class ExcuseService {

    // Creating a private final variable called excuseRepository.
    private final ExcuseRepository excuseRepository;

    /**
     * It returns a list of excuses from the database
     *
     * @return A list of excuses.
     */
    public List<Excuse> findAll() {
        List<Excuse> excusesList = excuseRepository.findAll();
        return excusesList;
    }

 
/**
 * If the excuse exists, throw a 409 Conflict error. Otherwise, save the excuse
 * 
 * @param excuse The excuse object that will be created.
 */
public  Excuse create(Excuse excuse) {
    if(excuseRepository.existsById(excuse.getHttp_code())){
        throw  new HttpCodeAlreadyExistException("Le code http exist deja,changer le code et tout ira bien");
    }
    return excuseRepository.save(excuse);
}
}
