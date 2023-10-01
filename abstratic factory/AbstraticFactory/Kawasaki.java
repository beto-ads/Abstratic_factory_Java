package AbstraticFactory;

public class Kawasaki implements Moto{
    @Override
    public void acelerar() {
        System.out.println("Acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("Freando!");
    }

    @Override
    public void ligarModoEsportivo() {
        System.out.println("Modo Esportivo ligado");;
    }
}
