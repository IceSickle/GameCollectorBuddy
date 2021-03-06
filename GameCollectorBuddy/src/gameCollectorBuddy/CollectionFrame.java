package gameCollectorBuddy;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CollectionFrame extends Application implements Serializable
{
	static Collection myCollection = new Collection();
	
	@Override
	public void start(Stage primaryStage) 
	{
		try 
		{
			
			Image temp = new Image(getClass().getResourceAsStream("6489.jpg"));
			Game g1 = new Game(1, "Zelda", "NES", "http://videogames.pricecharting.com/game/nes/legend-of-zelda", "Loose", "UPC 74674738738", "09-01-2001", "E", temp, "Free Poster!", new BigDecimal("9.99"), new BigDecimal("20.00"), 10, 1, true, LocalDate.now());
			GameSystem NES = new GameSystem("NES");
			NES.addGame(g1);
			
			BorderPane root = new BorderPane();
			FlowPane centerRoot = new FlowPane();
			FlowPane topRoot = new FlowPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			DatePicker datePicker = new DatePicker();
			Button btn = new Button("", new ImageView(temp));
			TextField text = new TextField();
			btn.setOnAction(new EventHandler<ActionEvent>()
			{
				@Override public void handle(ActionEvent e)
				{
					NES.printGames();
					LocalDate date = datePicker.getValue();
					System.out.println(date);
					myCollection.findGame(text.getText().trim().replace(" ", "_"));
					save();
				}
			});
			/*
			btn.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				            btn.;
				        }
				});*/
			
			/*
			Button btn1 = new Button("", new ImageView(temp));
			Button btn2 = new Button("", new ImageView(temp));
			Button btn3 = new Button("", new ImageView(temp));
			Button btn4 = new Button("", new ImageView(temp));
			Button btn5 = new Button("", new ImageView(temp));
			*/
			Label top = new Label("This is the top");
			centerRoot.getChildren().add(text);
			centerRoot.getChildren().add(btn);
			centerRoot.getChildren().add(datePicker);
			/*
			centerRoot.getChildren().add(btn1);
			centerRoot.getChildren().add(btn2);
			centerRoot.getChildren().add(btn3);
			centerRoot.getChildren().add(btn4);
			centerRoot.getChildren().add(btn5);
			*/
			
			topRoot.getChildren().add(top);
			root.setTop(topRoot);
			root.setCenter(centerRoot);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		load();
		launch(args);
	}
	
	public static void load()
	{
		try 
		{
	        InputStream file = new FileInputStream("Collection.ser");
	        InputStream buffer = new BufferedInputStream(file);
	        ObjectInput input = new ObjectInputStream (buffer);
			myCollection = (Collection) input.readObject();
		} 
		catch (IOException | ClassNotFoundException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void save()
	{
		try
		{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Collection.ser"));
			out.writeObject(myCollection);
			out.close();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
