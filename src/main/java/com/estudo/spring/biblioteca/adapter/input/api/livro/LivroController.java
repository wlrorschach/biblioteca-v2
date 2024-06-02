package com.estudo.spring.biblioteca.adapter.input.api.livro;


import com.estudo.spring.biblioteca.adapter.input.api.livro.dto.resquest.LivroRequestDTO;
import com.estudo.spring.biblioteca.adapter.input.api.livro.dto.mapper.LivroMapper;
import com.estudo.spring.biblioteca.adapter.input.api.livro.dto.response.LivroResponseDTO;
import com.estudo.spring.biblioteca.port.input.livro.BuscarLivroUseCase;
import com.estudo.spring.biblioteca.port.input.livro.CadastrarLivroUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/livros", produces = MediaType.APPLICATION_JSON_VALUE)
public record LivroController(
        CadastrarLivroUseCase cadastrarLivroUseCase,
        BuscarLivroUseCase buscarLivroUseCase,
        LivroMapper mapper
) implements LivroSwagger {
    /**
     * @param nome (String), autor (String), dataLancamanto (LocalDate)
     * @return uma lista de livros
     */
    @Override
    @GetMapping(value = "/buscar-livros")
    public ResponseEntity<List<LivroResponseDTO>> buscarLivros(
            @Nullable @RequestParam(name = "nome") String nome,
            @Nullable @RequestParam(name = "autor") String autor,
            @Nullable @RequestParam(name = "dataPublicacao") LocalDate dataPublicacao
    ) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(mapper.toLivrosResponse(buscarLivroUseCase.executarPorFiltros(nome, autor, dataPublicacao)));
    }

    /**
     * @param id
     * @return o livro correspondente ao id informado, caso exista
     */
    @Override
    @GetMapping(value = "/buscar-livro/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LivroResponseDTO> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).
                body(mapper.toLivroResponseDTO(buscarLivroUseCase.erxecutarPorId(id)));

    }

    /**
     * @param livro
     * @return o novo registro do livro
     */
    @Override
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LivroResponseDTO> inserirLivro(@RequestBody LivroRequestDTO livro) {
        return null;
    }
}
