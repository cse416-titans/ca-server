package com.cse416.titans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cse416.titans.models.Ensemble;
import com.cse416.titans.service.EnsembleService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ClientController {

    private final EnsembleService ensembleService;

    @GetMapping("/ensemble")
    public Ensemble getEnsemble() {
        return ensembleService.getEnsembleByName("Ensemble1");
    }

    @GetMapping("/hi")
    public String Hello() {
        return "HELLO!";
    }
    
}
