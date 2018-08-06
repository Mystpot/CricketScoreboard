package com.gareth.repositories;

import com.gareth.model.Bowler;
import org.springframework.data.repository.CrudRepository;

public interface BowlerRepository extends CrudRepository<Bowler, Integer> {
}
