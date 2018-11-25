/* Soru: Öyle bir program yazın ki bu program, verilen bir değerin çift mi, tek mi yoksa
 * sayı doğrusunun solunda (Örneğin -1) olup olmadığını switch- case ve if yapısıyla yazıp
 * ekrana yazdırın. */


public class switch_case_example {

	public static void main(String[] args) {
		
		int a=60,c; // a kendimizin değiştirebileceğimiz bir değişken ve c'yi ise sonradan değer atayacağımız için değer atamadık.
		
		c=a%2; // a'ye atadığımız değerin modunu alarak çift bir sayı mı yoksa tek bir sayı mı olduğunu anlayacağız.
		
		switch(c) {
		
		case 0:
			if(a<0 && c==0) {
				System.out.println("Sayınız sayı doğrusunun solunda ve çift bir sayı.");
			}
			else {
				System.out.println("Sayınız sayı doğrusun sağında ve çift bir sayı.");
				}
			break;
			
			
		case 1:
			System.out.println(a + " sayısı bir tek sayıdır!");
			break;
			
			
		case -1:
			System.out.println(a + " sayısı tek ve sayı doğrusunun solundadır.");
			break;
			
		default:
			
			
		}
		
		
			
			
		}
		

	}


