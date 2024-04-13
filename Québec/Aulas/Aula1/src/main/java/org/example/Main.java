package org.example;

public class Main {
    public static void main(String[] args) {
        int i;
        //int i; nao pode criar variaveis com o mesmo nome
        int I;
        //int 1a; variaveis nao podem começar começar com numeros
        int _1a;
        int $aq;

        i = 15;
        I = 10;
        _1a = 5;
        $aq = 0;

        final int j = 10;
        //j = 15; quando a variavel estiver como "final", a mesma nao podera ser alterada
        int asrn24678md;
        //int asrn246 78md; nao pode haver espaço no nome das variaveis
        int asrn246_78md = 10;
        //int asrn2$46%78_md = 10; nao pode utilizar operadores matematicos nas variaveis;

        asrn24678md = 100;
        asrn246_78md = 30;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; boas praticas
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; boas praticas
        int QUANTIDADE_OPCOES = 25;
        int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn246_78md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);




    }
}