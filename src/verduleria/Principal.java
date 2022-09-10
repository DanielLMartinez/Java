package verduleria;

import java.util.Date;
import verduleria.DTO.Cliente;
import verduleria.DTO.Solicitud;
import verduleria.DTO.Producto;

public class Principal {
    public static void main(String[] args) {
        int correlativo = 0;
        
        System.out.println("Ingresando producto");
        Producto p = new Producto();
        p.setCodigo(100);
        p.setSubcategoria("Verdura");
        p.setDescripcion("Zanahoria");
        p.setPrecio(890);
        p.setMedida("Gramos");
        p.setCantidad(1000);
        
        System.out.println("Creado producto: "+ p.getDescripcion());
        
        System.out.println("Ingresando producto");
        Producto a = new Producto();
        a.setCodigo(5005);
        a.setSubcategoria("Fruta");
        a.setDescripcion("Arándanos");
        a.setPrecio(1490);
        a.setMedida("Gramos");
        a.setCantidad(125);
        
        System.out.println("Creado producto: "+ a.getDescripcion());
        
        
        System.out.println("Creando Cliente");
        Cliente c = new Cliente();
        c.setRun(18742228, '0');
        c.setNombre("Sebastián");
        c.setMail("swf.sebas@gmail.com");
        c.setDireccion("Tu poto 123");
        c.setTelefono(12345678);
        
        System.out.println("Creado cliente: "+ c.getNombre());
        
        System.out.println("Creando Solicitud");
        Solicitud s = new Solicitud();
        s.setNumero(++correlativo);
        s.setFecha(new Date());
        s.setCliente(c);
        s.agregarProducto(p);
        s.agregarProducto(p);
        s.agregarProducto(a);
        s.agregarProducto(a);
        s.agregarProducto(a);
        s.agregarProducto(a);
        s.agregarProducto(a);
        s.agregarProducto(p);
        s.agregarProducto(p);
        s.agregarProducto(p);
        System.out.println("Solicitud Creada");
        System.out.println(s.toString());
    }
}
