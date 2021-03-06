import lombok.Data;

/**
 * Created by Eric on 16/6/30.
 */
@Data
public class Cell {
    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
    }

    private int col;
    private int row;
    private int pieceNumber = 0;

    public Cell(Cell other) {
        this.col = other.col;
        this.row = other.row;
        this.pieceNumber = other.pieceNumber;
    }
}
