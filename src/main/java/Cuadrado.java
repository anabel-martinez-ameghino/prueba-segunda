import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class Cuadrado {
    public int lado;

    public Cuadrado(int i) {
        this.lado = i;
    }

    public int area() {
        int areaC = lado * lado;
        return areaC;
    }

    public int perimetro() {
        int perimetroC = lado * 4;
        return perimetroC;
    }

    public double sumarAreasDeCuadrados(List<Cuadrado> cuadrados) {
        int suma = 0;
        for (Cuadrado c : cuadrados) {
            suma = suma + c.area();
        }
        return suma;
    }

}

