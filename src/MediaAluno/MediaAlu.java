/*Este programa tem como finalidade receber as notas e nome de um determinado aluno
 * E Devera:
 * 1. Calcular sua média;
 * 2. Informar maior nota;
 * 3. Informar menor nota;
 * */

package MediaAluno;

import javax.swing.JOptionPane;

public class MediaAlu {
	
	static float Media(float N[]) {//Primeiro metodo (float) que calcula a média por meio de um vetor 
		float Md =0;
		
		Md = (N[0]+N[1]+N[2]+N[3])/4;
		
		return Md;
	}static float MaiorN(float N[] ){//Segundo método (float) que calcula qual a maio nota
		float Maior =0;
		
		for(int X =0; X<4; X++) {
			
			if(N[X]>Maior) Maior = N[X];

		}
		
		return Maior;
	}static float MenorN(float N[]) {//Terceiro método (float) que calcula qual a menor nota
		float Menor =0;
		
		for(int X =0; X<4; X++) {
			
			if(X==0)Menor = N[X];
			else if(N[X]<Menor) Menor = N[X];
		
		}
		return Menor;
	}

	public static void main(String[] args) {
		float Md =0, N[] = new float[4], Mar =0, Men =0;
		String Aluno ="";
		
		Aluno = JOptionPane.showInputDialog(null, "Insira o nome do aluno em questão:", "CentroPaulaSouza", 3);

		for(int Y =0; Y<4; Y++) {//Enquanto Y<4 ele pedirá a nota e colocará o valor na posição Y atual
			N[Y] = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a " + (Y+1) + "º nota:", "CentroPaulaSouza", 3));
		}
		
		Md = Media(N);
		
		Mar = MaiorN(N);
		Men = MenorN(N);
		
		JOptionPane.showMessageDialog(null,"O aluno " + Aluno + " tem média:\n" + Md + "\nMaior nota do periodo: " + Mar + "\nMenor nota do período: " + Men);
		
	}


}
