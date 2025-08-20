package com.enzocalligaris.workshopmongo.repository;

import com.enzocalligaris.workshopmongo.domain.Post;
import com.enzocalligaris.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoreCase(String text);
}
