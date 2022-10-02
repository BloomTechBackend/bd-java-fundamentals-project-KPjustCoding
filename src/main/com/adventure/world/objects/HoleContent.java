package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {

    private Key content;
    private boolean isCovered = true;

    public HoleContent(Key key){
        this.content = key;
    }

    public void setIsCovered(boolean isCovered){

    }

    public boolean isCovered(){
        return this.isCovered();
    }

    public Key getKey() {
        return this.content;
    }
}