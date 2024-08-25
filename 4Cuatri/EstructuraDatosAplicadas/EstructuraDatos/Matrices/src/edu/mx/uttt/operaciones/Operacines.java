/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.operaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author gabod
 */
public class Operacines {
    
     private int vector[];

    public Operacines(int tamanio   ) {
        vector = new int[tamanio];
    }

    public void llenarArreglo() {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = solicitarValor();
        }
    }

    private int solicitarValor() {
        String valor = "";
        do {
            valor = JOptionPane.showInputDialog("");
        } while (!validar(valor));
        return Integer.parseInt(valor);
    }

    private boolean validar(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException ex) {
            JOptionPane.showInternalMessageDialog(null, "no valido");
            return false;
        }
    }

    public String imprimir() {
        int i = 0;
        String cadena = "";
        do {
            cadena += ("| " + vector[i] + " ");
            i++;
        } while (i < vector.length);
        return cadena;
    }

    //SUMAR LOS VALORES
    public int sumarValores() {
        int suma = 0;

        for (int i = 0; i < this.vector.length; i++) {
            suma += vector[i];
        }
        return suma;
    }

    public int sumarValores(int[] v) {
        return 1;
    }

    //CALCULAR NUMERO MAYOR
    public int calcularNumeroMayor() {
        int numMayor = vector[0];
        int numeroMayor = 0;
        for (int i = 0; i < this.vector.length; i++) {

            if (vector[i] > numMayor) {
                numMayor = vector[i];
            }
        }
        return numMayor;

    }

    //CALCULAR LOS NUMEROS IMPARES
    public int sumarPares() {

        int sumarImpares = 0;

        for (int i = 0; i < this.vector.length; i++) {
            if (vector[i] % 2 == 0) {
                sumarImpares += vector[i];
            }

        }
        return sumarImpares;
    }

    //METODO QUE CALCULA EL NUMERO PRIMO
    private boolean calcularPrimos(int valor) {
        int contador = 0;
        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                contador++;
            }
        }
        return contador == 2;
    }

    //CALCULARNUMEROSPRIMOS
    public int contarNumeroPrimos() {
        int numeroPrimos = 0;
        for (int i = 0; i < this.vector.length; i++) {

            if (calcularPrimos(vector[i])) {
                numeroPrimos++;
            }
        }
        return numeroPrimos;
    }

    //Obtener tamañio del arreglo
    public int getTamanio() {
        return vector.length;
    }

    public int[] getVector() {
        return this.vector;
    }

    @Override
    public String toString() {
        return imprimir();
    }

    //Busqueda secuencial
    public int busquedaSecuencial(int elemento) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == elemento) {
                return i+1;
            }
        }
        return -1;
    }

    public void ordenar(boolean tipo){
        if (tipo){
            for (int i=0; i < (vector.length -1); i++){
                for(int j = 0; j < vector.length - 1 - i; j++){
                    if(vector[j] > vector[j + 1]){
                        int temp = vector[j];
                        vector[j] = vector[j + 1];
                        vector[j + 1] = temp;
                    }
                }
            }
        }else{
            for (int i=0; i < (vector.length -1); i++){
                for(int j = 0; j < vector.length - 1 - i; j++){
                    if(vector[j] > vector[j + 1]){
                        int temp = vector[j];
                        vector[j] = vector[j + 1];
                        vector[j + 1] = temp;
                    }
                }
            }
        }
    }

    public void llenarValor() {
        int i = 0;

        while (i < vector.length) {
            vector[i] = solicitarValor();
            i++;
        }

    }

}


