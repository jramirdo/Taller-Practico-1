import java.sql.Date;
/**
 * Aqui creamos la clase Carro con los respectivos atributos 
 * @author Javier Ramirez 
 */
public class Car {
    public String brand;
    public String model;
    public Date year_car;
    public String colors_car;
    private double cost;

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

}
