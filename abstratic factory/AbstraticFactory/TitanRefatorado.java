package AbstraticFactory;

public class TitanRefatorado implements MotoComModoEsportivo {
   
    public void ligarModoEsportivo() {
        System.out.println("Ligando Modo Esportivo");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("Freando!");
    }

    @Override
    public void ligarModoEspotivo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligarModoEspotivo'");
    }
}
