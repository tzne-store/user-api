package br.com.store.userapi.services;

import br.com.store.userapi.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User save( User user );

    User update( User user );

    User getById( String id );

    void delete( String id );

    void inactive( String id );
}
