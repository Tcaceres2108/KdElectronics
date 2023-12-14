
package kdelectronics;

import com.github.javafaker.Faker;

import java.util.Locale;

public class dataRandom {

    private static final Faker faker = new Faker(new Locale("es", "CO"));

    public static String generarNombre() {
        return faker.name().fullName();
    }

    public static String generarDireccion() {
        return faker.address().fullAddress();
    }

    public static String generarCorreoElectronico() {
        return faker.internet().emailAddress();
    }

    public static String generarTelefono() {
        return faker.phoneNumber().cellPhone();
    }

    public static void main(String[] args) {
        // Ejemplo de cómo usar los métodos en el main (puedes comentar esta parte si no la necesitas)
        String nombre = generarNombre();
        String direccion = generarDireccion();
        String correoElectronico = generarCorreoElectronico();
        String telefono = generarTelefono();

        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Correo Electrónico: " + correoElectronico);
        System.out.println("Teléfono: " + telefono);
    }
}

