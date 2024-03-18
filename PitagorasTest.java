public class PitagorasTest {
    public static void main(String[] args) {
        Pitagoras iD = new Pitagoras();
        int catetoA = 3;
        int catetoB = 4;
        double hipotenusa = iD.calcularHipotenusa(catetoA, catetoB);
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
