package com.game.service;


import com.game.controller.PlayerOrder;
import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;
import com.game.model.PlayerDto;

import java.util.List;

public interface PlayerService {

     List<Player> getAllPlayers(String name, String title, Race race, Profession profession,
                                Long after, Long before, Boolean banned, Integer minExperience,
                                Integer maxExperience, Integer minLevel, Integer maxLevel, PlayerOrder order,
                                Integer pageNumber, Integer pageSize);
     Integer getPlayersCount(String name, String title, Race race, Profession profession,
                          Long after, Long before, Boolean banned, Integer minExperience,
                          Integer maxExperience, Integer minLevel, Integer maxLevel);
     Player createPlayer(Player player);

     Player getPlayerById(Long id);



     Player updatePlayer(Long id,Player player);

     void deletePlayer(Long id);

}
