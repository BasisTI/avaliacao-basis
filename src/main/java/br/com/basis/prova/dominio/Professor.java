package br.com.basis.prova.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PROFESSOR")
@Getter
@Setter
@NoArgsConstructor
public class Professor {

    private Integer id;

    private String nome;

    private String matricula;

    private String area;

    private LocalDate dataNascimento;

    private List<Disciplina> disciplinas = new ArrayList<>();
}
