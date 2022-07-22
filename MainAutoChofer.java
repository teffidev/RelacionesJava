package semana_3;

public class MainAutoChofer {

    public static void main(String[] args) {

        Chofer chofer, chofer1;

        Auto auto = new Auto("abc126", "Ford", "Modelo25");

        chofer = new Chofer("Juan", "Perez",
                new Auto("abc126", "Ford", "Modelo25"));

        chofer1 = new Chofer("Ana", "Rodriguez", auto);


        System.out.println("Patente auto asignado; " + chofer.verPatente());

    }

}
