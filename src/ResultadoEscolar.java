public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 6;
        //ternario
        String resultado = nota >= 7? "Aprovado":
                nota < 7 && nota >= 5? "Recuperação":
                        "Reprovado";
        System.out.println(resultado);

        /*if (nota >= 7){
            System.out.println("Aprovado!");
        } else if (7 > nota && nota >= 5) {
            System.out.println("Recuperação!");
        } else
            System.out.println("Reprovado!");*/
    }
}
