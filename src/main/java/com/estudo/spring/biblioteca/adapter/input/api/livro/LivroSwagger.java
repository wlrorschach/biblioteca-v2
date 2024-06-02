package com.estudo.spring.biblioteca.adapter.input.api.livro;

import com.estudo.spring.biblioteca.adapter.input.api.livro.dto.resquest.LivroRequestDTO;
import com.estudo.spring.biblioteca.adapter.input.api.livro.dto.response.LivroResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;


@Tag(name = "Manter de livros", description = "Operaçoes para gerenciar os livros")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LivroResponseDTO.class))
        })
})
public interface LivroSwagger {

    @Operation(
            operationId = "buscarLivros",
            summary = "Buscar livros por filtro",
            description = "Busca uma lista de livros tendo como parametro: autor, nome ou data de publicacao"
    )
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Busca realizada!"),})
    ResponseEntity<List<LivroResponseDTO>> buscarLivros(String nome, String autor, LocalDate dataPublicacao);

    @Operation(
            operationId = "buscarLivros",
            summary = "Buscar livros por id",
            description = "Busca um livro com base no id informado"
    )
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Busca realizada!"),})
    ResponseEntity<LivroResponseDTO> buscarPorId(Long id);

    @Operation(
            operationId = "Inserir Livro",
            summary = "Insere um livro",
            description = "Insere um novo registro de livro na biblioteca"
    )
    @ApiResponses(value = {@ApiResponse(responseCode = "201", description = "CREATED"),})
    ResponseEntity<LivroResponseDTO> inserirLivro(LivroRequestDTO livro);
}
