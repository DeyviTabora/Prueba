/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalarioMaestrosUnitec;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SalarioMaestrosUnitec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Materias m1 = new Materias("Programacion I", 133);
        Materias m2 = new Materias("Teoria Base de Datos", 244);
        Materias m3 = new Materias("Desarrollo Web I", 356);
        Materias m4 = new Materias("Programacion II",587);
        Materias m5 = new Materias("Desarrollo Web II",357);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del maestro");
        String tipo = sc.nextLine();
        
        if(tipo.contains("Sergio Peralta")){
        Pregrado mp = new Pregrado("Sergio Peralta", "T1234",3000);
        mp.AgregarClases(m1);
        mp.AgregarClases(m2);
        mp.AgregarClases(m3);
        mp.AgregarClases(m5);
        
        mp.Imprimir();
        
        }else if(tipo.contains("Willian Taylor")){
        Posgrado mp = new Posgrado("Willian Taylor", "T2468",2000);
        mp.AgregarClases(m1);
        mp.AgregarClases(m2);
        mp.AgregarClases(m3);
        mp.AgregarClases(m4);
        
        mp.Imprimir();
        }
    }
    
}
