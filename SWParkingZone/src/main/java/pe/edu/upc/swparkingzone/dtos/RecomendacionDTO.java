package pe.edu.upc.swparkingzone.dtos;


import pe.edu.upc.swparkingzone.entities.Estacionamiento;
import pe.edu.upc.swparkingzone.entities.Usuario;

import java.time.LocalDate;

public class RecomendacionDTO {

    private int idRecomendacion;

    private String comentario;

    private String calificacion;

    private LocalDate fechaRecomendacion;

    private Usuario usuario;

    private Estacionamiento estacionamiento;

    public int getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(int idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public LocalDate getFechaRecomendacion() {
        return fechaRecomendacion;
    }

    public void setFechaRecomendacion(LocalDate fechaRecomendacion) {
        this.fechaRecomendacion = fechaRecomendacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }
}
