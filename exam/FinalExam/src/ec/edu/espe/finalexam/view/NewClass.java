package ec.edu.espe.finalexam.view;

import ec.edu.espe.finalexam.controller.BubbleSort;
import ec.edu.espe.finalexam.controller.ListNumbersController;
import ec.edu.espe.finalexam.model.ListNumbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class NewClass {
    
    public static void main(String[] args) {
        ListNumbersController listNumbersController = new ListNumbersController();
        ListNumbers listNumbers = new ListNumbers();
        int numbers []={5,8,7,2};
        listNumbers.setListOfNumbersDisordered(numbers);
        BubbleSort b = new BubbleSort();
        b.sort(listNumbers);
        
        System.out.println(listNumbers);

        Document doc = listNumbersController.createDocument(listNumbers);
       
        doc.append("listOfNumbersDisordered", Arrays.toString(numbers));
        listNumbersController.updateToDatabase(doc);

        
    }
    
}
