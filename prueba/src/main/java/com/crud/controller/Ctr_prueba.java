package com.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.model.Md_prueba;
import com.crud.prueba.Itf_prueba;

@Controller
@RequestMapping("/prueba")
public class Ctr_prueba {
	
	private final Logger log = LoggerFactory.getLogger(Md_prueba.class);

	@Autowired
	private Itf_prueba itf_prueba;
	
	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("prueba", itf_prueba.findAll());
		
		return "home";
	}
	
	@GetMapping("/create")
	public String create() {
		return "create";
	}
	
	
	@PostMapping("/guardar")
	public String guardar(Md_prueba md_prueba) {
		log.info("datos de gurdado: ,{}",md_prueba);
		itf_prueba.save(md_prueba);
		return "redirect:/prueba";
	}
	
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable Integer id, Model model) {
		Md_prueba p = itf_prueba.getOne(id);
		log.info("datos de actualizar: ,{}",p);
		model.addAttribute("prueba",p);
		return "edit";
	}
	
	@GetMapping("/borrar/{id}")
	public String borrar(@PathVariable Integer id) {
		Md_prueba p = itf_prueba.getOne(id);
		log.info("datos de actualizar: ,{}",p);
		itf_prueba.delete(p);
		return "redirect:/prueba";
	}
}
