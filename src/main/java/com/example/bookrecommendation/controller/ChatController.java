package com.example.bookrecommendation.controller;

import com.example.bookrecommendation.dto.BookRequest;
import com.example.bookrecommendation.service.PromptService;
import org.springframework.ai.chat.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final ChatClient chatClient;
    private final PromptService promptService;

    public ChatController(ChatClient chatClient, PromptService promptService) {
        this.chatClient = chatClient;
        this.promptService = promptService;
    }


    @GetMapping("/book")
    public String generate(@RequestBody BookRequest bookRequest){
        return chatClient.call(promptService.createPrompt(bookRequest));
        //return ".";

 }
}