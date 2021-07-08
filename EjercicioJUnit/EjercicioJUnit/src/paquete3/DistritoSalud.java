/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class DistritoSalud {
    private ArrayList<Clinica> listaClinicas;
    private String nombre;
    private int totalMedicos;
    
    public void establecerListaClinicas(ArrayList<Clinica> v){
        listaClinicas = v;
    }
    
    public ArrayList<Clinica> obtenerListaClinicas(){
        return listaClinicas;
    }
    
    public void establecerTotalMedicos(){
        for (int i = 0; i < obtenerListaClinicas().size(); i++) {
            totalMedicos = totalMedicos + 
                    obtenerListaClinicas().get(i).obtenerNumeroMedicos();
        }
        
    }
    
    public int obtenerTotalMedicos(){
        return totalMedicos;
    }
}
