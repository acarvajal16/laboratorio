/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author acarvajal16
 */
public class Nodo {
    
    private Estudiante estudiante;
    private Nodo next;

    public Nodo(Estudiante estudiante, Nodo next) {
        this.estudiante = estudiante;
        this.next = next;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    public String mostrarInfomacion(){
        
        return null;
        
    }

    
    
    
}
