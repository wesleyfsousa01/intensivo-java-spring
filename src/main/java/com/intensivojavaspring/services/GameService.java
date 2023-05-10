package com.intensivojavaspring.services;

import com.intensivojavaspring.dto.GameDTO;
import com.intensivojavaspring.dto.GameMinDTO;
import com.intensivojavaspring.entities.Game;
import com.intensivojavaspring.projections.GameMinProjection;
import com.intensivojavaspring.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> list = gameRepository.findAll();
        return list.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        return list.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
