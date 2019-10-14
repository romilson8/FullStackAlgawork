package br.example.banzonetwork.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.example.banzonetwork.event.RecursoCriadoEvent;
import br.example.banzonetwork.model.Avaliador;
import br.example.banzonetwork.repository.AvaliadorRepository;

@RestController
@RequestMapping("/avaliador")
public class AvaliadorResource {

	@Autowired
	private AvaliadorRepository avaliadorRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;

	@GetMapping
	public List<Avaliador> getListAvaliadores() {
		return avaliadorRepository.findAll();
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<Avaliador> getAvaliadorPorCodigo(@PathVariable Long codigo) {
		Avaliador avaliador = avaliadorRepository.findOne(codigo);
		return avaliador != null ? ResponseEntity.ok(avaliador) : ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<Avaliador> criarAvaliador(@Valid @RequestBody Avaliador avaliador, HttpServletResponse response){
		
		Avaliador avaliadorSalvo = avaliadorRepository.save(avaliador);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, avaliadorSalvo.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(avaliadorSalvo);
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAvaliador(@PathVariable Long codigo){
		avaliadorRepository.delete(codigo);
	}
	
//	@PutMapping("/{codigo}")
//	public ResponseEntity<Avaliador> atualizar(@PathVariable Long codigo, @Valid @RequestBody Avaliador avaliador){
//		Avaliador avaliadorSalvo = avaliadorService.atualizar(codigo, avaliador);
//		return ResponseEntity.ok(avaliadorSalvo);
//	}

}
