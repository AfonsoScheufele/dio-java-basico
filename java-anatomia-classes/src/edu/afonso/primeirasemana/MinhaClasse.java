package edu.afonso.primeirasemana;

public class MinhaClasse{
    public static void main(String [] args){

        String primeiroNome = "Afonso";
        String segundoNome = "Scheufele";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);


        int anoFabricacao = 2022;
        System.out.println(anoFabricacao);
        boolean verdadeiro = true;
        System.out.println(verdadeiro);
        anoFabricacao = 2018;
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
