package org.acme.rest.json;

import java.util.Objects;

public class Game {

    public String name;
    public String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Game() {
    }

    public Game(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
