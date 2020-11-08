package com.fpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpl.entity.Fixture;

public interface FixtureRepository extends JpaRepository<Fixture, Integer> {

}