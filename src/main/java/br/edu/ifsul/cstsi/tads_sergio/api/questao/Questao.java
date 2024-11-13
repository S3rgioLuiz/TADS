package br.edu.ifsul.cstsi.tads_sergio.api.questao;

import br.edu.ifsul.cstsi.tads_sergio.api.alternativa.Alternativa;
import br.edu.ifsul.cstsi.tads_sergio.api.modulo.Modulo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Entity(name="Questao")
@Table(name = "questoes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Questao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pergunta, explicacao, referencia;
    private int status;
    @OneToMany(mappedBy = "questao", fetch = FetchType.EAGER)
    private Collection<Alternativa> alternativas;
    @ManyToOne
    @JoinColumn(name = "modulos_id", referencedColumnName = "id", nullable = false)
    private Modulo modulo;
}
