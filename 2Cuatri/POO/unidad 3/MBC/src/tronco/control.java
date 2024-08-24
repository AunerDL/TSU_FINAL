package tronco;

public class control {

    public void validar(){
        vista nume = new vista();
    double P = nume.soliP();
    double P2 = nume.soliP2();
    double a = nume.solia();
    double Ab = nume.soliAb();
    double Ab2 = nume.soliAb2();

    if(P>0 && P2>0){
        modelo res = new modelo(P, P2, a, Ab, Ab2, Ab2);
        negocios fina = new negocios();
        double A = fina.FormulaA(res.getP(), res.getP2(), res.geta(), res.getAb(), res.getAb2());
        double V = fina.FormulaV(res.getAb(), res.getAb2(), res.geth());
        nume.ResultAdo1(A);
        nume.ResultAdo2(V); 
    }else{
        nume.ErroR();
    }
    }
    
}
