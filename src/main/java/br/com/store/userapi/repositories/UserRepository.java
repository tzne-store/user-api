package br.com.store.userapi.repositories;

import br.com.store.userapi.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository< User, String > {
}
