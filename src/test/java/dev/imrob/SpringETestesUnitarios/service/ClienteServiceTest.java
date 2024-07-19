package dev.imrob.SpringETestesUnitarios.service;

import dev.imrob.SpringETestesUnitarios.entities.Cliente;
import dev.imrob.SpringETestesUnitarios.repository.ClienteRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ClienteServiceTest {
    @InjectMocks
    private ClienteService service;

    @Mock
    private ClienteRepository repository;

    private Cliente cliente;

    @Test
    @DisplayName("Deve salvar um cliente quando for maior que 18 anos")
    void save_deveSalvarCliente_quandoIdadeMaior18() {
        //Preparo o Teste
        Cliente clienteEntrada = new Cliente(null, "Jõao", 19);
        Cliente cliente = new Cliente(1L,"Jõao", 19);

        when(repository.save(clienteEntrada)).thenReturn(cliente);

        // Executo o método nas condições que quero testar
        Cliente resultado = service.save(clienteEntrada);

        //Realizo as Verificações

        /*
        Assegure que o resultado, ou seja, o retorno do metodo que estou chamando
        é igual ao objeto cliente que criei no inicio dos testes
         */
        assertThat(resultado).isEqualTo(cliente);
        /*
        Assegure que o resultado, ou seja, o retorno do metodo que estou chamando
        NÃO é nulo.
         */
        assertThat(resultado).isNotNull();
    }
}