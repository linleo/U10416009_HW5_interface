import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import java.util.Arrays;

public class BeanMachine extends Application 
{
  @Override
	public void start(Stage primaryStage) 
	{
		Circle nail1 = new Circle(8, Color.BLUE);
		nail1.relocate(190, 70);
		
		Circle nail2 = new Circle(8, Color.BLUE);
		nail2.relocate(170, 110);
		Circle nail3 = new Circle(8, Color.BLUE);
		nail3.relocate(210, 110);
		
		Circle nail4 = new Circle(8, Color.BLUE);
		nail4.relocate(150, 150);
		Circle nail5 = new Circle(8, Color.BLUE);
		nail5.relocate(190, 150);
		Circle nail6 = new Circle(8, Color.BLUE);
		nail6.relocate(230, 150);
		
		Circle nail7 = new Circle(8, Color.BLUE);
		nail7.relocate(130, 190);
		Circle nail8 = new Circle(8, Color.BLUE);
		nail8.relocate(170, 190);
		Circle nail9 = new Circle(8, Color.BLUE);
		nail9.relocate(210, 190);
		Circle nail10 = new Circle(8, Color.BLUE);
		nail10.relocate(250, 190);
		
		Circle nail11 = new Circle(8, Color.BLUE);
		nail11.relocate(110, 230);
		Circle nail12 = new Circle(8, Color.BLUE);
		nail12.relocate(150, 230);
		Circle nail13 = new Circle(8, Color.BLUE);
		nail13.relocate(190, 230);
		Circle nail14 = new Circle(8, Color.BLUE);
		nail14.relocate(230, 230);
		Circle nail15 = new Circle(8, Color.BLUE);
		nail15.relocate(270, 230);

		Circle nail16 = new Circle(8, Color.BLUE);
		nail16.relocate(90, 270);
		Circle nail17 = new Circle(8, Color.BLUE);
		nail17.relocate(130, 270);
		Circle nail18 = new Circle(8, Color.BLUE);
		nail18.relocate(170, 270);
		Circle nail19 = new Circle(8, Color.BLUE);
		nail19.relocate(210, 270);
		Circle nail20 = new Circle(8, Color.BLUE);
		nail20.relocate(250, 270);
		Circle nail21 = new Circle(8, Color.BLUE);
		nail21.relocate(290, 270);

		Circle nail22 = new Circle(8, Color.BLUE);
		nail22.relocate(70, 310);
		Circle nail23 = new Circle(8, Color.BLUE);
		nail23.relocate(110, 310);
		Circle nail24 = new Circle(8, Color.BLUE);
		nail24.relocate(150, 310);
		Circle nail25 = new Circle(8, Color.BLUE);
		nail25.relocate(190, 310);
		Circle nail26 = new Circle(8, Color.BLUE);
		nail26.relocate(230, 310);
		Circle nail27 = new Circle(8, Color.BLUE);
		nail27.relocate(270, 310);
		Circle nail28 = new Circle(8, Color.BLUE);
		nail28.relocate(310, 310);
		pane.getChildren().addAll(nail1, 
		
              							nail2, nail3,
              							
              						nail4, nail5, nail6, 
              						
              					nail7, nail8, nail9, nail10,
              					
              				nail11, nail12, nail13, nail14, nail15,
              				
              			nail16, nail17, nail18, nail19, nail20, nail21,
              			
              		nail22, nail23, nail24, nail25, nail26, nail27, nail28);
  
  	Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Bean Machine");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false); 
		primaryStage.show();
	}
}

              		
