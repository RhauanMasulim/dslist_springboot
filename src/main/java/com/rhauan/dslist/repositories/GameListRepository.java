package com.rhauan.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhauan.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
