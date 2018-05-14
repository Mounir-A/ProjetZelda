//Test GitHub//

import java.io.File;
import java.io.IOException;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main extends Application{
	

	
	
	public static void main(String[] args) throws IOException {
		launch(args);
		
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		Map mapLogique = new Map("src/map.txt");
		mapLogique.initMapLogique();
		int[][] map = mapLogique.getMapLogique();
		AnchorPane panel = new AnchorPane();
		Scene scene = new Scene(panel,192,320);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		

		 
		//parcourir le tableau
		TilePane panelTerrain = new TilePane();
		panelTerrain.setPrefColumns(6);
		panelTerrain.setPrefRows(10);

		
		for ( int x = 0 ; x < map.length ; x++ ) {
			for ( int y = 0 ; y < map[x].length ; y ++) {
				if (map[x][y]==2){
					
					//ouvre une image terre
				
					File f=new File("src/img/herbe2.png");
					Image herbe = new Image(f.toURI().toString(),32,32,false,false);
					ImageView viewHerbe = new ImageView();
					viewHerbe.setImage(herbe);
					panelTerrain.getChildren().add(viewHerbe);
					
				}
				else if(map[x][y]==3){
					File g=new File("src/img/chemin.png");
					Image chemin = new Image(g.toURI().toString(),32,32,false,false);
					ImageView viewchemin = new ImageView();
					viewchemin.setImage(chemin);
					panelTerrain.getChildren().add(viewchemin);
				}
				else if(map[x][y]==1){
					File h=new File("src/img/hautes_herbes.png");
					Image hautes_herbes = new Image(h.toURI().toString(),32,32,false,false);
					ImageView viewhautes_herbes = new ImageView();
					viewhautes_herbes.setImage(hautes_herbes);
					panelTerrain.getChildren().add(viewhautes_herbes);
				}
				
				
			}
		}
			
		 // AJOUT DE TOUT LES ELEMENTS AU PANEL
		 
		panel.getChildren().addAll(panelTerrain);

			

			
		
			
			
			
			
			

			

		}

	}


