package br.example.banzonetwork.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.example.banzonetwork.model.Aluno;
import br.example.banzonetwork.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public Aluno atualizar (Long codigo, Aluno aluno) {
		Aluno alunoSalvo = buscarAlunoPeloCodigo(codigo);
		
		BeanUtils.copyProperties(aluno, alunoSalvo, "codigo");
		return alunoRepository.save(alunoSalvo);
	}

	private Aluno buscarAlunoPeloCodigo(Long codigo) {
		Aluno alunoSalvo = alunoRepository.findOne(codigo);
		if (alunoSalvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return alunoSalvo;
	}

}
