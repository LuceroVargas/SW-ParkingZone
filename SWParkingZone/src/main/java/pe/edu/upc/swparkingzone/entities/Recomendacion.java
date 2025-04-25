package pe.edu.upc.swparkingzone.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Recomendacion")
public class Recomendacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecomendacion;
    @Column(name="comentario", length = 75, nullable = false)
    private String comentario;
    @Column(name="calificacion",length = 30, nullable = false)
    private String calificacion;
    @Column(name="fechaRecomendacion", nullable = false)
    private LocalDate fechaRecomendacion;
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name="idEstacionamiento")
    private Estacionamiento estacionamiento;

    public Recomendacion() {

    }

    public Recomendacion(int idRecomendacion, String comentario, String calificacion, LocalDate fechaRecomendacion, Usuario usuario, Estacionamiento estacionamiento) {
        this.idRecomendacion = idRecomendacion;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.fechaRecomendacion = fechaRecomendacion;
        this.usuario = usuario;
        this.estacionamiento = estacionamiento;
    }

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
