/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

/**
 *
 * @author alumno
 */
public final class ControlErrores {
    private static final DateTimeFormatter FORMATO =
            DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

    private ControlErrores() { }   // no se puede instanciar
    
   /* public static Boolean validarMatricula(String texto) {
        char [] aux;
        aux = texto.toCharArray();
        char aux1=q;
        for (int i = 0; i < 4; i++) {
             if (aux[i].class != aux1.class)) {} else {
                 return true;
            }
        }
        
        return false;
    }*/

   public static String validarFecha(String texto) {
        try {
            LocalDate f = LocalDate.parse(texto.trim(), FORMATO);
            if (f.getYear() < 1990 || f.getYear() > 2026)
                return "El año de nacimiento debe estar entre 1900 y 2015.";
            return null;
        } catch (Exception e) {
            return "Fecha incorrecta. Use el formato dd/mm/aaaa (ej. 25/12/1990).";
        }
    }
   public static LocalDate convertirFecha(String texto) {
        return LocalDate.parse(texto.trim(), FORMATO);
    }
   
   public static String validarPrecio(String texto) {
        try {
            float p = Float.parseFloat(texto.trim().replace(',', '.'));
            if (p < 0 || p > 150000) return "Los puntos deben estar entre 0 y 1000.";
            return null;
        } catch (NumberFormatException e) {
            return "Los puntos deben ser un numero valido.";
        }
    }

}