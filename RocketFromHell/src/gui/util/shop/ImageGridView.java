package gui.util.shop;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wareus on 2016-03-02.
 */
public class ImageGridView extends GridPane
{
    private int cols = 4;
    private List<ImageView> images = new ArrayList<>();

    public void add(ImageView imageView)
    {
        images.add(imageView);

        int col = (images.size() -1) % cols;
        int row = (images.size()- 1) / cols;

        add(imageView, col, row);
    }
}
