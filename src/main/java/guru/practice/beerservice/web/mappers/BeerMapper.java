package guru.practice.beerservice.web.mappers;

import org.mapstruct.Mapper;

import guru.practice.beerservice.domain.Beer;
import guru.practice.beerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
