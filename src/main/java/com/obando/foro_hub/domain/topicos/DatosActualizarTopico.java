package com.obando.foro_hub.domain.topicos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(

        @NotNull
        Long id,

        @NotBlank
        String titulo,

        @NotBlank
        String mensaje,

        Estado estado,

        @NotBlank
        String curso,

        @NotBlank
        String autor
) {
}
