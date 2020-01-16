package CadastroPet;

public class App {
    public static void main(String[] args) {
        Responsavel pessoa = new Responsavel(
                "Carol",
                "Macedo",
                "04849-303",
                "325",
                17,
                "macedodiasa@gmail.com",
                "957782611"
        );

        Pet animal = new Pet(
                "Cristal",
                "Canis familiaris",
                "Pug",
                3,
                "Fulvo",
                pessoa,
                Pet.TiposCuidado.BanhoETosa.toString()
        );
     System.out.print(animal.retornarDadosPet());

    }


}
