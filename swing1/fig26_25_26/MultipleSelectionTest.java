// Fig. 26.26: MultipleSelectionTest.java
// Testing MultipleSelectionFrame.
import javax.swing.JFrame;

public class MultipleSelectionTest
{
   public static void main(String[] args)
   { 
      MultipleSelectionFrame multipleSelectionFrame =
         new MultipleSelectionFrame(); 
      multipleSelectionFrame.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE);
      multipleSelectionFrame.setSize(350, 153); 
      multipleSelectionFrame.setVisible(true); 
   } 
} // end class MultipleSelectionTest
