/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase2;

/**
 *
 * @author dnlsn
 */
public class ClaseInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("HOLA")

        Libros objetoLibro1 = new Libros(1, "PROGRAMACION JAVA", 100, "Deitel");
        Libros objetoLibro2 = new Libros(2, "PROGRAMACION PHP", 600, "Deitel");

//            System.out.println(Libro.toString());
        if (objetoLibro1.getNumeroPaginas() < objetoLibro2.getNumeroPaginas()) {
            System.out.println("El libro 2 tiene mayor numero de paginas  que el libro 1");
        } else {
            System.out.println("El libro 1 tiene mayor numero de paginas que el libro 2");
        }

    }

}
