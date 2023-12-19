package minesweeper.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class Grid {

    private List<Row> rows = new ArrayList<>();

    public void createRow(int n) {

        Row row = new Row();
        row.addCell(new Cell(1, CellType.NUMBER));
        row.addCell(new Cell(0, CellType.BOMB));
        row.addCell(new Cell(0, CellType.EMPTY));
        rows.add(row);
    }

    public Row getRow(int index) {
      return rows.get(index);
    }
}
