package com.intensivojavaspring.services;

import com.intensivojavaspring.dto.GameMinDTO;
import com.intensivojavaspring.entities.Game;
import com.intensivojavaspring.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> list = gameRepository.findAll();
        return list.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
