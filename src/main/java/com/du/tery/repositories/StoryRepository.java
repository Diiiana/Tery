package com.du.tery.repositories;

import com.du.tery.model.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends CrudRepository<Story, Long> {
    Story findStoryById(Long id);
}
