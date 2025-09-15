package com.obando.foro_hub.domain.topicos;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "topicos")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensaje;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    private String curso;
    private String autor;

    public Topico(DatosRegistroTopico datosRegistroTopico){
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaCreacion = LocalDateTime.now();
        this.estado = Estado.ABIERTO;
        this.curso = datosRegistroTopico.curso();
        this.autor = datosRegistroTopico.autor();
    }

    public void actualizarTopico(DatosActualizarTopico datosActualizarTopico){
        if(datosActualizarTopico.id() != null){
            this.titulo = datosActualizarTopico.titulo();
            this.mensaje = datosActualizarTopico.mensaje();
            this.estado = datosActualizarTopico.estado();
            this.curso = datosActualizarTopico.curso();
            this.autor = datosActualizarTopico.autor();
        }
    }
}
