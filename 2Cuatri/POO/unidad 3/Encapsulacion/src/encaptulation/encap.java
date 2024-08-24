package encaptulation;

public class encap {

    private int x, y, a;
    private boolean bandera = true;
    
    //constructor
    public encap(int x, int y, int a){
        if(x>0 && y!=0 && a>=0){
            this.x=x;
            this.y=y;  
            this.a=a;         
        }else{
            System.out.println("Datos incorrectos");
            bandera = false;
        }
    }
    
    public int getx(){
        return x;
    }
    
    public int gety(){
        return y;
    }

    public int geta(){
        return a;
    }
    
    public boolean isBandera(){
        return bandera;
    }
    
}
