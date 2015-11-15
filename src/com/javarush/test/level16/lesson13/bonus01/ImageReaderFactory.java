package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

import java.util.HashMap;

/**
 * Created by admin on 18.10.2015.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes type) {
        HashMap<ImageTypes, ImageReader> readers = new HashMap<ImageTypes, ImageReader>() {{
            put(ImageTypes.BMP, new BmpReader());
            put(ImageTypes.JPG, new JpgReader());
            put(ImageTypes.PNG, new PngReader());
        }};

        if (readers.containsKey(type))
            return readers.get(type);
        else throw  new IllegalArgumentException("Неизвестный тип картинки");
    }
}
