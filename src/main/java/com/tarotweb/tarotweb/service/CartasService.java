package com.tarotweb.tarotweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarotweb.tarotweb.DTO.CartaDto;
import com.tarotweb.tarotweb.entity.CartasEntity;
import com.tarotweb.tarotweb.repository.CartasRepository;

@Service
public class CartasService {

	@Autowired
	private CartasRepository repository;

	public List<CartaDto> getAllCards() {

		List<CartasEntity> cartas = repository.findAll();
		List<CartaDto> cartasDto = new ArrayList<CartaDto>();
		for (CartasEntity carta : cartas) {

			CartaDto cartaDto = convertToDto(carta);
			cartasDto.add(cartaDto);
		}
		return cartasDto;
	}

	private CartaDto convertToDto(CartasEntity carta) {
		
		CartaDto cartaDto =  new CartaDto();
		cartaDto.setId(carta.getId());
		cartaDto.setName(carta.getName());
		cartaDto.setUrl(carta.getUrl());
		return cartaDto;
	}

}
