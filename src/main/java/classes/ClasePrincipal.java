/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author acarvajal16
 */
public class ClasePrincipal {

    public static void main(String[] args){
        System.out.println("La lista de estudiantes es:");
        
        
        ListaEstudiantes.add("Ana", 15);
        ListaEstudiantes.add("Jorge", 25);
        ListaEstudiantes.add("Camilo", 18);
        ListaEstudiantes.add("Diego", 20);
        ListaEstudiantes.add("Felipe", 19);
        
        Collections.sort(ListaEstudiantes);
        for (String estudiante : ListaEstudiantes){
            System.out.println(ListaEstudiantes);
        }
        


}

}

            
