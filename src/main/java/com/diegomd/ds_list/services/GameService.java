package com.diegomd.ds_list.services;

import com.diegomd.ds_list.dto.GameMinDTO;
import com.diegomd.ds_list.entities.Game;
import com.diegomd.ds_list.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
