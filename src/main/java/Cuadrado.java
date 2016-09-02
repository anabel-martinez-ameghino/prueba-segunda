import java.util.List;

/**
 * Created by damian on 26/08/16.
 */

public class Cuadrado implements Figura {
    public double lado;

    public Cuadrado(double i) {

        this.lado = i;
    }

    public double area() {
        double areaC = lado * lado;
        return areaC;
    }

    public double perimetro() {
        double perimetroC = lado * 4;
        return perimetroC;
    }

    public double sumarAreasDeCuadrados(List<Cuadrado> cuadrados) {
        double suma = 0;
        for (Cuadrado c : cuadrados) {
            suma = suma + c.area();
        }
        return suma;
    }

    public double sumarAreasDeFiguras(List<Figura> rectangulos) {
        double sumaDeAreas = 0;
        for(Figura rec : rectangulos){
            sumaDeAreas = sumaDeAreas + rec.area();
        }
        return sumaDeAreas;
    }
}


