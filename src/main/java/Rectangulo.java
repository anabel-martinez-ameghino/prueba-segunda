/**
 * Created by alumno on 02/09/16.
 */
public class Rectangulo implements Figura {


    public int base;
    public int altura;

    public Rectangulo (int base, int altura){
        this.base= base;
        this.altura =altura;
    }

    public double area() {
        int areaR = base * altura ;
        return areaR;
    }

    public double perimetro() {
        double perimetroR = base *2 + altura *2;
        return perimetroR;
    }

}
