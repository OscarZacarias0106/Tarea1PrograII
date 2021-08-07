package tareaprogra;


public class Persona {

    private String NombreAlumno;
    private String ApellidoAlumno;
    private String TelefonoAlumno;
    private String CorreoAlumno;
    private int aleatorio;



    public Persona(String NombreAlumno, String ApellidoAlumno, String TelefonoAlumno, String CorreoAlumno, int aleatorio) {
        this.NombreAlumno = NombreAlumno;
        this.ApellidoAlumno = ApellidoAlumno;
        this.TelefonoAlumno = TelefonoAlumno;
        this.CorreoAlumno = CorreoAlumno;
        this.aleatorio = aleatorio;

    }
    public int getaleatorio() {
        return aleatorio;
    }

    public void setAleatorio(int aleatorio) {
        this.aleatorio = aleatorio;
    }

    public String getNombreAlumno() {
        return NombreAlumno;
    }

    public void setNombreAlumno(String NombreAlumno) {
        this.NombreAlumno = NombreAlumno;
    }

    public String getApellidoAlumno() {
        return ApellidoAlumno;
    }

    public void setApellidoAlumno(String ApellidoAlumno) {
        this.ApellidoAlumno = ApellidoAlumno;
    }
    public String getTelefonoAlumno() {
        return TelefonoAlumno;
    }

    public void setTelefonoAlumno(String TelefonoAlumno) {
        this.TelefonoAlumno = TelefonoAlumno;
    }
    public String getCorreoAlumno() {
        return CorreoAlumno;
    }

    public String toString(){
        String s = "";
        s += "carnet: "+aleatorio+"\n";
        s += "Nombre: "+NombreAlumno+"\n";
        s += "Apellido: "+ApellidoAlumno+"\n";
        s += "Telefono: "+TelefonoAlumno+"\n";
        s += "Correo: "+CorreoAlumno+"\n";
        return s;
    }
}
