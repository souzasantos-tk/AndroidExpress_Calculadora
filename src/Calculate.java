public class Calculate {

    //NOTA: A comparação de um if deve ser sempre com algo que resulte em uma expressão verdadeira ou falsa.
    // Por exemplo,
    //
    //int total = 10;
    //
    //if (total >= 20) // maior ou igual a 10
    //
    //if (total < 10) // menor que 10
    //
    //if (total == 10) // é igual a 10
    //
    //if (total != 10) // diferente de 10
    //
    //Quando houver +de 1 condição para ser verificada, pode-se usar condições logicas E ou OU.
    // Por exemplo,
    //
    //int max = 10;
    //int min = 5;
    //
    //if (min > 6 && max < 9) // Se min é maior que 6 E max é menor que nove
    //
    //No caso acima, as 2 condições precisam dar verdadeiro para entrar no if
    //
    //if (min > 6 || max < 9) // Se min é maior que 6 OU max é menor que nove
    //
    //No caso acima, se pelo menos 1 das condições for verdadeira ele irá entrar no if


    public static void main(String[] args) {
        int x = Integer.parseInt((args[1]));
        int y = Integer.parseInt((args[2]));

        if (args[0].equals("soma")) {
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            minus(x, y);
        }else if (args[0].equals("dividir")) {
            div(x, y);
        }else if (args[0].equals("multiplicar")) {
            multi(x, y);
        }
    }
        static void sum(int x, int y){
            System.out.println(x + y);
        }
        static void minus(int x, int y){
            System.out.println(x - y);
        }
        static void div(int x, int y) {
        System.out.println(x / y);
        }
        static void multi(int x, int y) {
        System.out.println(x * y);
        }
    }
