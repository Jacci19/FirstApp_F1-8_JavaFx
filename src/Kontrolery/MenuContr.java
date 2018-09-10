package Kontrolery;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuContr {

    private MainContr mainContr;



    @FXML
    public void onAppBtnAction() throws IOException {
        System.out.println("Wciśnięto AppBtn");
        FXMLLoader appLoader = new FXMLLoader(this.getClass().getResource("/FXML/AppScreen.fxml"));
        Pane appPane = appLoader.load();

        AppContr appContr = appLoader.getController();
        appContr.setMainContr(mainContr);
        mainContr.setScreen(appPane);
    }

    @FXML
    public void onOptBtnAction(){
        System.out.println("Wciśnięto OptBtn");
        FXMLLoader optLoader = new FXMLLoader(this.getClass().getResource("/FXML/OptionsScreen.fxml"));
        Pane optPane = null;
        try {                                                               //można zrobić też sposobem jak w metodzie onAppBtnAction (z throws IOException)
            optPane = optLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        OptionsContr optionsContr = optLoader.getController();
        optionsContr.setMainContr(mainContr);
        mainContr.setScreen(optPane);

    }
    @FXML
    public void onExitBtnAction(){
        System.out.println("Wciśnięto ExitBtn");
        Platform.exit();
    }

    @FXML
    public void onSliderBtn() throws IOException {
        System.out.println("sliderBtn pressed");
        FXMLLoader optLoader = new FXMLLoader(this.getClass().getResource("/FXML/slider.fxml"));
        AnchorPane anchorPane = null;
        try {
            anchorPane = optLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SliderController sliderController = optLoader.getController();
        sliderController.setMainContr(mainContr);
        mainContr.setScreen(anchorPane);
    }

    public void setMainContr(MainContr mainContr) {
        this.mainContr = mainContr;
    }
}
