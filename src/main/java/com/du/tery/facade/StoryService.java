package com.du.tery.facade;

import com.du.tery.dtos.StoryDto;

public interface StoryService {

    StoryDto getStoryById(Long id);
}
