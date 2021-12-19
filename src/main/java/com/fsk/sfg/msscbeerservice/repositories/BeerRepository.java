package com.fsk.sfg.msscbeerservice.repositories;

import com.fsk.sfg.msscbeerservice.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {

}
