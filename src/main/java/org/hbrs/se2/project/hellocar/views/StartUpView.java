package org.hbrs.se2.project.hellocar.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.HeaderRow;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.apache.commons.lang3.StringUtils;
import org.hbrs.se2.project.hellocar.control.ManageUnternehmenControl;
import org.hbrs.se2.project.hellocar.dtos.CarDTO;
import org.hbrs.se2.project.hellocar.dtos.UnternehmenDTO;
import org.hbrs.se2.project.hellocar.util.Globals;

import java.util.List;

@Route(value = Globals.Pages.START_UPS, layout = AppView.class)
@PageTitle("StartUps")
public class StartUpView extends Div {

    private List<UnternehmenDTO> unternehmenList;

    public StartUpView(ManageUnternehmenControl startUpControl) {
        this.unternehmenList = startUpControl.readAllUnternehmen();
        add(createTitle());
        add(createGridTable());
    }

    private Component createTitle() {
        return new H3("Search for StartUP");
    }

    private Component createGridTable() {
        Grid<UnternehmenDTO> grid = new Grid<>();
        ListDataProvider<UnternehmenDTO> dataProvider = new ListDataProvider<>(unternehmenList);
        grid.setDataProvider(dataProvider);

        Grid.Column<UnternehmenDTO> nameColumn = grid
                .addColumn(UnternehmenDTO::getStartupName)
                .setHeader("Name");

        Grid.Column<UnternehmenDTO> beschreibungColumn = grid
                .addColumn(UnternehmenDTO::getBeschreibung)
                .setHeader("Beschreibung");

        Grid.Column<UnternehmenDTO> jahrColumn = grid
                .addColumn(UnternehmenDTO::getGruendungsjahr)
                .setHeader("Gründungsjahr");

        Grid.Column<UnternehmenDTO> standortColumn = grid
                .addColumn(UnternehmenDTO::getStandort)
                .setHeader("Standort");

        Grid.Column<UnternehmenDTO> idColumn = grid
                .addColumn(UnternehmenDTO::getId)
                .setHeader("ID");

        HeaderRow filterRow = grid.appendHeaderRow();

        // Filter: Name
        TextField nameField = new TextField();
        nameField.setValueChangeMode(ValueChangeMode.EAGER);
        nameField.setPlaceholder("Filter");
        nameField.setSizeFull();
        nameField.addValueChangeListener(event ->
                dataProvider.setFilter(startUp ->
                        StringUtils.containsIgnoreCase(startUp.getStartupName(), nameField.getValue()))
        );
        filterRow.getCell(nameColumn).setComponent(nameField);

        // Filter: Beschreibung
        TextField beschreibungField = new TextField();
        beschreibungField.setValueChangeMode(ValueChangeMode.EAGER);
        beschreibungField.setPlaceholder("Filter");
        beschreibungField.setSizeFull();
        beschreibungField.addValueChangeListener(event ->
                dataProvider.setFilter(startUp ->
                        StringUtils.containsIgnoreCase(startUp.getBeschreibung(), beschreibungField.getValue()))
        );
        filterRow.getCell(beschreibungColumn).setComponent(beschreibungField);

        return grid;
    }
}