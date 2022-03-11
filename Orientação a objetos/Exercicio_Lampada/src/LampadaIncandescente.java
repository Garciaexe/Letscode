public class LampadaIncandescente implements ILampada {
    @Override
    public void liga(){
        System.out.println("Estou ligando");
    }
    @Override
    public void desliga(){
        System.out.println("Estou desligando");
    }
}
