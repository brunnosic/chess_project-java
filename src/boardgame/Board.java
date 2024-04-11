package boardgame;

public class Board {

        // Atributos da Classe:
        private int rows;
        private int columns;
        private Piece[][] pieces;

        // Método Construtor:
        public Board(int rows, int columns){
            this.rows = rows;
            this.columns = columns;
            pieces = new Piece[rows][columns];
        }


        // Metodos Get & Set:

        public int getRows(){
            return rows;
        }

        public void setRows(int rows){
            this.rows = rows;
        }

        public int getColumns(){
            return columns;
        }

        public void setColums(int columns){
            this.columns = columns;
        }


        // Outros Métodos:

}
