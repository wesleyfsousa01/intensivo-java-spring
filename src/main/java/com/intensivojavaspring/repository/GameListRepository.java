package com.intensivojavaspring.repository;

import com.intensivojavaspring.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long>{

}
