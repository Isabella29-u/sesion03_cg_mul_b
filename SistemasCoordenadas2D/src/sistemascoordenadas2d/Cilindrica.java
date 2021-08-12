package sistemascoordenadas2d;

public class Cilindrica {
    private double radio;
    private double angulo;
    private double z;
    
    /*Crear
    2 formas del constructor: 1 sin paramtetros
                                otro con parametros
    metodos sobrecargados para convertir de
    cilindrica a esferica
    esferica a cilindrica
    
    */

    public double getRadio() {
        return radio;
    }

    public double getAngulo() {
        return angulo;
    }

    public double getZ() {
        return z;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Cilindrica(double radio, double angulo, double z) {
        this.radio = radio;
        this.angulo = angulo;
        this.z = z;
    }
    
    
    
   
}
