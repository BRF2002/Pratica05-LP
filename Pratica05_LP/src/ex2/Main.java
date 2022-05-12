package ex2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
    
     int i,j;
     ArrayList<String> cadastro = new ArrayList();

     JOptionPane.showMessageDialog(null, "Seja Bem Vindo!!!");
     do
     {
         String menu= JOptionPane.showInputDialog("MENU \n 1- Cadastrar \n 2- Excluir \n 3- Pesquisar \n 4-Sair");
     i = Integer.parseInt(menu);
     switch (i)
        {
             case 1:
                 JOptionPane.showMessageDialog(null, " Você escolheu a opção 1");
                 String nome= JOptionPane.showInputDialog("Digite o Nome: ");
                 String telefone= JOptionPane.showInputDialog("Digite o Telefone: ");
                 String insta= JOptionPane.showInputDialog("Digite o @ do Instagram: ");
                 String email= JOptionPane.showInputDialog("Digite o Email: ");
                 cadastro.add(nome+";"+telefone+";"+insta+";"+email);
                 break;
             case 2:
                 String consulta = JOptionPane.showInputDialog("Digite uma informação do usuario que deseja excluir:");
     			for (j=0; j<cadastro.size(); j++) {
     				
     				if (cadastro.get(j).contains(consulta)){
     				cadastro.remove(j);
     				JOptionPane.showMessageDialog(null,"Usuário removido com sucesso!");
     				}

     			}
    
                 break;
                 
             	case 3:
                 String pesquisar = JOptionPane.showInputDialog("Digite uma informação do usuario que deseja pesquisar:");
      			for (i=0; i<cadastro.size(); i++) {
      				if (cadastro.get(i).contains(pesquisar)) {
      				JOptionPane.showMessageDialog(null,"Posição"+ i+ cadastro.get(i));
      				}
      				break;
      			}
      			case 4:
                 break;
             default:
            	 break;
        }
     } while (i!=4);
}

	}

