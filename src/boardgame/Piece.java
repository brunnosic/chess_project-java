package boardgame;

public class Piece {

    // Atributos da Classe:
    protected Position position;
    private Board board;


    // Método Construtor:
    public Piece(Board board){
        this.board = board;
        position = null;
    }

    // Metodos Get & Set:

    // Somente classes dentro do mesmo pacote e subclasses podem acessar esse método:
    protected Board getBoard(){
        return board;
    }


    // Outros Métodos:
}
