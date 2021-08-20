/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;


import static javax.management.Query.value;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author acarvaja116
 */
public class ListaEstudiantes implements IListaEnlazada {
    
    private Nodo primero;
    private Nodo ultimo;
    private int cantidad;
    private Nodo value;

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
          Nodo Estudiante = null;
          Nodo Nodo = value;
          primero= Nodo;
          primero.setNext(Estudiante);
     
      }else{
          ultimo.setNext(nuevo);
          ultimo = nuevo;
      }
      
      this.cantidad++;
      
    }
    @Override
    public Nodo buscarPorIndice(int indice){
        //ListaEstudiantes< listaenlazada = new ListaEstudiantes <String>();
        return null;
        
    }
    @Override
    public void eliminarPorIndice(int indice){
        
    }
    @Override
    public Nodo obtenerPrimero(){
        
        if (primero==null)
            return null;
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
        primero= null;
        
    }
    
            

}
