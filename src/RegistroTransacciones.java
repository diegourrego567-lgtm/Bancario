import java.util.Vector;


public class RegistroTransacciones {

private Vector<String> logTransacciones;

public RegistroTransacciones(){
    logTransacciones= new Vector<>();

    logTransacciones.add("Transaccion 1: deposito 500");
    logTransacciones.add("Transaccion 2: retiro 200");
    logTransacciones.add("Transaccion 3: transfirio 300");
    logTransacciones.add("Transaccion 4: pago de servicios 150");
    logTransacciones.add("Transaccion 5: consignacion 1000");
}

    public void  mostrarLogs () {
        for(String log: logTransacciones) {
            System.out.println(log);
        }
    }
}

