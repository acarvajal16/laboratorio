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
public interface IListaEnlazada {
    
    public void agregar (Nodo n);
    public Nodo buscarPorIndice(int indice);
    public void eliminarPorIndice(int indice);
    public Nodo obtenerPrimero();
    public Nodo obtenerUltimo();
    public void eliminarPrimero();
    public void eliminarUltimo();
    public void vaciar();
    
    }
    
