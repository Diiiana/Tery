package com.du.tery.controllers.story;

import com.du.tery.facade.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StoryController {

    private final StoryService storyService;

    @Autowired
    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }

    @GetMapping("/story/{id}")
    public String getStory(@PathVariable Long id, Model model) {
        model.addAttribute("story", storyService.getStoryById(id));
        return "story/story-page.html";
    }
}
