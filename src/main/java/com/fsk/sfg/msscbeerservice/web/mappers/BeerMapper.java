package com.fsk.sfg.msscbeerservice.web.mappers;

import com.fsk.sfg.msscbeerservice.domain.Beer;
import com.fsk.sfg.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
