
package databaselab;

public class Constractor {
    private String product_name;
    private int  product_id;
    private int product_quantity;
    private String lastName;
    private int Age;
    private String Address;

    /**
     * @return the firstName
     */
    public Constractor( int product_id,int product_quantity) {
        
       this.product_id=product_id;
       this.product_quantity=product_quantity;
    }
  

    public String productName() {
        return product_name;
    }

    /**
     * @return the year
     */
    public int productID() {
        return product_id;
    }
    public int ProductQuan(){
        return product_quantity;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    
    public int getAge(){
        return Age;
    }
    public String getAddress(){
        return Address;
    }
    
}


