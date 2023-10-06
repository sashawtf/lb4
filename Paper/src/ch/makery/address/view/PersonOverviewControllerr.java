package ch.makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ch.makery.address.MainApp;
import ch.makery.address.model.Person;

public class PersonOverviewControllerr {
    @FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person, String> instrumentColumn;
    @FXML
    private TableColumn<Person, String> actiaColumn;

    @FXML
    private Label instrumentLabel;
    @FXML
    private Label actiaLabel;
    @FXML
    private Label obligationLabel;
    @FXML
    private Label tikerLabel;


    // Ссылка на главное приложение.
    private MainApp mainApp;

    /**
     * Конструктор.
     * Конструктор вызывается раньше метода initialize().
     */
    public PersonOverviewControllerr() {
    }

    /**
     * Инициализация класса-контроллера. Этот метод вызывается автоматически
     * после того, как fxml-файл будет загружен.
     */
    @FXML
    private void initialize() {
    	// Инициализация таблицы адресатов с двумя столбцами.
    	instrumentColumn.setCellValueFactory(cellData -> cellData.getValue().instumentProperty());
    	actiaColumn.setCellValueFactory(cellData -> cellData.getValue().actiaProperty());
    }

    /**
     * Вызывается главным приложением, которое даёт на себя ссылку.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Добавление в таблицу данных из наблюдаемого списка
        personTable.setItems(mainApp.getPersonData());
    }
}
