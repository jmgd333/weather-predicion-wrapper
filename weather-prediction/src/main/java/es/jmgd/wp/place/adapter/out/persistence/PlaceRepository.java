package es.jmgd.wp.place.adapter.out.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlaceRepository extends MongoRepository<PlaceEntity, String> {
	boolean existsByPlaceName(String placeName);

}
