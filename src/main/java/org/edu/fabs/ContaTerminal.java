package org.edu.fabs;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        // TODO: conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // exibir mensagens para o usuario
        // obter pela scanner os valores digitados no terminal

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome");
        String sobrenome = scanner.next();

        String nomeCliente = (nome + " " + sobrenome).toUpperCase();

        System.out.println("Por favor, digite o número da Agência sem o digito");
        String agenciaNumero = scanner.next();

        System.out.println("Por favor, digite o digito da Agência");
        String agenciaDigito = scanner.next();

        String agencia = (agenciaNumero+ "-" +agenciaDigito);

        System.out.println("Por favor, digite o número da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo");
        BigDecimal saldo = scanner.nextBigDecimal();

        // exibir a mensagem conta criada
        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }

}