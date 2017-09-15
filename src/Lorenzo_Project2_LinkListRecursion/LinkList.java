/**
******************************************************
***  Class Name: LinkList.
***  Class Author:  Chris Lorenzo
******************************************************
*   This class creates the structure and methods for
*   a link list
* 
*   Class Inputs:
*   — Integer val for push method
*   — Integer val for search method
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
public class LinkList {
    
    public Link top = null;                 //Property Initialization
    
    public void push(int linkVal)           //Method to perform the POP operation
    {
        if(top == null)                     //If LinkList has no link with values
        {                                   //... make the incoming value the value
            top = new Link();               //... for the top link.
            top.value = linkVal;            //... and set its nextlink value to null.
            top.nextLink = null;
        }
        else
        {
            add(linkVal, top);              //Otherwise, call private add method to add link to existing list
        }
    }
    
    
    private void add(int linkVal, Link myLink)      //add link to existing list passing Integer Value and latest link added
    {
        Link temp = new Link(linkVal);              //Create new link to temp hold values while rearranging list pointers
        temp.nextLink = myLink;                     //Place the existing top value to next value
        top = temp;                                 //Place the new incoming value at the top of the list
    }

    
    public void pop()                       //remove the last link placed on stack
    {
        if(top != null)                     //Verify a link exist before acting
        {
            Link temp = new Link();         //Create new link to hold temp values while rearranging list pointers
            temp = top;                     //Place currect top value in temp
            top = temp.nextLink;            //remove the current top value by placing the next top value as the current top value
        }
        else if(top == null)                //if top is null, nextLink must be null to, so clear the nextLink value.
        {
            top.nextLink = null;
        }
    }

    public Link search(int num)             //Public method to access and pass search 
        {                                   //val to recursive search method below
        return recSearch(top,num);
        }
    
    
    private Link recSearch(Link myLink, int num)        //Recursive search method to compare each
    {                                                   //Link value to the num passed in the parameter value
        if(myLink==null)                                //If not found, search repeats to the end of the link list
            return myLink;                              //If first link is null or num is not found, method returns to
        if(myLink.value == num)                         //calling statement.  If number is found, retur
            return myLink;
        return recSearch(myLink.nextLink, num);
    }
        
}
