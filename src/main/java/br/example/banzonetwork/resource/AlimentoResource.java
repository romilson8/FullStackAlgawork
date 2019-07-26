package br.example.banzonetwork.resource;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.example.banzonetwork.model.Alimento;
import br.example.banzonetwork.repository.AlimentoRepository;

@RestController
@RequestMapping("/alimentos")
public class AlimentoResource {

	@Autowired
	private AlimentoRepository alimentoRepository;
	
	@GetMapping
	public List<Alimento> getListaAlimentos(){
		return alimentoRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Alimento> getAlimentoPorId(@PathVariable Integer codigo){
		
		Alimento alimentoBuscado = alimentoRepository.findOne(codigo);
		return alimentoBuscado != null ? ResponseEntity.ok(alimentoBuscado): ResponseEntity.notFound().build();
	}
}
