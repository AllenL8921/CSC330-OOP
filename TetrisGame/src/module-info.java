module TetrisGame {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.desktop;
	requires java.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
