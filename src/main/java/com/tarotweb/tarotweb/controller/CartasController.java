package com.tarotweb.tarotweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tarotweb.tarotweb.service.CartasService;

@Controller
public class CartasController {

	@Autowired
	private CartasService service;

//	@PostMapping("/getAll")
//	@ResponseBody
//	private List<CartaDto> getAll() {
//		return service.getAllCards();
//	}

	@RequestMapping("/getAllData")
	private String get(Model model) {
		model.addAttribute("imageUrl", service.getAllCards().get(0).getUrl());
		model.addAttribute("descricao", service.getAllCards().get(0).getName());
		return "tarot-meu";
	}

	@RequestMapping("/home")
	private String getIndex(Model model) {
		model.addAttribute("message", "Welcome to my website!");
		return "index";
	}

}
