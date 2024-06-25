package com.evaluation.symbol.controller;


import com.evaluation.symbol.model.Excuse;
import com.evaluation.symbol.service.ExcuseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ExcuseController {
    // A constructor injection.

    private final ExcuseService excuseService;


    /**
     * This function returns a list of all excuses in the database
     *
     * @return A list of excuses
     */
    @GetMapping("/excuses")
    public ResponseEntity<List<Excuse>> findAllExcuses(){
        return ResponseEntity.ok(this.excuseService.findAll());
    }
    /**
     * This function takes in a JSON object, creates an excuse object from it, and returns a response
     * entity with the status code 201 and the excuse object
     *
     * @param excuse The excuse object that will be created.
     * @return A ResponseEntity with a status of CREATED and the body of the Excuse object that was
     * created.
     */
    @PostMapping("/excuses")
    public ResponseEntity<Excuse> createExcuse(@RequestBody Excuse excuse)  {

        return ResponseEntity.status(HttpStatus.CREATED).body(this.excuseService.create(excuse));
    }


}
