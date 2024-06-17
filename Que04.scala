object Bookcost {

    def grosscost (price:Double ,NoOfcopies:Int) = {
        price * 0.4 * NoOfcopies
    }
    

    def shippingcost (NoOfcopies:Int) = {
        if (NoOfcopies > 50)
            50 * 3 + (NoOfcopies - 50) * 0.75 
        else
            NoOfcopies * 3    
    }

    def totalcost(price:Double,NoOfcopies:Int) = {
        grosscost(price,NoOfcopies) + shippingcost(NoOfcopies)
    }



    def main(args: Array[String]) = {
        println(totalcost(24.95,60))
    }
}    
