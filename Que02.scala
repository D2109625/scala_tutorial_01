object Temperature {
    def converttofahrenheit(c: Double): Double = {
        c * 1.800 + 32
    }

    def main(args: Array[String]) = {
        println(converttofahrenheit(35))
    }
}

