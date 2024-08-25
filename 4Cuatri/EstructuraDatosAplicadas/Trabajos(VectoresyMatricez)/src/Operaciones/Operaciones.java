package Operaciones;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Operaciones {

    private int vector[];

    public int[] getVector() {
        return vector;
    }

    public Operaciones(int tamanio) {
        vector = new int[tamanio];

    }

    public void llenarValor() {
        int i = 0;

        while (i < vector.length) {
            vector[i] = solicitarValor();
            i++;
        }

    }

    private int solicitarValor() {
        boolean sentinel = true;
        int valor = 0;
        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
                sentinel = false;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Valor no valido");
            }

        } while (sentinel);

        return valor;
    }

    private boolean validar(String valor) {
        try {

            Integer.parseInt(valor);
            return true;

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Dato No Valido");
            return false;
        }

    }

    public String Imprimir() {

        int i = 0;
        String cadena = "";
        do {
            cadena += ("| " + vector[i] + " ");
            i++;

        } while (i < vector.length);
        return cadena;
    }

    public String CopearVector() {
        int[] vectorCopia = new int[vector.length];
        String cadena1 = "";
        String cadena2 = "";
        for (int i = 0; i < vector.length; i++) {
            vectorCopia[i] = vector[i];
            cadena1 += ("| " + vector[i] + " ");
            cadena2 += ("| " + vectorCopia[i] + " ");
        }

        return "Original: " + cadena1 + "\n" + "Copia:" + cadena2;
    }

    public String busquedaSecuencial(int valor) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valor) {
                return "Numero encontrado, en la posicion:" + (i + 1); // Valor encontrado, devuelve la posición
            }
        }
        return "Numero no encontrado"; // Valor no encontrado
    }

    public String busquedaBinaria(int valor) {
        int inicio = 0;
        int fin = vector.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (vector[medio] == valor) {
                return "Valor encontrado, en la posicion: " + (medio + 1); // Valor encontrado, devuelve la posición.
            }

            if (vector[medio] < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return "Valor no encontrado"; // Valor no encontrado.
    }

    public String imprimirVectorBurbuja() {
        ordenarBurbuja(vector);

        int i = 0;
        String cadena = "";
        do {
            cadena += ("| " + vector[i] + " ");
            i++;

        } while (i < vector.length);
        return "Vector Ordenado por burbuja: " + cadena;
    }

    private void ordenarBurbuja(int vector[]) {
        int n = vector.length;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    // Intercambia arr[j] y arr[j+1]
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                    intercambio = true;
                }
            }

            // Si no se realizó ningún intercambio en esta pasada, el vector ya está ordenado
            if (!intercambio) {
                break;
            }
        }
    }

    public String imprimirVectorBurbujaMejorada() {
        ordenarBurbujaMejorada(vector);

        int i = 0;
        String cadena = "";
        do {
            cadena += ("| " + vector[i] + " ");
            i++;

        } while (i < vector.length);
        return "Vector Ordenado por burbuja mejorada: " + cadena;
    }

    private void ordenarBurbujaMejorada(int vector[]) {
        int n = vector.length;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    // Intercambia arr[j] y arr[j+1]
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                    intercambio = true;
                }
            }

            // Si no se realizó ningún intercambio en esta pasada, el vector ya está ordenado
            if (!intercambio) {
                break;
            }
        }
    }

    public String imprimirVectorShell() {
        ordenarShell(vector);

        int i = 0;
        String cadena = "";
        do {
            cadena += ("| " + vector[i] + " ");
            i++;

        } while (i < vector.length);
        return "Vector Ordenado por shell: " + cadena;
    }

    public void ordenarShell(int vector[]) {
        int n = vector.length;

        // Determina los incrementos (gaps)
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Realiza una serie de ordenamientos por inserción con el gap actual
            for (int i = gap; i < n; i++) {
                int temp = vector[i];
                int j;
                for (j = i; j >= gap && vector[j - gap] > temp; j -= gap) {
                    vector[j] = vector[j - gap];
                }
                vector[j] = temp;
            }
        }
    }

    public String imprimirVectorMerge() {
        mergeSort(vector);

        int i = 0;
        String cadena = "";
        do {
            cadena += ("| " + vector[i] + " ");
            i++;

        } while (i < vector.length);
        return "Vector Ordenado por merge: " + cadena;
    }

    private void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, n - mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public String imprimirVectorQuickSort() {
        quickSort(vector, 0, vector.length - 1);

        int i = 0;
        String cadena = "";
        do {
            cadena += ("| " + vector[i] + " ");
            i++;

        } while (i < vector.length);
        return "Vector Ordenado por quick sort: " + cadena;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public String MediaAritmetica() {
        double media = calcularMedia(vector);

        return "Media Aritmetica:" + media;
    }

    private static double calcularMedia(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }

        return (double) suma / arr.length; // Convertimos a double para obtener una media fraccional.
    }

    public String Moda() {
        int moda = calcularModa(vector);

        return "Moda:" + moda;
    }

    private static int calcularModa(int[] arr) {
        Map<Integer, Integer> frecuencias = new HashMap<>();

        // Contar la frecuencia de cada elemento en el vector
        for (int elemento : arr) {
            frecuencias.put(elemento, frecuencias.getOrDefault(elemento, 0) + 1);
        }

        int moda = 0; // El elemento con la frecuencia máxima
        int frecuenciaMaxima = 0; // Frecuencia máxima encontrada

        // Encontrar el elemento con la frecuencia máxima
        for (Map.Entry<Integer, Integer> entry : frecuencias.entrySet()) {
            int elemento = entry.getKey();
            int frecuencia = entry.getValue();

            if (frecuencia > frecuenciaMaxima) {
                moda = elemento;
                frecuenciaMaxima = frecuencia;
            }
        }

        return moda;
    }

    public String Mediana() {
        double mediana = calcularMediana(vector);

        return "Mediana:" + mediana;
    }

    public double calcularMediana(int[] arr) {
        ordenarShell(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            // Si el vector tiene un número par de elementos, toma el promedio de los dos valores centrales.
            int medio1 = arr[n / 2 - 1];
            int medio2 = arr[n / 2];
            return (double) (medio1 + medio2) / 2;
        } else {
            // Si el vector tiene un número impar de elementos, toma el valor central.
            return (double) arr[n / 2];
        }
    }

    public String DesviacionEstandar() {
        double desviacion = calcularMediana(vector);

        return "Desviacion Estandar:" + desviacion;
    }

    public static double calcularDesviacionEstandar(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return 0.0;
        }

        double suma = 0.0;
        double media = calcularMedia(arr);

        for (int i = 0; i < n; i++) {
            suma += Math.pow(arr[i] - media, 2);
        }

        double varianza = suma / (n - 1); // Varianza muestral
        return Math.sqrt(varianza);
    }

    public int sumarArreglo(int[] arr) {
        ordenarShell(arr);
        int suma = 0;
        for (int elemento : arr) {
            suma += elemento;
        }
        return suma;
    }

    public String muestraSuma() {
        int suma = sumarArreglo(vector);
        return "La suma es: " + suma;
    }
    
}
