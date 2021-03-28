package com.chat.assignement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chat.assignement.dto.Message;
import com.chat.assignement.entity.ChatEntity;
import com.chat.assignement.service.ChatService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@CrossOrigin("*")
public class ChatController {

	@Autowired
	private ChatService chatService;

	@GetMapping("/getChat/{teamId}")
	private ResponseEntity<List<ChatEntity>> getallMessage(@PathVariable(name = "teamId") String id)  {
		List<ChatEntity> allChatByTeamId = chatService.getAllChatByTeamId(id);
		return ResponseEntity.ok(allChatByTeamId);
	}

		
	@PostMapping("/saveChat")
	private ResponseEntity<ChatEntity> saveMessage(@RequestBody ChatEntity message, HttpServletRequest request)
			throws  JsonProcessingException {
		ChatEntity saveChat = chatService.saveChat(message);
		return ResponseEntity.ok(saveChat);
	}

}
