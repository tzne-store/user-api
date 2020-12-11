package br.com.store.userapi.services.impl;

import br.com.store.userapi.entities.User;
import br.com.store.userapi.repositories.UserRepository;
import br.com.store.userapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final static String PARAMETER_NAME = "firstName";

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save( User user ) {
        return userRepository.save( user );
    }

    @Override
    public User update( User user ) {
        return userRepository.save( user );
    }

    @Override
    public User getById( String id ) {
        Optional< User > user = userRepository.findById( id );
        if( user.isPresent() ) {
            return user.get();
        }
        throw new Error( "Not Found" );
    }

    @Override
    public Page< User > search( String searchTerm, int page, int size ) {
        PageRequest pageRequest = PageRequest.of( page, size, Sort.Direction.ASC, PARAMETER_NAME );
        return userRepository.search( searchTerm.toLowerCase(), pageRequest );
    }

    @Override
    public void delete( String id ) {
        User user = getById( id );
        user.setDelete( true );
        user = save( user );
        if( user == null ) {
            throw new Error( "Error" );
        }
    }

    @Override
    public void inactive( String id ) {
        User user = getById( id );
        user.setActive( false );
        user = save( user );
        if( user == null ) {
            throw new Error( "Error" );
        }
    }
}
