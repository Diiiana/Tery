package com.du.tery.services;

import com.du.tery.dtos.StoryDto;
import com.du.tery.facade.StoryService;
import com.du.tery.mappers.StoryMapper;
import com.du.tery.model.Story;
import com.du.tery.repositories.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoryServiceImpl implements StoryService {

    private final StoryRepository storyRepository;

    @Autowired
    private StoryMapper storyMapper;

    public StoryServiceImpl(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    @Override
    public StoryDto getStoryById(Long id) {
        Story story = findStoryById(id);
        return storyMapper.storyToStoryDto(story);
    }

    @Override
    public List<StoryDto> getStories() {
        return storyRepository.findAll()
                .stream()
                .map(s -> storyMapper.storyToStoryDto(s))
                .collect(Collectors.toList());
    }

    private Story findStoryById(Long id) {
        return storyRepository.findStoryById(id);
    }
}
