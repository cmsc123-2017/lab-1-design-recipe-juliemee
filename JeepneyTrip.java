/* signature
 * double --> double
 * purpose
 * produces the change given the amount, the number of passengers and discounts 
 * 
 * stub
 * double fareChange(){
 * returns 0.0;
 * }
 * 
 * examples
 * 
 * template
 * ...this.distance -- double
 * ...this.totalPassengers -- int
 * ...this.discountPassengers -- int
 * 
 * body/method
 * 
 * test and debug
 */

class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  final int BASE_KM = 5;
  final double BASE_FARE = 7.00;
  final double BASE_DISCOUNT = 6.00;
  
  
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
  double fareChange(double payment) {
    if(this.distance <= 5){
      return payment - (totalPassengerFare() + totalDiscountPassenger());
    }   
    else {
      return payment - (((totalDistanceFare() + BASE_FARE)*this.totalPassengerFare())+((totalDistanceFare() + BASE_DISCOUNT)*this.discountPassengers));
    }
  }
   
  int normal(){
    return this.totalPassengers - this.discountPassengers;
  }
  
  double totalDistanceFare(){
    double reduced = this.distance - BASE_KM;
    double distanceFare = reduced * 0.50;
    return distanceFare;
  }
  double totalPassengerFare(){
    double totalNormalFare = normal() * BASE_FARE;
    return totalNormalFare;
  }
  double totalDiscountPassenger(){
    double totalDiscountFare = this.discountPassengers*BASE_DISCOUNT;
    return totalDiscountFare;
  }
}
  
