package funciones;

public class funciones {
    // Crear atributos
    private int tipoRopa = 0, kilos = 0, llenacomple = 0, lavacomple=0, secacomple=0;

    // Crear constructor
    public funciones(int _tipoRopa, int _kilos) {

        this.tipoRopa = _tipoRopa;
        this.kilos = _kilos;

    }

    private void llenado() {

        if (kilos < 12) {63
            System.out.println("Llenando...");
            System.out.println("Nivel de agua completo");
            llenacomple = 1;
        } else {
            System.out.println("No soy ballena");
        }

    }

    private void lavar(){

        llenado();

        if(llenacomple==1){
            if(tipoRopa==1){
                System.out.println("Ropla blanca\nlavado suave");
                System.out.println("lavando...");
                lavacomple=1;
            }else if(tipoRopa==2){
                System.out.println("Ropa de color\nlava duro(procede a despintar ropa)");
                System.out.println("lavando...");
                System.out.println("despintando");
                lavacomple=1;
            }else{
                System.out.println("No jodas >:v, soy lavadora de gobierno nmms");
                System.out.println("lavando ropa blanca y roja\nque te jodan");
                lavacomple=1;
            }
        }

    }

    private void seca(){
        
        lavar();

        if(lavacomple==1){
            System.out.println("Sencado...\nsecame esta");
            secacomple=1;
        }

    }

    public void cicloFinalizar(){

        seca();

        if(secacomple==1){
            System.out.println("Ropa lista, lava a mano menudo flojo");
        }

    }

}
