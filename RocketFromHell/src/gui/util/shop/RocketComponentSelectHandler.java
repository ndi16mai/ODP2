package gui.util.shop;


public class RocketComponentSelectHandler {
	
	private RocketComponentView selectedComponentView;
	
	public void select(RocketComponentView componentView)
	{
		if(selectedComponentView != null)
			selectedComponentView.deselect();
		componentView.select();
		selectedComponentView = componentView;
	}
}
