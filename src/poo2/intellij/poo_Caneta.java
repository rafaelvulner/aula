package poo2.intellij;
public class poo_Caneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Big Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();

    }
}
