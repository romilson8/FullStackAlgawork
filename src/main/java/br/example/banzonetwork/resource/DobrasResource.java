package br.example.banzonetwork.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.example.banzonetwork.model.Dobras;
import br.example.banzonetwork.repository.DobrasRepository;

@RestController
@RequestMapping("/dobras")
public class DobrasResource {
	
	@Autowired
	private DobrasRepository dobrasRepository;
	
	@GetMapping
	public List<Dobras> geListDobras(){
		return dobrasRepository.findAll();
	}

}
