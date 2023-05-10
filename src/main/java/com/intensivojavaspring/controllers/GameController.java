package com.intensivojavaspring.controllers;

import com.intensivojavaspring.dto.GameDTO;
import com.intensivojavaspring.dto.GameMinDTO;
import com.intensivojavaspring.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> list = gameService.findAll();
        return list;
    }
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }
}
