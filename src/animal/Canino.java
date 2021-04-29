/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricas
 */
public class Canino extends Mamifero {

    private String colmillos;

    public Canino(String colmillos, String beben, String nacen, String tamaño, String color) {
        super(beben, nacen, tamaño, color);
        this.colmillos = colmillos;
    }
}
