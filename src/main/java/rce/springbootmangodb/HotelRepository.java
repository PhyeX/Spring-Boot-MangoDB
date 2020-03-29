package rce.springbootmangodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends MongoRepository<Hotel,String>{

    List<Hotel> findByPricePerNightIsLessThan (int maxPrice);

    @Query(value = "{'adress.city':?0}")
    List<Hotel> findByCity(String city);

    @Query(value = "{'adress.country':?0}")
    List<Hotel> findByCountry(String country);

}
