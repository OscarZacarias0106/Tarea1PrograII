
package tareaprogra;


public class registroalumno {
    private Persona vec[];
    private int Tam;
    private int Can;

    public registroalumno(int n) {
        Tam = n;
        vec = new Persona[Tam];
        Can = 0;
    }

    public boolean agregar(Persona n){
        if(Can < Tam){
            vec[Can++] = n;
            return true;
        }
        return false;
    }

    public Persona buscar(String ApellidoAlumno){
        for (int i = 0; i < Can; i++) {
            if(vec[i].getApellidoAlumno().equals(ApellidoAlumno)){
                return vec[i];
            }
        }
        return null;
    }

    public String toStrin(){
        String s = "";
        for (int i = 0; i < Can; i++) {
            s += vec[i].toString();
        }
        return s;
    }

    public boolean eliminar(String Ced) {
        for (int i = 0; i < Can; i++) {
            if(vec[i].getApellidoAlumno().equals(Ced)){
                correrIzquierdad(i);
                return true;
            }
        }
        return false;
    }

    private void correrIzquierdad(int x) {
        for (int i = x; i < Can; i++) {
            vec[i] = vec[i+1];
        }
        Can--;
    }

}