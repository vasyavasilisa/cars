package framework.services;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;



public class CommonFunctions {



    public Properties readProperties(String path){
        File ff = new File(getClass().getClassLoader().getResource(path).getFile());
        FileInputStream fis= null;
        Properties property = new Properties();
        try {
            fis = new FileInputStream(ff);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            property.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return property;
    }






}
