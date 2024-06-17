object Area {
    def areaOfDisk(r: Double): Double = {
        math.Pi * r * r
    }

    def main(args: Array[String]) = {
        println(areaOfDisk(5))
    }
}

