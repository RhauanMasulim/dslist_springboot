package com.rhauan.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhauan.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
