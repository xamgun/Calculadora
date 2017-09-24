import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {

    public static void main(String[] args) throws IOException {
        coutln("Calculadora sem OO");
        char ch = ' ';
        while (true) {
            cout("Para sair digite S ou s: ");
            ch = cinch();
            if (ch == 'S' || ch == 's')break;
            cout("Digite o primeiro número: ");
            double d1 = cind();

            cout("Digite o segundo número: ");
            double d2 = cind();

            cout("Escolha a operação + - * / ->");
            char op = cinch();

            String msg = "Inválido";
            double dResultado = 0;

            switch (op) {
                case '+':
                    dResultado = d1 + d2;
                    msg = "A soma é:";   
                break;

                case '-':
                    dResultado = d1 - d2;
                    msg = "A subtração é:";    
                break;

                case '*':
                    dResultado = d1 * d2;
                    msg = "A multiplicação é:";    
                break;

                case '/':
                    if (d2 != 0) {
                        dResultado = d1 / d2;
                        msg = "A divisão é:";
                    }
                    else {
                        dResultado = 9999999999.9999999999;
                        msg = "Erro de divisão por zero!";
                    }
                break;
                default:
                    msg = "Operação não implementada!";
                break;
            }
            coutln(msg+" "+dResultado);
        }
        coutln("Encerrado.");
    }

}

