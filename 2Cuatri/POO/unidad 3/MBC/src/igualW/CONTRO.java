package igualW;

public class CONTRO {

    public void valid(){

        VISTA pedir = new VISTA();
        int x = pedir.soliciX();
        int y = pedir.soliciY();

        if(x>0 && y>0){
            MODELO form = new MODELO(x, y);
            NEGO oper = new NEGO();
            double w = oper.Formu(form.getX(), form.getY());
            pedir.Resultado(w);
        }else{
            pedir.ERROR();
        }

    }
    
}
