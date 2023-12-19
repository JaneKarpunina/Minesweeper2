package minesweeper.service;

import minesweeper.domain.Grid;
import minesweeper.domain.Row;
import org.springframework.stereotype.Service;

@Service
public class GridService {

    private Grid grid = new Grid();

    public void createGrid() {

        grid.createRow(3);
        grid.createRow(3);
        grid.createRow(3);

    }

    public Row getRow(int index) {
        return grid.getRow(index);
    }
}
