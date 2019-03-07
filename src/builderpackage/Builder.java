/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package builderpackage;

// Se puede codificar manualmente o automaticamente desde el constructor de la clase mediante Refactor 
public class Builder {
    
    private String lastName;
    private String middleName;
    private String firstName; // OBLIGATORIO
    private long id; // OBLIGATORIO
    private int birthYear;
    private int birthMonth;
    private int birthDate;
    private int hireYear;
    private int hireMonth;
    private int hireDate;
    
    // Se especifican los parametros obligatorios en el Constructor
    public Builder(String firstName, long id){
        this.firstName = firstName;
        this.id = id;
    }
    
    // En un Builder los setters devuelven el propio objeto modificado
    public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Builder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public Builder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Builder setId(long id) {
        this.id = id;
        return this;
    }

    public Builder setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public Builder setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public Builder setBirthDate(int birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Builder setHireYear(int hireYear) {
        this.hireYear = hireYear;
        return this;
    }

    public Builder setHireMonth(int hireMonth) {
        this.hireMonth = hireMonth;
        return this;
    }

    public Builder setHireDate(int hireDate) {
        this.hireDate = hireDate;
        return this;
    }
    
    // Al final siempre debe existir la creacion del objeto con todos sus atributos
    public Employee createEmployee(){
        return new Employee(lastName,middleName,firstName,id,birthYear,birthMonth,birthDate,hireYear,hireMonth,hireDate);
    }
}