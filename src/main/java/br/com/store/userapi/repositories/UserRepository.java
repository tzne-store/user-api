package br.com.store.userapi.repositories;

import br.com.store.userapi.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository< User, String > {
    @Query( "FROM user u WHERE LOWER(u.firstName) LIKE %:searchTerm% OR LOWER(u.cpf) LIKE %:searchTerm% OR LOWER(u.email) LIKE %:searchTerm%" )
    Page< User > search( @Param( "searchTerm" ) String searchTerm, Pageable pageable );
}
