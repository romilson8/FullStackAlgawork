package br.example.banzonetwork.resource;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.example.banzonetwork.event.RecursoCriadoEvent;
import br.example.banzonetwork.model.Aluno;
import br.example.banzonetwork.repository.AlunoRepository;
import br.example.banzonetwork.repository.filter.AlunoFilter;
import br.example.banzonetwork.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public Page<Aluno> getListAlunos(AlunoFilter alunoFilter, Pageable pageable){
		return alunoRepository.filtrar(alunoFilter, pageable);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Aluno> buscarPeloCodigo(@PathVariable Long codigo) {
		Aluno aluno = alunoRepository.findOne(codigo);
		return aluno != null ? ResponseEntity.ok(aluno) : ResponseEntity.notFound().build();
	}
	
	@PostMapping
	private ResponseEntity<Aluno> criar(@Valid @RequestBody Aluno aluno, HttpServletResponse response) {
		Aluno alunoSalvo = alunoRepository.save(aluno);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, alunoSalvo.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(alunoSalvo);
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		alunoRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<Aluno> atualizar(@PathVariable Long codigo, @Valid @RequestBody Aluno aluno){
		Aluno alunoSalvo = alunoService.atualizar(codigo, aluno);
		return ResponseEntity.ok(alunoSalvo);
	}
}
