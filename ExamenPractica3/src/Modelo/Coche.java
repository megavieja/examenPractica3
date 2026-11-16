/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author alumno
 */
public class Coche {
    String matricula;
    LocalDate fechaMatriculación;
    float precio;

    public Coche(String matricula, LocalDate fechaMatriculación, float precio) {
        this.matricula = matricula;
        this.fechaMatriculación = fechaMatriculación;
        this.precio = precio;
    }

    public Coche() {
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getFechaMatriculación() {
        return fechaMatriculación;
    }

    public float getPrecio() {
        return precio;
    }
  
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setFechaMatriculación(LocalDate fechaMatriculación) {
        this.fechaMatriculación = fechaMatriculación;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", fechaMatriculaci\u00f3n=" + fechaMatriculación + ", precio=" + precio + '}';
    }
    
}
