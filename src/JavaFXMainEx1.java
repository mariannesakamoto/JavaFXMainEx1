import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFXMainEx1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Criando um retângulo
        Rectangle rect = new Rectangle(20, 20, 100, 200);
        
        // Configurando a cor de preenchimento para azul
        rect.setFill(Color.BLUE);
        
        // Configurando a cor da borda para preto
        rect.setStroke(Color.BLACK);
        
        // Configurando a largura da borda
        rect.setStrokeWidth(2.0);
        
        // Criando um grupo e adicionando o retângulo a ele
        Group root = new Group();
        root.getChildren().add(rect);
        
        // Criando a cena
        Scene scene = new Scene(root, 300, 300);
        
        // Configurando o palco e exibindo a cena
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exemplo de Retângulo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}