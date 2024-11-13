package br.edu.ifsul.cstsi.tads_sergio.api.alternativa;

import br.edu.ifsul.cstsi.tads_sergio.api.questao.Questao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Alternativa")
@Table(name = "alternativas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Alternativa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String opcao;
    private int certo;
    @ManyToOne
    @JoinColumn(name = "questoes_id", referencedColumnName = "id", nullable = false)
    private Questao questao;
}
