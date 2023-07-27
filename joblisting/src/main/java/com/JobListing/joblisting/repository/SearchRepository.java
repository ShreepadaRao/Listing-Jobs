package com.JobListing.joblisting.repository;

import com.JobListing.joblisting.models.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String Text);

}
