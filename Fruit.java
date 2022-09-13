import java.util.ArrayList;
/**
 * Aqui creamos la clase Fruta con los respectivos atributos 
 * @author Javier Ramirez 
 */
public class Fruit {
	public String name;
	private	Float averageWeight;
	public ArrayList<String> colors;

	public ArrayList<String> getColors() {
		return colors;
	}
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	public Float getAverageWeight() {
		return averageWeight;
	}
	public void setAverageWeight(Float averageWeight) {
		this.averageWeight = averageWeight;
	}
}
