package com.diegomd.ds_list.repositories;

import com.diegomd.ds_list.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
