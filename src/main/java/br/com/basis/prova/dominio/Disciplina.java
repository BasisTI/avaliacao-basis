package br.com.basis.prova.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DISCIPLINA")
@Getter
@Setter
@NoArgsConstructor
public class Disciplina {

    private Integer id;

    private String nome;

    private String descricao;

    private Integer cargaHoraria;

    private Integer ativa;

    private Professor professor;

    private List<Aluno> alunos = new ArrayList<>();

}
