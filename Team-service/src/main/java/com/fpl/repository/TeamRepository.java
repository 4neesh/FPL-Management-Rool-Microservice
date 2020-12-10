package com.fpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpl.service.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
