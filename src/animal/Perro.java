/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricas
 */
public class Perro extends Canino {

    private final String raza;

    public  Perro(String raza, String colmillos, String beben, String nacen, String tamaño, String color) {
        super(colmillos, beben, nacen, tamaño, color);
        this.raza = raza;
    }

}
