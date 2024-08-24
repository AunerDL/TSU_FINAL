public class Auto {

    // Declaracion de atributos
    String color, marca, modelo;

    private boolean acceso=false;

    //Declaracion de metodos
    public void meterlallave(String clave){

        if(clave.equals("Franchesco")){
            acceso=true;
        }else{
            acceso=false;
            System.out.println("virgolini FIIIIIAAAAAUUUUUUUUUU");
        }

    }

    public void mandar(String accion){

        if(acceso==true){
            if(accion.equals("enciende\nla maquina mas velos de tuta italie")){
                enciende();
            }
        }

    }
    
    private void enciende(){
        System.out.println("enciende\nla maquina mas velos de tuta italie");
    }

    public void acelerar(){
        System.out.println("Velocimetro acelera");
    }

    public void frenar(){
        System.out.println("Velocimetro frena");
    }
    
}
