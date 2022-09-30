
package parts;

import java.util.Scanner;

/**
 *
 * @author Cristian Nunes, Jonathan Forlin e Tiago Farinon
 */
public class Parts {
        
        static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showRepositoryMenu();
	}
	
	public static void showRepositoryMenu() {
		String menu =           "***************************************************\n"
				+ 	"*  Sistemas Distribuidos                           *\n"
                                + 	"*  Tiago da Costa Farinon                          *\n"
                                + 	"*  Cristian da Rosa Nunes                          *\n"                        
				+ 	"*  Jonathan Forlin                                 *\n"
				+ 	"*                                                  *\n"
				+ 	"***************************************************\n"
				+ 	"* 1 - Criar Repositorio                            *\n"
				+       "* 2 - Adicionar peça ao Repositório                *\n"
				+       "* 3 - Listar peças do Repositório                  *\n"
				+       "* 4 - Busca peça no Repositório                    *\n"
			 	+       "* 5 - Encerra                                      *\n"
				
				+ 	"***************************************************\n"
				+ 	"Escolha o padrão que quer testar:";
		System.out.println(menu);
		choseRepositoryOption();
	}
	
        public static void showPartMenu() {
		String menu =           "***************************************************\n"					
				+ 	"*    Detalhes da Peça                              *\n"
				+ 	"***************************************************\n"
				+ 	"* 1 - Descrição da peça                           *\n"
				+       "* 2 - Nome do Repositório                          *\n"
				+       "* 3 - Verificar se é peça primitiva ou agregada    *\n"
				+       "* 4 - Quantidade de Subcomponentes                 *\n"
                                +       "* 5 - Listar Subcomponentes                       \n"
                                +       "* 6 - Esvazia a lista de Subcomponentes            \n"
			 	+       "* 7 - Volta ao menu anterior                       \n"
                        
				
				+ 	"***************************************************\n"
				+ 	"Escolha o padrão que quer testar:";
		System.out.println(menu);
		chosePartOption();
	}
	private static void choseRepositoryOption() {
		int n = reader.nextInt();

		switch(n){
                    case 1:
				
                        break;	
                    case 2:

                        break;	        
                    case 3:

                        break;	        
                    case 4:
                            showPartMenu();
                        break;	        
                    case 5:
                        System.exit(0);
                        break;

                    default:
                            showRepositoryMenu();
                }
		
	}
        
        private static void chosePartOption() {
		int n = reader.nextInt();

		switch(n){
			case 1:
				
	            break;	
	        case 2:
	        	
	            break;	        
	        case 3:
	        	
	            break;	        
	        case 4:
	        	
	            break;	        
	        case 5:
	        	
	            break;	            
	        case 6:
	        	
	            break;	       
	        case 7:
                    showRepositoryMenu();
	            break;	        

	        default:
	        	showPartMenu();
	    }
		
	}
    
}
