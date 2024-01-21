package dev.josefredrico.screenmatch.dto;

import dev.josefredrico.screenmatch.model.Categoria;

public record SerieDTO(

        Long id,
        String titulo,
        Integer totalTemporadas,
        Double avaliacao,
        Categoria genero,
        String atores,
        String poster,
        String sinopse

) {
}
