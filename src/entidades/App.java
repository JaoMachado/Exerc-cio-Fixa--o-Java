package entidades;
public class App {
    public static void main(String[] args) throws Exception {
        Monitor monitor = new Monitor();
        monitor.polegadas = 12;
        monitor.frequenciaEmHertz = 40;

        Mouse mouse = new Mouse();
        mouse.cor = "Flicts";
        mouse.posicaoX = 0;
        mouse.posicaoY = 0;

        Computador pc = new Computador();
        pc.adicionar(mouse, monitor);
        pc.iniciar();
    }
}
