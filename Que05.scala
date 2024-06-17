object Runningtime {

   def easypace(distance: Int): Int = {
      distance * 8
   }

   def tempo(distance: Int): Int = {
      distance * 7
   }

   def main(args: Array[String]): Unit = {
      val totalRunningTime = easypace(2) + tempo(3) + easypace(2)
      println("Total Running Time - " + totalRunningTime + " minutes")
   }
}

