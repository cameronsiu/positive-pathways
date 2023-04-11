package com.positivepathways.storiesapi.controller;

import com.positivepathways.storiesapi.dto.AddStoryRequestDto;
import com.positivepathways.storiesapi.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/story")
public class StoryController {
    private StoryService storyService;

    @Autowired
    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }
    @PostMapping("/")
    public void story(@RequestBody AddStoryRequestDto request) {
        storyService.addStory(request);
    }

}
