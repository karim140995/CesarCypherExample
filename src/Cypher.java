import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cypher {

	public static void main(String[] args) {
		
		
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

		try {
			
			System.out.println("Veuillez donnez un texte a chiffrer : ");
			String line=buffer.readLine();
			System.out.println("Veuillez selectionner une clé de chiffrement : ");
			Integer key=Integer.parseInt(buffer.readLine());
			char[] array=line.toCharArray();
			

			
			for(int i=0; i<array.length;i++)
			{	
					
				if((int)Character.toUpperCase(array[i])+key<=90)
				{
					array[i]= (char)((int)array[i]+key);
				}
				else //Avec retour en arriére
				{
					array[i]= (char)((int)array[i]+key-26);
				}
			}
			
			System.out.println("Texte chiffré : "+ String.valueOf(array));
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
