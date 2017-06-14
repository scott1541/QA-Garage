/**
  * Created by Administrator on 13/06/2017.
  */
class Employee(ID: Int, name: String, var job: String) extends Person(ID, name) {

  var busy = false

  def getJob(newJob: String): Unit = {job = newJob}
  def setJob(): String = {job}

  def doWork(): Unit = {
    busy = true
    Thread.sleep(200)
    busy = false
  }
}
