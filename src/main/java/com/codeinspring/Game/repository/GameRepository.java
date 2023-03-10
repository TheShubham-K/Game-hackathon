package com.codeinspring.Game.repository;

import com.codeinspring.Game.dao.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface GameRepository extends JpaRepository<Game, Integer> {

    Optional<Game> findById(Integer id);
    List<Game> findAllByOrderByIdAsc();
    List<Game> findAllByTitleContainsOrPlatformContainsOrScoreContainsOrGenreContainsOrderById(String title, String platform, String score, String genre);
}
