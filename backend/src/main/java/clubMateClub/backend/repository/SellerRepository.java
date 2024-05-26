package clubMateClub.backend.repository;

import clubMateClub.backend.model.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends MongoRepository<Seller, Long>{

}
