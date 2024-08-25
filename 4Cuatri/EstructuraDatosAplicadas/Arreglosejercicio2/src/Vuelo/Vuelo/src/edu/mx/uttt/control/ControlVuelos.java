package edu.mx.uttt.control;

import javax.swing.JOptionPane;

public class ControlVuelos {

    private int[][] tablero; //= {{12, 56, 11}, {4, 5, 8}, {6, 7, 12}, {7, 8, 9}, {11, 23, 12}};
    //private String [] destinos;
    private String destinos[];// = {"Cancun", "CDMX", "Los Cabos", "Mazatlan", "Puerto Vallarta"};
    private String[] horarios;//= {"Mañana", "Medio Dia", "Noche"};

    public ControlVuelos() {

    }

    public ControlVuelos(int filas, int columnas) {
        tablero = new int[filas][columnas];
        destinos = new String[filas];
        horarios = new String[columnas];
        

    }

    public int[][] getTablero() {
        return tablero;
    }

    public String[] getDestinos() {
        return destinos;
    }

    public String[] getHorarios() {
        return horarios;
    }

    public String Imprimir() {
        String salida = "                        Mañana    Medio Dia    Noche\n";
        for (int i = 0; i < tablero.length; i++) {
            salida += destinos[i] + "                 ";
            for (int j = 0; j < tablero[0].length; j++) {
                salida += tablero[i][j] + "               ";
            }

            salida += "\n";
        }
        return salida;
    }

    public String mostrarMenuDestino() {
        String salida = "   Destinos      \n";

        for (int i = 0; i < destinos.length; i++) {
            salida += (i + 1) + ")" + destinos[i] + "\n";
        }

        salida += "Elegir Opción: \n";
        return salida;
    }

    public String mostrarMenuHorario() {
        String salida = "   Horarios      \n";

        for (int i = 0; i < horarios.length; i++) {
            salida += (i + 1) + ")" + horarios[i] + "\n";
        }

        salida += "Elegir Opción: \n";
        return salida;
    }

    public boolean verificarDisponibilidad(int destino, int horario, int numeroBoletos) {
        boolean res = false;
        String destinoss[] = destinos;
        if (numeroBoletos > 0) {
            if (tablero[destino - 1][horario - 1] >= numeroBoletos) {
                tablero[destino - 1][horario - 1] = tablero[destino - 1][horario - 1] - numeroBoletos;
                res = true;
                
                JOptionPane.showMessageDialog(null,"La venta fue exitosa");           
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Boletos Agotados o sin suficientes boletos,\n elija otro destino u horario Porfavor");
        }

        return res;

    }
    
//    public boolean verificarDisponibilidad(int destino, int horario, int numeroBoletos) {
//        boolean res = false;
//        if (numeroBoletos > 0) {
//            if (tablero[destino - 1][horario - 1] >= numeroBoletos) {
//                tablero[destino - 1][horario - 1] = tablero[destino - 1][horario - 1] - numeroBoletos;
//                res = true;
//                
//                JOptionPane.showMessageDialog(null,"La venta fue exitosa");           
//            }
//            JOptionPane.showMessageDialog(null, "Boletos Agotados, eliga otro destino u horario Profavor");
//        }
//
//        return res;
//
//    }

    public void llenarTablero() {
        boolean sentinel = false;
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {
                do {
                    try {
                        this.tablero[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de boletos: "));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El Valor Debe De Ser Entero");
                    }
                } while (sentinel);

            }
        }

    }

    public void llenarDestinos() {

        for (int i = 0; i < this.destinos.length; i++) {
            this.destinos[i] = JOptionPane.showInputDialog("Introduce El Destino " + (i+1));
        }
    }

    public void llenarHorarios() {

        for (int i = 0; i < this.horarios.length; i++) {
            this.horarios[i] = JOptionPane.showInputDialog("Introduce El Horario " + (i+1));
        }
    }

    public String mensaje(boolean opcion) {
        return opcion ? "La venta fue exitosa " : "La venta de boletos no fue exitosa por falta de disponibilidad";
    }
}
