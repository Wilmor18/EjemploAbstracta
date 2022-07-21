package ejecutable;

import modelo.Animal;
import modelo.Gato;
import modelo.Perro;

public class TestAnimal {
    public static void main(String[] args) {

        Animal p = new Perro();

        p.setNombre("TOBI");
        p.comer();
        p.caminar();
        p.cagar();

        System.out.println("-------------");

        Animal g = new Gato();

        g.setNombre("ZOE");
        g.comer();
        g.caminar();
        g.cagar();

    }
}