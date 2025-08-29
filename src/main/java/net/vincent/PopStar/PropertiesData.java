package net.vincent.PopStar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesData {

    String path = System.getProperty("user.dir") + "/game.properties";

    PopStarFrame popStarFrame;

    public PropertiesData(PopStarFrame popStarFrame){

        this.popStarFrame = popStarFrame;

    }

    public void load(){

        try(FileInputStream input = new FileInputStream(path)){

            Properties properties = new Properties();

            properties.load(input);

            popStarFrame.recordScoreInt = Integer.parseInt(properties.getProperty("record"));
            popStarFrame.targetScoreInt = Integer.parseInt(properties.getProperty("target"));
            popStarFrame.currentScoreInt = Integer.parseInt(properties.getProperty("current"));
            popStarFrame.stageInt = Integer.parseInt(properties.getProperty("stage"));

            popStarFrame.setScoreBoardText();

        }catch(FileNotFoundException e){

            create();

        }catch(IOException e){

            e.printStackTrace();

        }

    }

    public void save(){

        try(FileOutputStream output = new FileOutputStream(path)){

            Properties properties = new Properties();

            properties.setProperty("record", Integer.toString(popStarFrame.recordScoreInt));
            properties.setProperty("target", Integer.toString(popStarFrame.targetScoreInt));
            properties.setProperty("current", Integer.toString(popStarFrame.currentScoreInt));
            properties.setProperty("stage", Integer.toString(popStarFrame.stageInt));

            properties.store(output, "properties for game");

        }catch (FileNotFoundException e){

            create();

        }catch(IOException e){

            e.printStackTrace();

        }

    }

    public void create(){

        try(FileOutputStream output = new FileOutputStream(path)){

            Properties properties = new Properties();

            properties.setProperty("record", Integer.toString(popStarFrame.recordScoreInt));
            properties.setProperty("target", Integer.toString(popStarFrame.targetScoreInt));
            properties.setProperty("current", Integer.toString(popStarFrame.targetScoreInt));
            properties.setProperty("stage", Integer.toString(popStarFrame.stageInt));

            properties.store(output, "Properties file for Pop Star Game");

            load();

        }catch(IOException e){

            e.printStackTrace();

        }

    }

    public void clear(){

        try(FileOutputStream output = new FileOutputStream(path)){

            Properties properties = new Properties();

            properties.setProperty("record", "0");
            properties.setProperty("target", "0");
            properties.setProperty("current", "0");
            properties.setProperty("stage", "0");

            properties.store(output, "Properties file for Pop Star Game");

            load();

        }catch(FileNotFoundException e){

            create();

        }catch(IOException e){

            e.printStackTrace();

        }

    }

}
