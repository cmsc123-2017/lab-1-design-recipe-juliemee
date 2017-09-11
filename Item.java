/*signature 
 * -->double
 * 
 * purpose
 * compute the reduced price of an item given a 0.15 percentage
 * 
 * stub
 * double reducedPrize(){
 * return 0.0;
 * }
 * 
 * examples
 * 
 * template
 * ...this.item --> String
 * ...this.price --> double
 * 
 * test and debug
 */

class Item{
  String item;
  double price;
  
  Item(String item, double price){
    this.item = item;
    this.price = price;
  }
  
  double reducedPrice(){
    if(this.price <= 1000.0){
      return this.price;
    }
    else{
      return this.price-(this.price*0.15);
    }
  }  
}

