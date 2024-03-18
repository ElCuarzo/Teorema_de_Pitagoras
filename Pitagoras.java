public class Pitagoras {
    public double calcularHipotenusa(int catetoA, int catetoB) {
        double catetoC = (catetoA * catetoA + catetoB + catetoB);
        double ResultadocatetoC = Math.sqrt(catetoC);
        return ResultadocatetoC;
    }
}