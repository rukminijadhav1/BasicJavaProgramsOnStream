package shehjadsirAssignment.WednesdayAssignments;

import java.util.Arrays;
import java.util.List;

public class Budget {
	public static void main(String[] args) {
        List<PersonDetails> program = Arrays.asList(
                new PersonDetails("John", 21, 23000),
                new PersonDetails("Steve", 32, 40000),
                new PersonDetails("Martin", 16, 2700)
        );
        int sum=0;
        
        for(PersonDetails p:program) {
        	sum+=p.getBudget();
        }
        System.out.println(sum);
	}
	

}
