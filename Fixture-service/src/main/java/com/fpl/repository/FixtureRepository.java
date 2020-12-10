package com.fpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpl.entity.Fixture;

@Repository
public interface FixtureRepository extends JpaRepository<Fixture, Integer> {

}