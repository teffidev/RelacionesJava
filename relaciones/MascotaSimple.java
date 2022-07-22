package semana_3._lesson_2;

public class MascotaSimple {
    //atributos
    private String tipo;
    private double peso;
    private String nombreDuenio;
    private boolean primeraVez;


    //Constructor
    public MascotaSimple(String tipo) {
        this.tipo = tipo;
    }

    //metodos
    public void serAtendido(){
        //logica
        System.out.println("Soy un " + this.tipo + " y estoy siendo atendido!");
    }

}
