package boardgame;

public class Position {

    // Atributos da Classe:
    private int row;
    private int column;

    // Método Construtor:
    public Position(int row, int column){
        this.row = row;
        this.column = column;

    }

    // Métodos Get & Set:

    public Integer getRow(){
        return this.row;
    }

    public void  setRow(int row){
        this.row = row;
    }

    public Integer getColumn(){
        return this.column;
    }

    public void  setColumn(int column){
        this.column = column;
    }

    // Outros Métodos:

    @Override
    public String toString(){
        return row + ", " + column;
    }
}
