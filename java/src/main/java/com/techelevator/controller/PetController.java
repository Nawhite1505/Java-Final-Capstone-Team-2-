package com.techelevator.controller;

import com.techelevator.dao.PetDao;
import com.techelevator.model.Pet;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class PetController {
    private PetDao petDao;
    public PetController(PetDao petDao) {
        this.petDao = petDao;
    }
    @GetMapping("/pets")
    public List<Pet> getPets(){
        return petDao.getPets();
    }
}
