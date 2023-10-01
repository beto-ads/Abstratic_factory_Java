package AbstraticFactory;

public class Titan implements Moto{
    @Override
    public void acelerar() {
        System.out.println("Acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("Freando!");
    }

    @Override
    public void ligarModoEsportivo() throws Exception {
        throw new Exception("Metodo não implementado!");
    }
}
