/* Soru: Öyle bir program yazýn ki bu program, verilen bir deðerin çift mi, tek mi yoksa
 * sayý doðrusunun soldunda (Örneðin -1) olup olmadýðýný switch- case ve if yapýsýyla yazýp
 * ekrana yazdýrýn. */


public class switch_case_example {

	public static void main(String[] args) {
		
		int a=60,c; // a kendimizin deðiþtirebileceðimiz bir deðiþken ve c'yi ise sonradan deðer atayacaðýmýz için deðer atamadýk.
		
		c=a%2; // a'ye atadýðýmýz deðerin modunu alarak çift bir sayý mý yoksa tek bir sayý mý olduðunu anlayacaðýz.
		
		switch(c) {
		
		case 0:
			if(a<0 && c==0) {
				System.out.println("Sayýnýz sayý doðrusunun solunda ve çift bir sayý.");
			}
			else {
				System.out.println("Sayýnýz sayý doðrusun saðýnda ve çift bir sayý.");
				}
			break;
			
			
		case 1:
			System.out.println(a + " sayýsý bir tek sayýdýr!");
			break;
			
			
		case -1:
			System.out.println(a + " sayýsý tek ve sayý doðrusunun solundadýr.");
			break;
			
		default:
			
			
		}
		
		
			
			
		}
		

	}


