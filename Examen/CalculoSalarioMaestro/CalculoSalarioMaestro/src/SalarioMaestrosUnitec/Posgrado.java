/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalarioMaestrosUnitec;

/**
 *
 * @author Deyvi Tabora
 */
public class Posgrado extends Profesor {
    protected double pagoXClase;
    private int tamañoArreglo=0;

    public Posgrado() {
        
    }

    public Posgrado(String nombre, String Ncuenta, double pagoXClase) {
        super(nombre, Ncuenta);
        this.pagoXClase = pagoXClase;
    }
   
    public void Arreglo(){
        for(int i=0;i<clases.length;i++){
        if(clases[i] != null){
        tamañoArreglo++;
        }
        }
    }
    
    @Override
    public void Imprimir() {
        Arreglo();
        System.out.println("Nombre: "+nombre+" Fecha: "+Ncuenta+
                " Clases: "+tamañoArreglo);
        System.out.println("Pago "+(this.pagoXClase*tamañoArreglo));
    }
    
    
}
