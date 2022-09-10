package verduleria;

import verduleria.DTO.Producto;

public class Principal {
    public static void main(String[] args) {
        Producto p = new Producto();
        
        p.setCodigo(1000);
        p.setSubcategoria("Fruta");
        System.out.println("El código es: "+p.getCodigo());
        System.out.println("El subcategoria es: "+p.getSubcategoria());
    }
    
}
