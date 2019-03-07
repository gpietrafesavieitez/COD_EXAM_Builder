/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package builderpackage;

public class Main {

    public static void main(String[] args) {
        // Empleado creado solo con lo estrictamente necesario
        Employee e1 = new Builder("ana",402).createEmployee();
        System.out.println(e1.toString());
        
        // Empleado creado solo con varios parametros
        Employee e2 = new Builder("gabriel",333).setBirthYear(1995).setLastName("pietrafesa").createEmployee();
        System.out.println(e2.toString());
    }
}
