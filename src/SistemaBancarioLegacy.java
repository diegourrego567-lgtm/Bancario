import java.util.ArrayList;
import java.util.Vector;
public class SistemaBancarioLegacy {

    public static long  medirTiempoVector(){
        Vector<Integer>vector=new Vector<>();

        long inicio=System.currentTimeMillis();

        for ( int i =0 ; i< 1_000_000;i++) {
            vector.add(i);
            
        }
        long fin=System.currentTimeMillis();
        return fin-inicio;

    }

    public static long medirTiempoArrayList() {

        ArrayList<Integer>arrayList=new ArrayList<>();

        long inicio= System.currentTimeMillis();

        for ( int i =0 ; i< 1000000;i++) {
            arrayList.add(i);
            
        
    }

    long fin= System.currentTimeMillis();
    return fin-inicio ;


    }
    
}


