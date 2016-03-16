package gui.util.state;

import javafx.scene.Parent;

public enum State {
	
	SHOP(()->{
		return null;
	});
	
	
	private StateProvider provider;
	
	
	
	
	private State(StateProvider provider) {
		this.provider = provider;
	}




	private interface StateProvider
	{
		Parent get();
	}
}
