package com.JobListing.joblisting.repository;

import com.JobListing.joblisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository <Post,String>
{

}
