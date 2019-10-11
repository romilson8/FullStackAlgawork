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
import br.example.banzonetwork.model.Aluno;
import br.example.banzonetwork.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<Aluno> getListAlunos(){
		return alunoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno>buscarPeloCodigo(@PathVariable Integer id) {
		Aluno aluno = alunoRepository.findOne(id);
		return aluno != null ? ResponseEntity.ok(aluno) : ResponseEntity.notFound().build();
	}
	
	@PostMapping
	private ResponseEntity<Aluno> criar(@Valid @RequestBody Aluno aluno, HttpServletResponse response) {
		Aluno alunoSalvo = alunoRepository.save(aluno);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, alunoSalvo.getId()));
		return ResponseEntity.status(HttpStatus.CREATED).body(alunoSalvo);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Integer id) {
		alunoRepository.delete(id);
	}
}
