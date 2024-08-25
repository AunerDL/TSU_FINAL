/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.VectoresMatrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 *
 * @author gabod
 */
public class Matrices {

    private int[][] matriz;
    private int filas;
    private int columnas;

    public Matrices(int filas, int columnas) {
        matriz = new int[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
    }

    public void llenarMatriz(int[][] elementos) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = elementos[i][j];
            }
        }
    }

    public int[][] obtenerMatriz() {
        return matriz;
    }

    public int obtenerElemento(int fila, int columna) {
        return matriz[fila][columna];
    }

    public void sumar(Matrices otraMatriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] += otraMatriz.obtenerElemento(i, j);
            }
        }
    }

    public void restar(Matrices otraMatriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] -= otraMatriz.obtenerElemento(i, j);
            }
        }
    }

    public void multiplicar(Matrices otraMatriz) {
        int filas1 = matriz.length;
        int columnas1 = matriz[0].length;
        int columnas2 = otraMatriz.matriz[0].length;

        int[][] resultado = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz[i][k] * otraMatriz.matriz[k][j];
                }
            }
        }

        matriz = resultado;
    }

    public int sumaDiagonal() {
        int suma = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas == columnas) {
            for (int i = 0; i < filas; i++) {
                suma += matriz[i][i];
            }
        } else {
            return -1;
        }

        return suma;
    }

    public int sumaDiagonalInversa() {
        int suma = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas == columnas) {
            for (int i = 0; i < filas; i++) {
                suma += matriz[i][columnas - 1 - i];
            }
        } else {
            return -1;
        }

        return suma;
    }

    public double calcularMediaAritmetica() {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int suma = 0;
        int elementos = filas * columnas;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }

        return (double) suma / elementos;
    }

    public int calcularModa() {
        Map<Integer, Integer> conteo = new HashMap<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int elemento = matriz[i][j];
                conteo.put(elemento, conteo.getOrDefault(elemento, 0) + 1);
            }
        }

        List<Integer> moda = new ArrayList<>();
        int maxRepeticiones = Collections.max(conteo.values());

        for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) {
            if (entry.getValue() == maxRepeticiones) {
                moda.add(entry.getKey());
            }
        }

        return moda.isEmpty() ? -1 : moda.get(0);
    }

    public double calcularMediana() {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[] elementos = new int[filas * columnas];

        int index = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                elementos[index] = matriz[i][j];
                index++;
            }
        }

        Arrays.sort(elementos);

        int n = elementos.length;
        if (n % 2 == 0) {
            return (elementos[n / 2 - 1] + elementos[n / 2]) / 2.0;
        } else {
            return elementos[n / 2];
        }
    }

    public double calcularMedia() {
        int[] elementos = new int[matriz.length * matriz[0].length];
        int index = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                elementos[index] = matriz[i][j];
                index++;
            }
        }

        double suma = IntStream.of(elementos).sum();
        return suma / elementos.length;
    }

    public double calcularDesviacionEstandar() {
        double media = calcularMedia();
        int[] elementos = new int[matriz.length * matriz[0].length];
        int index = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                elementos[index] = matriz[i][j];
                index++;
            }
        }

        double sumaDeDiferenciasCuadradas = 0.0;
        for (int elemento : elementos) {
            sumaDeDiferenciasCuadradas += Math.pow(elemento - media, 2);
        }

        return Math.sqrt(sumaDeDiferenciasCuadradas / elementos.length);
    }

    public String MatrizTranspuesta() {
        String cadena = "";
        int[][] MatrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                MatrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        for (int i = 0; i < MatrizTranspuesta.length; i++) {
            for (int j = 0; j < MatrizTranspuesta[0].length; j++) {
                cadena += (MatrizTranspuesta[i][j] + "\t");
            }
            cadena += "\n\n";
        }
        return cadena;
    }

    public void ordenarMatriz() {
        for (int i = 0; i < filas; i++) {
            Arrays.sort(matriz[i]);
        }
    }

    public int getFilas() {
        return matriz.length;
    }

    public int getColumnas() {
        return matriz[0].length;
    }

    public Object MatrizTranspuesta(int[][] matrizTranspuesta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
