package com.enzocalligaris.workshopmongo.services;

import com.enzocalligaris.workshopmongo.domain.User;
import com.enzocalligaris.workshopmongo.repository.UserRepository;
import com.enzocalligaris.workshopmongo.services.exception.ObjectnotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não Encontrado"));
    }
}
