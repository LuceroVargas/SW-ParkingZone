package pe.edu.upc.swparkingzone.dtos;

import pe.edu.upc.swparkingzone.entities.Estacionamiento;
import pe.edu.upc.swparkingzone.entities.Recomendacion;
import pe.edu.upc.swparkingzone.entities.Usuario;

import java.time.LocalDate;

public class ReservaDTO {

    private int idReserva;

    private LocalDate fechaReserva;

    private String estado;

    private Usuario usuario;

    private Estacionamiento estacionamiento;

    private Recomendacion recomendacion;

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public Recomendacion getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(Recomendacion recomendacion) {
        this.recomendacion = recomendacion;
    }
}

