package minesweeper.view;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
//import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import minesweeper.domain.Cell;
import minesweeper.domain.CellType;
import minesweeper.domain.Row;
import minesweeper.service.GridService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.vaadin.alump.labelbutton.LabelButton;

//import java.awt.*;
import java.util.Collection;

@Route
public class MainView extends VerticalLayout {

    Grid<Row> grid;

    GridService gridService;

   // GridLayout gridLayout;



    public MainView(GridService gridService) {

        this.gridService = gridService;

        /*grid.asSingleSelect().addValueChangeListener(e -> {
            editor.editEmployee(e.getValue());
        });*/

        grid = new Grid<>(Row.class);

// Sets items using vararg beans
        /*grid.setItems(
                new Person("George Washington", 1732),
                new Person("John Adams", 1735),
                new Person("Thomas Jefferson", 1743),
                new Person("James Madison", 1751)
        );*/

       // gridLayout = new GridLayout(3, 3);
        this.gridService.createGrid();

        VerticalLayout labelLayout = new VerticalLayout();

        for (int i = 0; i < 3; i++) {

            HorizontalLayout horizontalLayout = new HorizontalLayout();

            Row row = this.gridService.getRow(i);

            for (int j = 0; j < 3; j++) {

                Cell cell = row.getCell(j);

                Button textField = new Button();
                if (cell.getType() == CellType.NUMBER)
                    textField.setText(String.valueOf(cell.getNumber()));
                else if (cell.getType() == CellType.BOMB)
                    textField.setText("Bomb");
                textField.setId(String.valueOf(i + j));

                textField.addClickListener(e -> e.getClientX())
                //textField.addLabelClickListener(e -> );
                //gridLayout.addLayoutComponent("label", label);
                horizontalLayout.add(textField);
              //  labelLayout.addClickListener(e -> {
               //     e
               // });

            }

            labelLayout.add(horizontalLayout);
            //labelLayout.add(horizontalLayout);
        }

        add(new Text("Welcome to MainView."));
        add(labelLayout);


    }

}
