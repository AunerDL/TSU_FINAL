/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exame2;

/**
 *
 * @author ser1b
 */
public class Operaciones {

    private int[][] matriz;
    private int filas;
    private int columnas;

    public Operaciones(int filas, int columnas) {
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

    public int[] sumaDeFilasMatriz() {
        int suma = 0;

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int vectorSum[] = new int[filas];

        for (int i = 0; i < filas; i++) {
            int SumadorFila = 0;
            for (int j = 0; j < columnas; j++) {
                SumadorFila += matriz[i][j];
            }
            vectorSum[i] = SumadorFila;
        }
        return vectorSum;
    }

    public String imprimirSumaFilas() {
        int[] suma = sumaDeFilasMatriz();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < suma.length; i++) {
            resultado.append("Fila ").append(i + 1).append(": ").append(suma[i]).append("\n");
        }

        return resultado.toString();
    }

    public int[] sumaDeColumnasMatriz() {
        int suma = 0;

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int vectorSum[] = new int[columnas];

        for (int i = 0; i < columnas; i++) {
            int SumaColumna = 0;
            for (int j = 0; j < filas; j++) {
                System.out.println(matriz[j][i]);
                SumaColumna = +SumaColumna + matriz[j][i];
            }
            vectorSum[i] = SumaColumna;
        }
        return vectorSum;
    }

    public String imrpimirSumaColumnas() {
        int[] suma = sumaDeColumnasMatriz();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < suma.length; i++) {
            resultado.append("Fila ").append(i + 1).append(": ").append(suma[i]).append("\n");
        }

        return resultado.toString();
    }

    public int sumaTotalMatriz() {
        int sumaTotal = 0;

        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaTotal += matriz[i][j];
            }
        }

        return sumaTotal;
    }

    public String imprimirSumaMatriz() {
        int suma = sumaTotalMatriz();
        StringBuilder resultado = new StringBuilder();

        resultado.append("Suma total de la kilometros: ").append(suma).append("\n");

        return resultado.toString();
    }

    public int recaudacion() {
        int[] vectorSum = sumaDeFilasMatriz();
        int filaMayorSuma = 0;
        int mayorSuma = vectorSum[0];

        for (int i = 1; i < vectorSum.length; i++) {
            if (vectorSum[i] > mayorSuma) {
                mayorSuma = vectorSum[i];
                filaMayorSuma = i + 1;
            }
        }

        return filaMayorSuma;
    }

    public String imprimirRecaudacion() {
        int imprimir = recaudacion();
        return "La sucursal " + imprimir;
    }

public int cantidadArticuloSucursal(int articulo, int sucursal) {
    int cantidad = 0;

    int filas = matriz.length;
    int columnas = matriz[0].length;

    for (int i = 0; i < filas; i++) {
        if (i == sucursal - 1) {
            for (int j = 0; j < columnas; j++) {
                if (j == articulo - 1) {
                    cantidad = matriz[i][j];
                    break;
                }
            }
        }
    }

    return cantidad;
}


}
