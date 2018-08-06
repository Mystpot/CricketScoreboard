package com.gareth.repositories;

import com.gareth.model.Batsman;
import org.springframework.data.repository.CrudRepository;

public interface BatsmanRepository extends CrudRepository<Batsman, Integer>
{

}
