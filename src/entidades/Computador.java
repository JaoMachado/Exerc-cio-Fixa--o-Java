package entidades;

public class Computador {
    Monitor monitor;
    Mouse mouse;

    void iniciar(){
        monitor.ligar();
        mouse.mover(10, 10);
    }

    void adicionar(Mouse _mouse, Monitor _monitor){
        mouse = _mouse;
        monitor = _monitor;
    }
}
