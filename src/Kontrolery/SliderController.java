package Kontrolery;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;

/**
 * Slider window controller.
 *
 * @author Kamil Parzych
 * @since 10/wrz/2018
 */
public class SliderController {

    @FXML
    private Slider slider;

    private MainContr mainContr;


    public void setMainContr(MainContr mainContr) {
        this.mainContr = mainContr;
    }
}
