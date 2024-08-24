package MVCvol2;

public class controlador {

    public void vali(){

        vista con = new vista();
        double n = con.soliN();

        if(n>0){
            modelo cos = new modelo(0);
            negocios ope = new negocios();
            double s = ope.cicloFormula(cos.getN()); 
            con.finalReul(s);
        }else{
            con.Falla();
        }

    }
    
}
