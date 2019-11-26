public class PruebaError{
	public static void main(String[] args) {
		String[] nums = {"123","hola","45","adiós","8910"};
	  int count = 0;
		for (String tmp : nums ) {

			int n =0;
			try {
				n = Integer.parseInt(tmp);
				System.out.println(n);
			}catch(NumberFormatException nfe){
				System.out.println("Error "+nfe);
			}
			finally{
				count++;
			}
			System.out.println("Llevamos "+count);
		}
	}
}
