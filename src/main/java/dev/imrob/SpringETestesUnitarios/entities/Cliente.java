package dev.imrob.SpringETestesUnitarios.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    private Long id;
    private String nome;
    private Integer idade;
}
