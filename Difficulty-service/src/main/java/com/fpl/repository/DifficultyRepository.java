package com.fpl.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.fpl.entity.Difficulty;

public interface DifficultyRepository extends JpaRepository<Difficulty, Integer>{


}