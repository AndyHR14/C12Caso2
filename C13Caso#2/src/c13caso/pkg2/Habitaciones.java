/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c13caso.pkg2;

/**
 *
 * @author Andy
 */
public class Habitaciones {
    //Creamos los atributos de nuestro objeto
    int num;
    String estadoActual;
    String tipo;
    double precioxNoche;

    //Creamos los constructores y setters y getters
    public Habitaciones(int num, String tipo, String estadoActual, double precioxNoche) {
        this.num = num;
        this.tipo = tipo;
        this.estadoActual = estadoActual;
        this.precioxNoche = precioxNoche;
    }
    //Utilizamos el toString para que nuestra matriz de muestre correctamente
    @Override
    public String toString() {
        return "" + num + " " + estadoActual + " " + tipo + " " + precioxNoche + "\n";
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioxNoche() {
        return precioxNoche;
    }

    public void setPrecioxNoche(double precioxNoche) {
        this.precioxNoche = precioxNoche;
    }

    
    
}
