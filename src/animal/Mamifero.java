/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricas
 */
public class Mamifero extends Animales {

    private String beben;

    public Mamifero(String beben, String nacen, String tamaño, String color) {
        super(nacen, tamaño, color);
        this.beben = beben;
    }

    public String getBeben() {
        return beben;
    }

    public void setBeben(String beben) {
        this.beben = beben;
    }

}
