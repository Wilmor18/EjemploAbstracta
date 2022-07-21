
package modelo;

public abstract class Animal {
    private String nombre;

    // -------------

    public Animal() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println(this.getNombre() + " esta comiendo...");

    }

    public void caminar() {
        System.out.println(this.getNombre() + " esta caminando...");

    }

    public void cagar() {
        System.out.println(this.getNombre() + " esta cagando...");

    }

}
