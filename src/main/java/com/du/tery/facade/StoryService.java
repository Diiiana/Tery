package com.du.tery.facade;

import com.du.tery.dtos.StoryDto;

import java.util.List;

public interface StoryService {

    StoryDto getStoryById(Long id);

    List<StoryDto> getStories();
}
