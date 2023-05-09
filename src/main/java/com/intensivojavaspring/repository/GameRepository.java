package com.intensivojavaspring.repository;

import com.intensivojavaspring.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
