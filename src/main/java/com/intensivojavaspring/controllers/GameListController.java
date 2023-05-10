package com.intensivojavaspring.controllers;

import com.intensivojavaspring.dto.GameDTO;
import com.intensivojavaspring.dto.GameListDTO;
import com.intensivojavaspring.dto.GameMinDTO;
import com.intensivojavaspring.services.GameListService;
import com.intensivojavaspring.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> list = gameListService.findAll();
        return list;
    }

}
