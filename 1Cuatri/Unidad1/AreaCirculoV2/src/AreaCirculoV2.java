public class AreaCirculoV2 {
    public static void main(String[] args) {

        //Declaracion de variable

        double radio, area;
        String valor;

        //Entrada
        valor = IOptionPane.showImputDialog("Introduce el radio");
        radio = Double.parseDouble(valor);

        //Proceso
        area = Math.PI * radio * radio;

        //Salida
        IOptionPane.showMenssageDialog(parentComponent:null, "El area del circulo es. " + area);

    

    }
}
