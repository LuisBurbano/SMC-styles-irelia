package ec.edu.espe.finalexam.view;

import ec.edu.espe.finalexam.controller.BubbleSort;
import ec.edu.espe.finalexam.controller.InsertionSort;
import ec.edu.espe.finalexam.controller.ListNumbersController;
import ec.edu.espe.finalexam.controller.QuickShort;
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
        
        //listNumbers.setListOfNumbersDisordered(numbers);
        //solo en quickshort
        listNumbers.setListOfNumbersDisordered(Arrays.copyOf(numbers, numbers.length));
        //BubbleSort b = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        //QuickShort quickShort = new QuickShort();
        insertionSort.sort(listNumbers);
        //b.sort(listNumbers);
        int size = numbers.length;
        //QuickShort.sort(numbers, 0, size-1,listNumbers);
        
        System.out.println(listNumbers);

        Document doc = listNumbersController.createDocument(listNumbers);
        
        
        listNumbersController.updateToDatabase(doc);

        
    }
    
}
