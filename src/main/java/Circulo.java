/**
 * Created by alumno on 02/09/16.
 */

public class Circulo implements Figura {
    public int radio;

    public Circulo (int radio){
        this.radio = radio;
    }

    public double area() {
        double areaCir = Math.PI * (this.radio * this.radio);
        return areaCir;
    }


    public double perimetro() {
        double perimetroCir = Math.PI *radio ;
        return perimetroCir;
    }
}

