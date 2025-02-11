public class PlanoOperadora {
    public static void main(String[] args) {
        
        String plano = "T";
        //String basic01 = "100 minutos de ligação.";
        //String basic02 = "WhatsApp e Instagram grátis.";

        // if (plano == "B") {
        //     System.out.println("100 minutos de ligação.");

        // } else if(plano == "M") {
        //     System.out.println(basic01);
        //     System.out.println(basic02);
            
        // } else if(plano == "T"){
        //     System.out.println(basic01);
        //     System.out.println(basic02);
        //     System.out.println("5GB de Youtube.");
            
        // } else {
        //     System.out.println("Nenhum plano.");
            
        // }

        switch (plano) { // Sem BREAK
            case "T": System.out.println("5GB de Youtube.");
            case "M": System.out.println("WhatsApp e Instagram grátis.");
            case "B": System.out.println("100 minutos de ligação.");
        
            // default:
            // System.out.println("Nenhum plano.");
        }
    }
}
