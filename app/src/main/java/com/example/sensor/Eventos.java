package com.example.sensor;

public class Eventos {
    Integer id;
    Float values[]=new Float[3];

    public Eventos(){

    }

    public Eventos(Integer id, Float[] values) {
        this.id = id;
        this.values = values;
    }
}
