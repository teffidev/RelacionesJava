package semana_3;

public class SuperHeore {
    //atributos
    private String nombre;
    private Armadura armadura;

    //constructor
    public SuperHeore(String nombre, Armadura armadura){
        this.nombre = nombre;
        this.armadura = armadura;
    }

    //metodos
    public void pegar(){
        //logica
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
}
