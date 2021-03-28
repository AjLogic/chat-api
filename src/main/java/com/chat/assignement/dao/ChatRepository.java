package com.chat.assignement.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.assignement.entity.ChatEntity;

public interface ChatRepository  extends JpaRepository<ChatEntity, Long>{
	
	public List<ChatEntity> findByTeamTo(String teamId);
	
}
