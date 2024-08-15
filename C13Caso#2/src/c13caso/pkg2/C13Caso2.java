/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13caso.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy
 */
public class C13Caso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos una instancia que nos permita acceder a los metodos
        SistemaHabitaciones sistema = new SistemaHabitaciones();
        //Llamamos todos los metodos creados en la clase SistemaHabitaciones
        sistema.precargarHabitaciones(sistema.arrHabitaciones, 3, 3);
        sistema.mostrarInformacion(sistema.arrHabitaciones, 3, 3);
        sistema.modificarInformacion(sistema.arrHabitaciones, 3, 3);
        sistema.mostrarInformacion(sistema.arrHabitaciones, 3, 3);
        sistema.resumenEstadoHotel(sistema.arrHabitaciones, 3, 3);
    }
      
}
