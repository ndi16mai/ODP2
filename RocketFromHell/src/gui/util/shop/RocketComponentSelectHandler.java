package gui.util.shop;

import rocket.RocketComponent;

public class RocketComponentSelectHandler<T extends RocketComponent> {
	
	private RocketComponentView<T> selectedComponentView;
	private ComponentSelectListener<T> listener;
	
	public void select(RocketComponentView<T> componentView)
	{
		if(selectedComponentView != null)
			selectedComponentView.deselect();
		componentView.select();
		
		if(listener != null)
			listener.select(componentView.getComponent(), componentView.equals(selectedComponentView));
		selectedComponentView = componentView;
	}

	public void setListener(ComponentSelectListener<T> listener) {
		this.listener = listener;
	}
	
	
	
	
}
