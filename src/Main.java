import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            //Variaveis//
            String info;
            String convert;
            int select = -1;
            int attempts = 0;
            boolean valid = false;


            //Apresentação empresa//
            JOptionPane.showMessageDialog(null,"Coffee Machine LTD","Bem Vindos",JOptionPane.INFORMATION_MESSAGE);

            //Menu de Opções//
            info = String.format("%n ESCOLHA DIGITANDO O CODIGO DA BEBIDA%n 12 - Café %n 15 - Chá %n 18 - Suco de Laranja %n 25 - Refrigerante %n 40 - Água Mineral %n 0 - Nenhuma opção");

            //validar até que o valor seja correto, com limite de 3 tentativas//
            while (!valid){

                try{
                    //solicitar escolha//
                    convert= JOptionPane.showInputDialog(null,info,"Menu de Bebidas",JOptionPane.QUESTION_MESSAGE);
                    select = Integer.parseInt(convert);

                    //verificar se escolha está dentro das opções//
                    if(select == 12|| select == 15|| select == 18 || select == 25|| select == 40|| select == 0){
                    valid = true;

                    }else {
                    attempts++;
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                }

                }catch (NumberFormatException e){
                    attempts++;
                    JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                }

                //limitar tentativas, no maximo 3, se atigindas encerrar o progama//
                if (attempts >= 3){
                JOptionPane.showMessageDialog(null, "Número máximo de tentativas atingido. O programa será encerrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
                }

            }
            //escolha do usuario//
        switch (select) {
            case 12:
                JOptionPane.showMessageDialog(null, "Você escolheu Café.", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                break;


            case 15:
                JOptionPane.showMessageDialog(null, "Você escolheu Chá.", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 18:
                JOptionPane.showMessageDialog(null, "Você escolheu Suco de Laranja.", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 25:
                JOptionPane.showMessageDialog(null, "Você escolheu Refrigerante.", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 40:
                JOptionPane.showMessageDialog(null, "Você escolheu Água Mineral.", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 0://Fechar o progama//
                JOptionPane.showMessageDialog(null, "Encerrando o programa. Até logo!", "Saída", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
        }


    }
}
