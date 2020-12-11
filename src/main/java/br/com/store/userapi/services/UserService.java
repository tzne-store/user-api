package br.com.store.userapi.services;

import br.com.store.userapi.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User save( User user );

    User update( User user );

    User getById( String id );

    Page< User > search( String searchTerm, int page, int size );

    void delete( String id );

    void inactive( String id );
}
