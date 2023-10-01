package AbstraticFactory;

public class Main {
    public static void execute() throws Exception {
        executeAntigo();
        executeNovo();
    }

    private static void executeAntigo() throws Exception {
        Titan titan = new Titan();
        Kawasaki kawasaki = new Kawasaki();

        System.out.println("Titan: ");
        titan.acelerar();
        titan.frear();
        System.out.println("");

        System.out.println("Kawasaki: ");
        kawasaki.acelerar();
        System.out.println("");
        kawasaki.frear();
        System.out.println("");
        kawasaki.ligarModoEsportivo();
        System.out.println("");
    }

    private static void executeNovo() {
        TitanRefatorado titan = new TitanRefatorado();
        KawasakiRefatorado kawasaki = new KawasakiRefatorado();

       System.out.println("Titan: ");
        titan.acelerar();
        titan.frear();
        System.out.println("");

        System.out.println("Kawasaki: ");
        kawasaki.acelerar();
        kawasaki.frear();
        System.out.println("");
        kawasaki.ligarModoEsportivo();
    }

    public static void main(String[] args) throws Exception {
        Main.execute();
    }
}
