package com.diegomd.ds_list.dto;

import com.diegomd.ds_list.entities.Game;
import lombok.Getter;

@Getter
public class GameMinDTO {
    private final Long id;
    private final String title;
    private final Integer year;
    private final String shortDescription;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        shortDescription = entity.getShortDescription();
    }
}
