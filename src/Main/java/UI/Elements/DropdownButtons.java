package UI.Elements;

import javafx.scene.Scene;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DropdownButtons {


        Menu menuDropdown = new Menu("Menu");

        CustomMenuButton menuHomeButton = new CustomMenuButton("Home");
        CustomMenuItem customMenuItem = new CustomMenuItem();
        customMenuItem.setContent(menuHomeButton);
        customMenuItem.setHideOnClick(false);
        menuDropdown.getItems().add(customMenuItem);

        CustomMenuButton menuCustomersButton = new CustomMenuButton("Customers");
        CustomMenuItem customMenuItem2 = new CustomMenuItem();
        customMenuItem2.setContent(menuCustomersButton);
        customMenuItem2.setHideOnClick(false);
        menuDropdown.getItems().add(customMenuItem2);

        CustomMenuButton menuContactsButton = new CustomMenuButton("Contacts");
        CustomMenuItem customMenuItem3 = new CustomMenuItem();
        customMenuItem3.setContent(menuContactsButton);
        customMenuItem3.setHideOnClick(false);
        menuDropdown.getItems().add(customMenuItem3);

        CustomMenuButton menuEventsButton = new CustomMenuButton("Events");
        CustomMenuItem customMenuItem4 = new CustomMenuItem();
        customMenuItem4.setContent(menuEventsButton);
        customMenuItem4.setHideOnClick(false);
        menuDropdown.getItems().add(customMenuItem4);

        CustomMenuButton menuTasksButton = new CustomMenuButton("Tasks");
        CustomMenuItem customMenuItem5 = new CustomMenuItem();
        customMenuItem5.setContent(menuTasksButton);
        customMenuItem5.setHideOnClick(false);
        menuDropdown.getItems().add(customMenuItem5);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menuDropdown);


        ////////

        Menu createDropdownMenu = new Menu("Create");

        CustomMenuButton createCustomersButton = new CustomMenuButton("Customers");
        CustomMenuItem createMenuItem = new CustomMenuItem();
        createMenuItem.setContent(createCustomersButton);
        createMenuItem.setHideOnClick(false);
        createDropdownMenu.getItems().add(createMenuItem);

        CustomMenuButton createEventsButton = new CustomMenuButton("Events");
        CustomMenuItem createMenuItem2 = new CustomMenuItem();
        createMenuItem2.setContent(createEventsButton);
        createMenuItem2.setHideOnClick(false);
        createDropdownMenu.getItems().add(createMenuItem2);

        CustomMenuButton createTasksButton = new CustomMenuButton("Tasks");
        CustomMenuItem createMenuItem3 = new CustomMenuItem();
        createMenuItem3.setContent(createTasksButton);
        createMenuItem3.setHideOnClick(false);
        createDropdownMenu.getItems().add(createMenuItem3);

        MenuBar createBar = new MenuBar();
        createBar.getMenus().add(createDropdownMenu);

        menuTaskBar.getChildren().addAll(menuBar, createBar);
        Scene scene = new Scene(menuTaskBar, width, height);
        return scene;
    }
}