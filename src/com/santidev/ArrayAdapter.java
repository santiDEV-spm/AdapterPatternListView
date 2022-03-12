package com.santidev;

public class ArrayAdapter implements Adapter{

    private String[] data;

    public ArrayAdapter(String[] data){
        this.data = data;
    }

    @Override
    public String[] createUI() {
        return this.data;
    }
}
