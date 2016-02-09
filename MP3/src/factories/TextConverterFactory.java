package factories;

import converters.ToHTMLConverter;
import converters.ToLaTeXConverter;

/**
 * Created by Selma on 2016-02-09.
 */
public class TextConverterFactory {

    public ToHTMLConverter createHTMLConverter()
    {
        return new ToHTMLConverter();
    }

    public ToLaTeXConverter createLaTeXConverter()
    {
        return new ToLaTeXConverter();
    }
}
