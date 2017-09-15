/**
******************************************************
***  Class Name: Link.
***  Class Author:  Chris Lorenzo
******************************************************
*   This class creates an object to use with the LinkList
*   class.
* 
*   Class Inputs:
*   — Integer value to assign to an objects value property when instantiated.
* 
*   Return Value:
*   — none
* 
******************************************************
*** Date: 14 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/
package Lorenzo_Project2_LinkListRecursion;

/**
 *
 * @author Chris
 */
public class Link {
    
    //Class properties
    public int value;
    public Link nextLink;
    
    //General constructor
    public Link()
    {
        
    }
    
    //Constructor with param value
    public Link(int value)
    {
        this.value = value;
    }
    
}
