/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalarioMaestrosUnitec;

/**
 *
 * @author Alumno
 */
public class Profesor extends Persona {
    
    protected Materias []clases;
    private int contador = 0;

    public Profesor() {
    }
    

    public Profesor(String nombre, String Ncuenta) {
        this.nombre = nombre;
        this.Ncuenta = Ncuenta;
        clases = new Materias[6];
    }

    public Profesor( Materias[] clases) {
        this.clases = clases;
    }

    public Materias[] getClases() {
        return clases;
    }

    public void setClases(Materias[] clases) {
        this.clases = clases;
    }
    
    public void AgregarClases(Materias m){
        
        if(contador > clases.length -1)
        {
            System.out.println("Error no hay espacio");
        }
        else
        { 
            clases[contador] = m;       
            contador++;
           
        }
    }
    
    @Override
    public void Imprimir() {
        
    }  
}
