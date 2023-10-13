package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    @Autowired
    AlunoRepository repository;

    public Aluno create (Aluno aluno){
       return repository.save(aluno);
    }
    public List<Aluno> findAll(){
       return repository.findAll();
    }
    public Optional<Aluno> findById(Long id){
        return repository.findById(id);
    }
    public void delete(Long id){
        repository.deleteById(id);
    }
    /*public Aluno update(Long id, Aluno partialUpdate) {
    Optional<Aluno> existingAluno = repository.findById(id);
    if (existingAluno.isPresent()) {
        Aluno alunoToUpdate = existingAluno.get();

        if (partialUpdate.getNome() != null) {
            alunoToUpdate.setNome(partialUpdate.getNome());
        }
        if (partialUpdate.getEmail() != null) {
            alunoToUpdate.setEmail(partialUpdate.getEmail());
        }
        if (partialUpdate.getCurso() != null) {
            alunoToUpdate.setCurso(partialUpdate.getCurso());
        }

        return repository.save(alunoToUpdate);
    } else {
        throw new IllegalArgumentException("Aluno não encontrado com o ID fornecido: " + id);
    }
}

}*/


}
