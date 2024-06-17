object Volume {
    def volumeofsphere(r: Double): Double = {
        4/3 * math.Pi * r * r * r
    }

    def main(args: Array[String]) = {
        println(volumeofsphere(5))
    }
}

