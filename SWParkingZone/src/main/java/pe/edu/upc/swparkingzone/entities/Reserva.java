package pe.edu.upc.swparkingzone.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;
    @Column(name="fechaReserva", nullable = false)
    private LocalDate fechaReserva;
    @Column(name="estado", length = 30, nullable = false)
    private String estado;
    @ManyToOne
    @JoinColumn
    private Usuario usuario;
    @ManyToOne
    @JoinColumn
    private Estacionamiento estacionamiento;
    @ManyToOne
    @JoinColumn
    private Recomendacion recomendacion;

    public Reserva() {

    }

    public Reserva(int idReserva, LocalDate fechaReserva, String estado, Usuario usuario, Estacionamiento estacionamiento, Recomendacion recomendacion) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
        this.usuario = usuario;
        this.estacionamiento = estacionamiento;
        this.recomendacion = recomendacion;
    }

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
