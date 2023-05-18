package shehjadsirAssignment.WednesdayAssignments;

public class CharacterFlipWithEnd {
		public static String flipChar(String input) {
	        if (input.length()< 2) {
	            return "Incompatible.";
	        }
	        if (input.charAt(0)==input.charAt(input.length()-1)) {
	            return "Two's a pair.";
	        }
	        return input.charAt(input.length()- 1)+input.substring(1,input.length()- 1)+input.charAt(0);
	    }

	    public static void main(String[] args) {
	        String input1="Cat, dog, and mouse.";
	        String output1=flipChar(input1);
	        System.out.println(output1);

	        String input2="ada";
	        String output2=flipChar(input2);
	        System.out.println(output2);

	        String input3="Ada";
	        String output3=flipChar(input3);
	        System.out.println(output3);

	        String input4 ="z";
	        String output4=flipChar(input4);
	        System.out.println(output4);
	    }
	}



