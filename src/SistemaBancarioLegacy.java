import java.util.ArrayList;
import java.util.Vector;
public class SistemaBancarioLegacy {
    public static void main(String[] args) {
        
        medirTiempoVector();
        medirTiempoArrayList();
    }
    public static void medirTiempoVector(){
        Vector<Integer>vector=new Vector<>();

        long inicio=System.currentTimeMillis();

        for ( int i =0 ; i< 1000000;i++) {
            vector.add(i);
            
        }
        long fin=System.currentTimeMillis();
        System.out.println("tiempo vector:"+(fin-inicio)+"ms");

    }

    public static void medirTiempoArrayList() {

        ArrayList<Integer>arrayList=new ArrayList<>();

        long inicio= System.currentTimeMillis();

        for ( int i =0 ; i< 1000000;i++) {
            arrayList.add(i);
            
        
    }

    long fin= System.currentTimeMillis();
    System.out.println("tiempo ArrayList: "+ (fin-inicio)+ "ms");


    }
    
}


