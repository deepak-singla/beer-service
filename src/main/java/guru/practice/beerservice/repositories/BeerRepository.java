package guru.practice.beerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import guru.practice.beerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
