package com.estudo.spring.biblioteca.adapter.input.api.autor;

import com.estudo.spring.biblioteca.adapter.input.api.autor.dto.request.AutorRequestDTO;
import com.estudo.spring.biblioteca.adapter.input.api.autor.dto.response.AutorResponseDTO;
import com.estudo.spring.biblioteca.adapter.input.api.dto.DelecaoDTO;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Manter autores", description = "Operaçoes para gerenciar autores")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AutorResponseDTO.class))
        }),
        @ApiResponse(responseCode = "200", description = "Alteracao realizada com sucesso", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AutorResponseDTO.class))
        }),
        @ApiResponse(responseCode = "204", description = "No content"),
        @ApiResponse(responseCode = "201", description = "Cadastro realizado com sucesso", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AutorResponseDTO.class))
        }),
        @ApiResponse(responseCode = "400", description = "Bad Request!", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AutorResponseDTO.class))
        }),
        @ApiResponse(responseCode = "500", description = "Erro interno do servico", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AutorResponseDTO.class))
        })

})
public interface AutorSwagger {

    ResponseEntity<AutorResponseDTO> cadastrarAutor(AutorRequestDTO autor);

    ResponseEntity<AutorResponseDTO> alterarAutor(AutorRequestDTO autor);
    
    ResponseEntity<DelecaoDTO> deletarAutor(Long id);
}
