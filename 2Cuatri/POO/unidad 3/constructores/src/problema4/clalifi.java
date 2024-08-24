package problema4;

import javax.swing.JOptionPane;
public class clalifi {

    private double numCalifi;
    boolean SENTINEL = true;
    double prom = 0;
    String menu = "";
    int c2=1;
    int c1=0;
    boolean bandera = true;

    public clalifi(int n) {

        this.numCalifi=n;

    }

    public boolean bandera(){
        return bandera;
    }

    public void cal(){
        for (int i = 1; i <= 1; i++) {
            numCalifi = Double.parseDouble(JOptionPane.showInputDialog("Introduce el la calificacion " + (c1+1)));
            if(numCalifi>0 && numCalifi<=100){
                prom += numCalifi;
                c1++;
            }else{
                JOptionPane.showMessageDialog(null, "la calificacion es incorrecta\nBuelva a ingresarlo");
            }
        }
        
    }

    public double calculo() {

        do {
            c2++;
            menu = JOptionPane.showInputDialog("¿Desea ingresar otra calificacion? si o no\n");
            if (menu.equalsIgnoreCase("si")) {
                this.cal();
            } else if (menu.equalsIgnoreCase("no")) {
                SENTINEL = false;
            }
        } while(SENTINEL);
        return prom/c1;
    }

}
