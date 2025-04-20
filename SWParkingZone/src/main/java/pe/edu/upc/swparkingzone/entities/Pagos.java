package pe.edu.upc.swparkingzone.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    @Column(name = "idSuscripcion", nullable = false, length = 20)
    private String idSuscripcion;
    @Column(name = "fechaPago", nullable = false)
    private LocalDate fechaPago;
    @Column(name = "montoPago", nullable = false, length = 20)
    private String montoPago;
    @Column(name = "estadoPago", nullable = false)
    private boolean estadoPago;

    public Pagos(){}

    public Pagos(int idPago, String idSuscripcion, LocalDate fechaPago, String montoPago, boolean estadoPago) {
        this.idPago = idPago;
        this.idSuscripcion = idSuscripcion;
        this.fechaPago = fechaPago;
        this.montoPago = montoPago;
        this.estadoPago = estadoPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(String idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(String montoPago) {
        this.montoPago = montoPago;
    }

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }
}
