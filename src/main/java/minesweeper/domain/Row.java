package minesweeper.domain;

import java.util.ArrayList;
import java.util.List;

public class Row {

    List<Cell> cells = new ArrayList<>();

    void addCell(Cell cell) {

        cells.add(cell);

    }

    public Cell getCell(int index) {
       return cells.get(index);
    }
}
