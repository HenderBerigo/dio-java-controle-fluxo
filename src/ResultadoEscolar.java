public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 4;

        // Condição encadeada
        if (nota >= 7) 
            System.out.println("Aprovado");

        else if(nota >=5 && nota < 7)
            System.out.println("Recuperação");

        else 
             System.out.println("Reprovado");

        
        // Condição ternária - IF-ELSE
        int idade = 18;
        String mensagem = idade > 18 ? "Maior de idade": "Menor de idade";
        System.out.println(mensagem);
        
        // Condição ternária - IF -ELSE IF- ELSE
        int nota2 = 80;
        String resultado = nota2 >= 70 ? "Aprovada": nota2 >= 50 && nota2 < 70 ? "Em Recuperação" : "Reprovada";
        System.out.println(resultado);
   
         
    }
}
