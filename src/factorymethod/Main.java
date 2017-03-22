package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus siivooja = new Siivooja();
        opettaja.aterioi();
        oppilas.aterioi();
        siivooja.aterioi();
    }
}
