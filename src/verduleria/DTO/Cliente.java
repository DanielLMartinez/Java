package verduleria.DTO;

public class Cliente {
    //cliente, su run, dv, nombre, mail, dirección y teléfono, ejemplo: 
    private int Run;
    private String Dv;
    private String Nombre;
    private String Mail;
    private String Direccion;
    private int Telefono;

    public Cliente(){
        this.Run = 0;
        this.Dv = "";
        this.Nombre = "";
        this.Mail = "";
        this.Direccion = "";
        this.Telefono = 0;
    }
    
    public Cliente(int Run, String Dv, String Nombre, String Mail, String Direccion, int Telefono) {
        this.Run = Run;
        this.Dv = Dv;
        this.Nombre = Nombre;
        this.Mail = Mail;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public int getRun() {
        return Run;
    }

    public void setRun(int Run, char Dv) {
        if(this.validarRut(Run, Dv)){
            this.Run = Run;
            this.Dv = Dv+"";
        }
    }

    public String getDv() {
        return Dv;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        if(Mail.length() > 5 && Mail.contains("@")){
            this.Mail = Mail;
        }
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        StringBuilder sb = new StringBuilder();
        sb.append(Telefono);
        
        if(sb.length() > 7){
            this.Telefono = Telefono;
        }
    }
    
    
    public boolean validarRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
}
