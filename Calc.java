package calculator;

import javax.swing.JOptionPane;

public class Calc {

	public static void main(String[] args) {
		
		Number number1 = new Number();
		Number number2 = new Number();
		Operations opt = new Operations();
		String opc = "S";
		Integer operations;
				
		// Loop para realizar opera��es infinitas
		while(opc == "s" || opc == "S" || opc == "sim" || opc == "Sim") {	
			
			JOptionPane.showMessageDialog(null, "*******Menu*******\n"
					+ "1 - Soma\n"
					+ "2 - Subtra��o\n"
					+ "3 - Multiplica��o\n"
					+ "4 - Divis�o");
			
			operations = Integer.parseInt(JOptionPane.showInputDialog("Digite a opera��o a ser realizada: "));
			number1.setValue(Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: ")));
			number2.setValue(Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: ")));
			
			// Escolha de opera��o matem�tica
			switch(operations) {
				case 1: 
					opt.sum(number1.getValue(), number2.getValue());
					JOptionPane.showMessageDialog(null,"O resultado da conta �: " + opt.result());
					break;
					
				case 2:
					opt.subtraction(number1.getValue(), number2.getValue());
					JOptionPane.showMessageDialog(null,"O resultado da conta �: " + opt.result());
					break;
					
				case 3:
					opt.multiplication(number1.getValue(), number2.getValue());
					JOptionPane.showMessageDialog(null,"O resultado da conta �: " + opt.result());
					break;
					
				case 4:
					opt.division(number1.getValue(), number2.getValue());
					JOptionPane.showMessageDialog(null,"O resultado da conta �: " + opt.result());
					break;
					
				default:
					JOptionPane.showMessageDialog(null,"Error - operation does not exist");
			}
			
			opc = JOptionPane.showInputDialog("Deseja realizar outra opera��o?");
		} 
	}
}
