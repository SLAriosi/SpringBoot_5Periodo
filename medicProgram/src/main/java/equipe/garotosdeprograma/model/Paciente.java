package equipe.garotosdeprograma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import lombok.Data;

import java.time.LocalDate;


@Data
@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;

    @Past(message = "A data de nascimento deve ser anterior à data atual.")
    private LocalDate dataNascimento;
    private String telefone;
}