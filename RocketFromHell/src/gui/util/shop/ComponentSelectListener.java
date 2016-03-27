package gui.util.shop;

import rocket.RocketComponent;

public interface ComponentSelectListener<T extends RocketComponent> {
	void select(T component, boolean isSelected);
}
