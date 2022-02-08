package Tema3.Actividad4.Ejercicio3;

public class Factura {
    private int numeroFactura;
    private int idCliente;
    private int fecha;
    private int cantidad;

    public Factura(int numeroFactura, int idCliente, int fecha, int cantidad) {
        this.numeroFactura = numeroFactura;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //todo Hacer propiedad estatica
}
