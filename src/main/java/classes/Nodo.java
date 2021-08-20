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
        Nodo actual = (Nodo) getPrimero();

        if (getPrimero() != null) {
            do {
                System.out.println("* " + actual.getValue());
                actual = actual.getNext();

            } while (actual != null);
        } else {
            System.out.println("La lista está vacía.");
        }
        
        System.out.println("getEstudiante"+"Nodo getNext");
        return null;
        
    }

    private Object getPrimero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
