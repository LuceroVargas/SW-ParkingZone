package pe.edu.upc.swparkingzone.dtos;

import pe.edu.upc.swparkingzone.entities.Reclamo;

import java.time.LocalDate;

public class RespuestaDTO {

    private int idRespuesta;

    private LocalDate fecha;

    private LocalDate hora;

    private Reclamo reclamo;

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public Reclamo getReclamo() {
        return reclamo;
    }

    public void setReclamo(Reclamo reclamo) {
        this.reclamo = reclamo;
    }
}
