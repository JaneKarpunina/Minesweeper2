package minesweeper.domain;

public class Cell {

    public Cell(int number, CellType type) {
        this.number = number;
        this.type = type;
    }

    CellType type;

    int number;

    public CellType getType() {
        return type;
    }

    public void setType(CellType type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
