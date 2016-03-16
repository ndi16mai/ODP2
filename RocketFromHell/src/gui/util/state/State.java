package gui.util.state;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public enum State {
	
	SHOP((scene)->{
//		scene.setRoot(FXMLLoader.load(getClass().getResource("garage/garage.fxml")));
	});
	
	
	private StateProvider provider;

	private State(StateProvider provider) {
		this.provider = provider;
	}


	private interface StateProvider
	{
		void updateScene(Scene scene);
	}

	public void updateScene(Scene scene)
	{
		provider.updateScene(scene);
	}
}
