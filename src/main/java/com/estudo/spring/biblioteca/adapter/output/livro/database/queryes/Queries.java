package com.estudo.spring.biblioteca.adapter.output.livro.database.queryes;

public class Queries {
    public static final String LIVRO_POR_FILTRO = """
            SELECT
                a.NOME_AUTOR,
                l.LIVRO_ID,
                L.TITULO_LIVRO
                    FROM
                    TB_LIVRO l INNER JOIN TB_AUTOR a  ON
                        (l.AUTOR_ID = a.AUTOR_ID AND a.NOME_AUTOR = :autor OR :autor IS NULL) AND
                        (l.TITULO_LIVRO = :nome OR :nome IS NULL) AND
                        (l.DATA_PUBLICACAO = :dataPublicacao OR :dataPublicacao IS NULL)
            """;

    //            "(l.LIVRO_AUTOR = :autor OR :autor IS NULL) AND " +
}
