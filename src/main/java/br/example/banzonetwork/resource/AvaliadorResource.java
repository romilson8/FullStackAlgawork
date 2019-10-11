package br.example.banzonetwork.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.example.banzonetwork.model.Avaliador;
import br.example.banzonetwork.repository.AvaliadorRepository;

@RestController
@RequestMapping("/avaliador")
public class AvaliadorResource {
	
	@Autowired
	private AvaliadorRepository avaliadorRepository;
	
	@GetMapping
	public List<Avaliador> getListAvaliador(){
		return avaliadorRepository.findAll();
	}

}
