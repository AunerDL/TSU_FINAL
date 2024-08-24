package MVC;

public class controlar {
    
    public void mostrar(){

        vista pedir= new vista();
        double z= pedir.Pedirz();
        double v= pedir.Pediv();

        if(z>0){
            if(v>0){

                modelo dato= new modelo(z, v);
                negocios formu= new negocios();
                double r= formu.Formula(z, v);
                pedir.Resultado(r);


            }
        }


    }



}
