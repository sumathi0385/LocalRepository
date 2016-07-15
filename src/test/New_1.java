package test;

public class New_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Showing: 1 out of 2 in Chennai - Airport";
		  String[] temp;
		 
		  /* delimiter */
		  String delimiter = " ";
		  /* given string will be split by the argument delimiter provided. */
		  temp = str.split(delimiter);
		  /* print substrings */
		  for(int i =0; i < temp.length ; i++)
		    System.out.println(temp[i]);
	}

}
