package com.santidev;

public class Main {

    public static void main(String[] args) {
	    String[] data = {
                "Happy Strong Family",
                "Easy Learning Java",
                "Easy Learning Python 3",
                "Easy Learning HTML CSS",
                "Easy Learning JavaScript"
        };

        ListView listView = new ListView();
        listView.setAdapter( new ArrayAdapter(data));
        listView.show();
        System.out.println("-------------------------------------------");

        listView.setAdapter( new BaseAdapter(data));
        listView.show();
    }
}
