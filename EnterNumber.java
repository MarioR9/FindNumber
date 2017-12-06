import javafx.application.Application;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class EnterNumber extends Application{

    public void start (Stage primaryStage) {

            primaryStage.setTitle("Number Finder");
            GridPane grid = new GridPane();
            grid.setAlignment(Pos.CENTER);
            grid.setHgap(10);
            grid.setVgap(10);
            grid.setPadding(new Insets(25,25,25,25));
            Scene scene = new Scene(grid, 300,275);

            Text scenetitle = new Text("Enter Number");
            scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
            grid.add(scenetitle, 0,0,2,1);
            Label EnterNumber = new Label("Here--->");
            grid.add(EnterNumber,0,1);

            TextField userTextField = new TextField();
            grid.add(userTextField, 1, 1);

            Button btn = new Button("ENTER");
            HBox hbBtn = new HBox(10);
            hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtn.getChildren().add(btn);
            grid.add(hbBtn, 1, 2);

            primaryStage.setScene(scene);
            primaryStage.show();
            




        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                int n = Integer.parseInt(userTextField.getText());



                FibonacciNumbers.Fibonacci(n);
                System.out.println("Fibinacci Numbers "+"\n");


                OddNumbers.OddNumbers(n);
                System.out.println("Odd Numbers Numbers "+"\n");


                Factorial.factoria(n);
                System.out.println("Factorial Numbers "+"\n");


            }
        });










    }
}
