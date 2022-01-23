package guru.practice.beerservice.services;

import java.util.UUID;

import guru.practice.beerservice.web.model.BeerDto;

public interface BeerService {
	BeerDto getById(UUID beerId);

	BeerDto saveNewBeer(BeerDto beerDto);

	BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
