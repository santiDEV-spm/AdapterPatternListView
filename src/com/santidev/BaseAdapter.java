package com.santidev;

//adapatador para imagenes
public class BaseAdapter implements Adapter{

    private String[] data;

    public BaseAdapter(String[] data){
        this.data = data;
    }

    @Override
    public String[] createUI() {
        for(int i = 0; i < this.data.length; i++){
            data[i] = "Image:" + data[i];
        }
        return this.data;
    }
}
