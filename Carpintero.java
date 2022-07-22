package semana_3;

public class Carpintero {
    //atributos
    private String nombre;

    //constructor
    public Carpintero(String nombre){
        this.nombre = nombre;
    }


    //metodos
    public void usarHerramienta(Martillo martilloTipo1){

        System.out.println("Soy el Carpintero " + this.nombre + " y estoy usando el martillo");
        martilloTipo1.martillar();
    }
}
