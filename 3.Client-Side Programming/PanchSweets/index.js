function calculateTotal()
{

    // Reading the values from the HTML form
	  var orderedDish = document.getElementById("most-like").value;
	  var numberPlates = document.getElementById("quantity").value;

      console.log("Ordered dish no: " + orderedDish + "\n" + "Number of Plates" + numberPlates)
      var  val;
      var totalCost;

      if(orderedDish == 1) val = 60;
      else if(orderedDish == 2) val = 60;
      else if(orderedDish == 3) val = 100;
      else if(orderedDish == 4) val = 50;
      else if(orderedDish == 5) val = 20;
      else if(orderedDish == 6) val = 90;
      else if(orderedDish == 7) val = 50;
      else if(orderedDish == 8) val = 40;
      else if(orderedDish == 9) val = 30;
      else if(orderedDish == 0) val = 30;

     total = val * numberPlates;
     console.log("Total Cost: " + total)

     if(total > 0)
     {
        alert("Your total order value is " + total + "/-\n\nPlease pay the full amount to our Delivery Boy and\nCollect your receipt.")
     }
     else
     {
        alert("Please select dish and number of plates")
     }
}