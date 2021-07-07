
package paquete1;

public class Docente {
    private String nombres;
    private String tipo;
    
    public void establecerNombres(String n){
        nombres = n;
    }
    
    public String obtenerNombres(){
        return nombres;
    }
    
    public void establecerTipo(String n){
        tipo = n;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    
}
