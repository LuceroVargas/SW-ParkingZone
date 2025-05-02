package pe.edu.upc.swparkingzone.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="Respuesta")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;
    @Column(name="fecha",nullable=false)
    private LocalDate fecha;
    @Column(name="hora",nullable=false)
    private LocalDate hora;
    @ManyToOne
    @JoinColumn
    private Reclamo reclamo;
    public Respuesta() {

    }

    public Respuesta(int idRespuesta, LocalDate fecha, LocalDate hora, Reclamo reclamo) {
        this.idRespuesta = idRespuesta;
        this.fecha = fecha;
        this.hora = hora;
        this.reclamo = reclamo;
    }

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
