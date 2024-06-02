package com.estudo.spring.biblioteca.domain.service;

import com.estudo.spring.biblioteca.adapter.input.api.livro.dto.resquest.LivroRequestDTO;
import com.estudo.spring.biblioteca.adapter.output.livro.database.entity.LivroEntity;
import com.estudo.spring.biblioteca.port.input.livro.BuscarLivroUseCase;
import com.estudo.spring.biblioteca.port.input.livro.CadastrarLivroUseCase;
import com.estudo.spring.biblioteca.port.output.BuscarLivroPort;
import com.estudo.spring.biblioteca.port.output.CadastrarLivroPort;
import com.estudo.spring.biblioteca.port.output.LogLivroPort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public record LivroService(
        BuscarLivroPort buscarLivroPort,
        CadastrarLivroPort cadastrarLivroPort,
        LogLivroPort logLivroPort
) implements CadastrarLivroUseCase, BuscarLivroUseCase {


    /**
     * @param livro
     * @return o novo LivroEntity cadastrado
     */
    @Override
    public LivroEntity cadastrar(LivroRequestDTO livro) {
        return cadastrarLivroPort.executar(livro).orElse(new LivroEntity());
    }

    /**
     * @param id
     * @return um LivroEntity correspondente ao id informado
     */
    @Override
    public LivroEntity erxecutarPorId(Long id) {
        return null;
    }

    /**
     * @param nome (String), autor (String), dataLancamanto (LocalDate)
     * @return uma List de LivroEntity
     */
    @Override
    public List<LivroEntity> executarPorFiltros(String nome, String autor, LocalDate dataPublicacao) {
        return buscarLivroPort.executarPorFiltros(nome, autor, dataPublicacao).orElse(List.of());
    }
}
