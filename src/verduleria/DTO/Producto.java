package verduleria.DTO;

public class Producto {
    //  producto el código, subcategoría, descripción, precio, 
    // medida (unidad o gramos) y su cantidad,
    private int Codigo;
    private String Subcategoria;
    private String Descripcion;
    private int Precio;
    
    private String Medida;
    private float Cantidad;
    
    public Producto(){
        this.Codigo = -1;
        this.Subcategoria = "Sin Asignar";
        this.Descripcion = "";
        this.Precio = 0;
        this.Medida = "";
        this.Cantidad = 0f;
    }
    
    public int getCodigo(){
        return this.Codigo;
    }
    
    public void setCodigo(int CodigoEntrada){
        if(CodigoEntrada > 999){
            this.Codigo = CodigoEntrada;
        }
    }
    
    public String getSubcategoria(){
        return this.Subcategoria;
    }
    public void setSubcategoria(String Subcategoria){
        if(Subcategoria.equals("Fruta") ||
                Subcategoria.equals("Verdura"))
        {
            this.Subcategoria = Subcategoria;
        }
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getMedida() {
        return Medida;
    }

    public void setMedida(String Medida) {
        this.Medida = Medida;
    }

    public float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(float Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
}
