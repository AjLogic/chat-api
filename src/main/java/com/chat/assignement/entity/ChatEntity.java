package com.chat.assignement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity()
@Data
@Table(name = "ChatEntity")
public class ChatEntity {

	@Column(name = "Id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "teamTo")
	private String teamTo;
	
	@Column(name = "teamFrom")
	private String teamFrom;
	
	@Column(name = "message")
	private String message;

}
