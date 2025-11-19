import View.ContatosViewFX;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        new ContatosViewFX().start(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}
