package com.du.tery.mappers;

import com.du.tery.dtos.StoryDto;
import com.du.tery.model.Story;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StoryMapper {
    @Mapping(source = "story.id", target = "id")
    StoryDto storyToStoryDto(Story story);

    Story storyDtoToStory(StoryDto storyDto);
}
