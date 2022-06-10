package com.yujiyamamoto64.comments1.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.yujiyamamoto64.comments1.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
