package semana_3;

public class MainSuperHeroe {

    public static void main(String[] args) {

        Armadura batiArmadura = new Armadura("MartiBatman");

        SuperHeore batman = new SuperHeore("Batman", batiArmadura);

        //Queremos saber el nombre de la Armadura de Batman:
        System.out.println("La armadura de Batman es: " + batman.getArmadura().getNombre());

    }

}
