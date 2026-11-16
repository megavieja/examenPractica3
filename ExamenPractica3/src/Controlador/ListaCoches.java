/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import java.util.ArrayList;
import java.util.Comparator;
import Modelo.Coche;
/**
 *
 * @author alumno
 */
public class ListaCoches extends ArrayList<Coche>  {
    private int actual = 0;   // indice del cliente que se esta mostrando

    public ListaCoches() {
        super();
    }

    // ---- Estado de la lista ----
    // OJO: isEmpty() ya existe en ArrayList, asi que "esVacia" solo lo envuelve
    public boolean esVacia() { return isEmpty(); }
    public boolean esPrimero() { return actual == 0; }
    public boolean esUltimo() { return actual == size() - 1; }

    // ---- Navegacion ----
    public void avanzar() { if (!esVacia() && !esUltimo()) actual++; }
    public void retroceder() { if (!esVacia() && !esPrimero()) actual--; }
    public void irAlPrimero() { actual = 0; }
    public void irAlUltimo() { actual = Math.max(0, size() - 1); }
    
    
    /** Añade, reordena por numero y deja como actual al cliente recien creado. */
    public void anadirCoche(Coche c) {
        add(c);
        ordenarPorMatricula();
        actual = indexOf(c);
    }

    /** Borra el cliente actual y recoloca el indice para que no se salga de la lista. */
    public void borrarCoche() {
        if (esVacia()) return;
        remove(actual);
        if (actual >= size()) actual = Math.max(0, size() - 1);
    }

    public Coche getCocheActual() {
        return esVacia() ? null : get(actual);
    }

    public void ordenarPorMatricula() {
        sort(Comparator.comparing(Coche::getMatricula));
    }

    // ---- Extras ----
    public int getActual() { return actual; }

    public boolean existeMatricula(String matricula) {
        for (Coche c : this)
            if (c.getMatricula().equals(matricula) == true) return true;
        return false;
    }
}
