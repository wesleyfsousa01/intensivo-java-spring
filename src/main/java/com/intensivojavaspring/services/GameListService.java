package com.intensivojavaspring.services;

import com.intensivojavaspring.dto.GameDTO;
import com.intensivojavaspring.dto.GameListDTO;
import com.intensivojavaspring.dto.GameMinDTO;
import com.intensivojavaspring.entities.Game;
import com.intensivojavaspring.entities.GameList;
import com.intensivojavaspring.repository.GameListRepository;
import com.intensivojavaspring.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> list = gameListRepository.findAll();
        return list.stream().map(x -> new GameListDTO(x)).toList();
    }

}
