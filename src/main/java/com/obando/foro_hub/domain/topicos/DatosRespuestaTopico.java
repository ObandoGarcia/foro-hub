package com.obando.foro_hub.domain.topicos;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Estado estado,
        String curso,
        String autor
) {
}
