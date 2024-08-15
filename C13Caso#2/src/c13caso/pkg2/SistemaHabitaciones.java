/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c13caso.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy
 */
public class SistemaHabitaciones {

    //Definimos la cantidad de filas y de columnas que tendra nuestro programa
    int cantFilas = 3;
    int cantColumnas = 3;
    //Creamos una matriz de objetos bidimensional
    Habitaciones[][] arrHabitaciones = new Habitaciones[cantFilas][cantColumnas];

    //Metodo que precarga las habitaciones en el sistema
    public void precargarHabitaciones(Habitaciones[][] arrHabitaciones, int filas, int columnas) {
        Double precioxNoche1 = 20.00;
        for (int i = 0; i < filas; i++) {
            precioxNoche1 += 10.00;
            for (int j = 0; j < columnas; j++) {
                int num = Integer.parseInt((i + 1) + "0" + (j + 1));
                String estado = "Ocupada";
                String tipo = "Doble";
                if (j % 2 == 0) {
                    tipo = "Simple";
                    estado = "Libre";
                } else if (j == 3) {
                    estado = "Sucia";
                }
                Double precioxNoche = precioxNoche1;
                arrHabitaciones[i][j] = new Habitaciones(num, tipo, estado, precioxNoche);
            }
        }
    }

    //metodo para mostrar la informacion del hotel mediante el comando showMessage y el arreglo de objetos
    public void mostrarInformacion(Habitaciones[][] arrHabitaciones, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            JOptionPane.showMessageDialog(null, "Piso #" + (i + 1));
            for (int j = 0; j < columnas; j++) {
                JOptionPane.showMessageDialog(null, arrHabitaciones[i][j].getNum() + "\n" + arrHabitaciones[i][j].getEstadoActual()
                        + "\n" + arrHabitaciones[i][j].getTipo() + "\n" + arrHabitaciones[i][j].getPrecioxNoche() + "$");
            }
        }
    }

    //metodo que nos permite modificar la informacion de la habitacion por medio de ingresar el numero de habitacion
    public void modificarInformacion(Habitaciones[][] arrHabitaciones, int filas, int columnas) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la habitacion que desea modificar:"));
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (num == arrHabitaciones[i][j].getNum()) {
                    JOptionPane.showMessageDialog(null, "A continuacion se solicitara la nueva informacion:");
                    String estado = JOptionPane.showInputDialog("Ingrese el nuevo estado de la habitacion (Libre, Ocupada o Sucia): ");
                    String tipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo de habitacion (Simple o Doble)");
                    Double precioxNoche = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio de la habitacion: "));
                    arrHabitaciones[i][j] = new Habitaciones(num, tipo, estado, precioxNoche);
                }
            }
        }
    }

    //Metodo que muestra el resumen de estado del hotel 
    public void resumenEstadoHotel(Habitaciones[][] arrHabitaciones, int filas, int columnas) {
        JOptionPane.showMessageDialog(null, "A continuacion se mostrara un resumen del estado del hotel: ");
        int contLibres = 0;
        int contOcupadas = 0;
        int contSucias = 0;
        int filasyColumnas = filas + columnas;
        double gananciaActual = 0.00;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (arrHabitaciones[i][j].getEstadoActual() == "Libre") {
                    contLibres += 1;
                } else if (arrHabitaciones[i][j].getEstadoActual() == "Ocupada") {
                    gananciaActual += arrHabitaciones[i][j].getPrecioxNoche();
                    contOcupadas += 1;
                } else {
                    contSucias += 1;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad total de habitaciones libres es de: " + contLibres + "\n"
                + "La cantidad total de habitaciones ocupadas es de: " + contOcupadas + "\n" + "La cantidad total de habitaciones sucias es de: " + contSucias);
        JOptionPane.showMessageDialog(null, "El porcentaje de habitaciones libres con respecto al total de habitaciones es: " + filasyColumnas * contLibres);
        JOptionPane.showMessageDialog(null, "La ganancia total del hotel es de: " + gananciaActual + "$");
    }
}
