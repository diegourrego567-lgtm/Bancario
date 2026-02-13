public class RegistroTransacciones {

public static void main(String[] args) {
    long medirTiempoVector= SistemaBancarioLegacy.medirTiempoVector();
    long medirTiempoArrayList=SistemaBancarioLegacy.medirTiempoArrayList();

    System.out.println("Resulados de tiempo");
    System.out.println("tiempo usado vector"+medirTiempoVector+"ms");
    System.out.println("tiempo usado ArrayList"+ medirTiempoArrayList+"ms");
}
}

