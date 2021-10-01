import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.io.IOException;
/**
 * A user interface that allows for displaying and modifying information
 */
public class GUI extends Application
{
    /**
     * @param window The Stage object that will be displayed
     */
    public void start(Stage window) throws IOException
    {
        window.setTitle("Colour IT");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GUI.fxml"));
        Scene scene = new Scene (loader.load());
        window.setScene(scene);
        window.show();
    }
}
