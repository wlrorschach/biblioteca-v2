package com.estudo.spring.biblioteca.adapter.output.livro.database.queryes;

public enum QueyEnum {
    LIVRO_POR_FILTRO("SELECT * FROM TB_LIVRO l WHERE " +
            "(l.LIVRO_NOME = :nome OR :nome IS NULL) AND " +
            "(l.LIVRO_AUTOR = :autor OR :autor IS NULL) AND " +
            "(l.DATA_PUBLICACAO = :dataPublicacao OR :dataPublicacao IS NULL)");

    private String query;

    QueyEnum(String query) {
        this.query = query;
    }

    public String getQuery(){
        return query;
    }
}
