/**
 *
 * @author departamento
 */
public class Principal {
    public static void main(String[] args) {
        //No puedo instanciar la clase Animal porque es abstracta
        //Animal animal = new Animal();
        Perro perro = new Perro();
        Gato gato = new Gato();
        
        System.out.println("El perro va a decir hola: ");
        perro.decirHola();
        
        System.out.println("Ahora va a decir hola el gato:");
        gato.decirHola();
        
        System.out.println("Ahora hace ruido el perro: ");
        perro.hacerRuido();
        
        System.out.println("Y ahora hace ruido el gato");
        gato.hacerRuido();
        System.out.println("Añadimos cambios al proyecto");
    }
}
