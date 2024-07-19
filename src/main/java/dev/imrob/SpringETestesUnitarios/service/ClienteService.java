package dev.imrob.SpringETestesUnitarios.service;

import dev.imrob.SpringETestesUnitarios.entities.Cliente;
import dev.imrob.SpringETestesUnitarios.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteService {
    private final ClienteRepository repository;

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Cliente findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Cliente save(Cliente cliente) {
        if (cliente.getIdade() >= 18) {
            return repository.save(cliente);
        } else {
            throw new IllegalArgumentException("Cliente deve ser maior de 18 anos para se cadastrar.");
        }
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Cliente update(Cliente cliente) {
        return repository.save(cliente);
    }
}
