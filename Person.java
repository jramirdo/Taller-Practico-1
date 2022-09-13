import java.util.Date;
/**
 * Aqui creamos la clase Persona con los respectivos atributos 
 * @author Javier Ramirez 
 */
public class Person {
    
    public String name; 
    public String LastName1;
    public String LastName2;
    private Date DateBirth;
    public Float Height;
    public String Email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getDateBirth() {
        return DateBirth;
    }
    public void setDateBirth(Date dateBirth) {
        DateBirth = dateBirth;
    }
    

}

