package encaptulation;

public class prim {
    public static void main(String[] args) {

        variables kl = new variables();
        encap ti = new  encap(kl.soliX(), kl.soliY(), kl.soliA());
        
        if(ti.isBandera()){
            formula opera = new formula();
            double EKIS = opera.formu(ti.getx(), ti.gety(), ti.geta());
            kl.Resultado(EKIS);
        }else{
            kl.Error();
        }
        
    }
    
}
