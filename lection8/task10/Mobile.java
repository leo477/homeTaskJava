package com.itea.dimka.lection8.task10;

import java.util.ArrayList;

public class Mobile {
    public Mobile() {
        models.add(new Model("Nokia"));
    }

    public void printRes(){
        for(Model model : models){
            System.out.println(model.name);
            for (Model.Property property : model.getProperties()){
                System.out.println(property.name + " " + property.prop);
            }
        }
    }

    private static ArrayList<Model> models = new ArrayList<>();
    private class Model{
        private String name;

        public ArrayList<Property> getProperties() {
            return properties;
        }

        private ArrayList<Property> properties = new ArrayList<>();
        public Model(String name) {
            this.name = name;
            properties.add(new Property("Camera","2MP"));
            properties.add(new Property("Internet","3G"));
            properties.add(new Property("Sim","Micro-SIM"));
        }



        private class Property{
            private String name;
            private String prop;

            public Property(String name, String prop) {
                this.name = name;
                this.prop = prop;
            }
        }
    }


}


