/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;


import static javax.management.Query.value;

/**
 *
 * @author acarvaja116
 */
public class ListaEstudiantes implements IListaEnlazada {
    
    private Nodo primero;
    private Nodo ultimo;
    private int cantidad;

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public void agregar (Nodo nuevo){
        
      if(primero == null){
          
          primero.setNext(Estudiante nuevo);
          
      }
      
    }
    @Override
    public Nodo buscarPorIndice(int indice){
        
        return null;
        
    }
    @Override
    public void eliminarPorIndice(int indice){
        
    }
    @Override
    public Nodo obtenerPrimero(){
        
        return null;
        
    }
    @Override
    public Nodo obtenerUltimo(){
        
        return null;
        
    }
    @Override
    public void eliminarPrimero(){
        
    }
    @Override
    public void eliminarUltimo(){
        
    }
    @Override
    public void vaciar(){
        
    }
    
            

}
