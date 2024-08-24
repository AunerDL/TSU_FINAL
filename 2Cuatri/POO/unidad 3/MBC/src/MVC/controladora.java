package MVC;

//instancias o validaciones
public class controladora {
    
    //obtener x y y
    public void valida(){
        vista datos = new vista();
        int x = datos.soliX();
        int y = datos.soliY();

        if(x>0 && y!=0){
            modelo obj = new modelo(x, y);
            negocio opera = new negocio();
            double z = opera.fomrula(obj.getx(), obj.gety());
            datos.Result(z);
        }else{
            datos.Error();
        }

    }
    
}
