package br.edu.ifsul.cstsi.tads_sergio.api.modulo;

import br.edu.ifsul.cstsi.tads_sergio.api.questao.Questao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Entity(name="Modulo")
@Table(name = "modulos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Modulo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome, descricao;
    private int status;
    @OneToMany(mappedBy = "modulo", fetch = FetchType.EAGER)
    private Collection<Questao> questoes;
}
