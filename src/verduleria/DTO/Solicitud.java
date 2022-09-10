package verduleria.DTO;

import java.util.Date;

public class Solicitud {
    // La solicitud del cliente, tiene un número de solicitud, una fecha, 
    //un cliente, un total y varios productos, ejemplo:
    
    private int Numero;
    private Date Fecha;
    private Cliente Cliente;
    private int Total;
    private String Productos;
    
    public Solicitud(){
        this.Numero = 0;
        this.Fecha = new Date();
        this.Cliente = new Cliente();
        this.Total = 0;
        this.Productos = "";
    }

    public Solicitud(int Numero, Date Fecha, Cliente Cliente, int Total, String Productos) {
        this.Numero = Numero;
        this.Fecha = Fecha;
        this.Cliente = Cliente;
        this.Total = Total;
        this.Productos = Productos;
    }
    
    public int getNumero(){
        return this.Numero;
    }
    public void setNumero(int Numero){
        this.Numero = Numero;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public String getProductos() {
        return Productos;
    }

    public void setProductos(String Productos) {
        this.Productos = Productos;
    }
    
    public void agregarProducto(Producto p){
        if(!this.Productos.equals("")){
            this.Productos += "; ";
        }
        this.Productos += p.toString();
        this.Total += p.getPrecio();
    }
    
    @Override
    public String toString(){
        // Un método que permite ver el detalle del pedido del cliente
        StringBuilder sb = new StringBuilder();
        sb.append("============\n");
        sb.append("Venta N°");
        sb.append(this.Numero);
        sb.append("\nTotal: $");
        sb.append(this.Total);
        sb.append("\n============\n");
        sb.append("Cliente: ");
        sb.append(this.Cliente.getNombre());
        sb.append("\n============\n");
        sb.append(this.Productos);
        
        return sb.toString();
    }
}