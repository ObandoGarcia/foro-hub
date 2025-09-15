package com.obando.foro_hub.domain.topicos;

import java.time.LocalDateTime;

public record DatosListadoTopicos(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        String estado,
        String curso,
        String autor
) {
    public DatosListadoTopicos(Topico topico){
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getEstado().toString(),
                topico.getCurso(),
                topico.getAutor()
        );
    }
}
