package semana_3;

public class MainCarpintero {

    public static void main(String[] args) {

        Carpintero manuel = new Carpintero("Manuel");
        Martillo martilloMadera = new Martillo("madera");

        manuel.usarHerramienta(martilloMadera);

    }

}
