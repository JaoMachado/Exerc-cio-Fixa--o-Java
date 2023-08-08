package entidades;
public class Mouse {
    int posicaoX;
    int posicaoY;
    String cor;

    void clicar(){
        String mensagem = "Clique: " + converteParaTexto();
        System.out.println(mensagem);
    }

    void mover(int deltaX, int deltaY){
        posicaoX += deltaX;
        posicaoY += deltaY;
    }

    String converteParaTexto(){
        return "[ Mouse @ (" + posicaoX + ", " + posicaoY + ") ]";
    }
}
