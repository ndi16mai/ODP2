package documents.elements.html;

import documents.elements.BulletList;

import java.util.List;

/**
 * Created by Selma on 2016-02-09.
 */
public class HTMLBulletList extends BulletList {


    public HTMLBulletList(List<String> list) {
        super(list);
    }

    @Override
    public String getText()
    {
        String temp = "<ul>";
        for (String element : list){
            temp += "<li>" + element + "</li>";
        }

        return temp + "</ul>";
    }
}
