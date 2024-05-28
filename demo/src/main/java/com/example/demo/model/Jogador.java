package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "TB_Jogador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Jogador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="jogador_seq")
	@SequenceGenerator(name="jogador_seq", sequenceName="sq_jogador", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "PERSONAGEM", nullable = false, unique = true)
    private String personagem;
    

}
