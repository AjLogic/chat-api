package com.chat.assignement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.assignement.dao.ChatRepository;
import com.chat.assignement.entity.ChatEntity;

@Service
public class ChatService {
	
	@Autowired
	private ChatRepository chatrepo;

	public List<ChatEntity> getAllChatByTeamId(String teamid){
		return chatrepo.findAll();
	}
	
	public ChatEntity saveChat(ChatEntity chat){
		return chatrepo.save(chat);
	}
	
	
}
