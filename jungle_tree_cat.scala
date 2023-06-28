// The Youth Sports Project

// Imports
import scala.collection.mutable.ArrayBuffer

// Classes 

class Person(val name: String, val age: Int) {
  override def toString = s"Name: $name, Age:$age"
}

class Player(name: String, age: Int, val team: String) extends Person(name, age) {
  override def toString = s"Name: $name, Age: $age, Team: $team"
}

class Team(val name: String, val players: ArrayBuffer[Player], val coach: String) {
  override def toString = s"Name: $name, Players: ${players.mkString(", ")}, Coach: $coach"
}

// App object

object YouthSportsProject {

  // Variables

  var teams = ArrayBuffer.empty[Team]
  var people = ArrayBuffer.empty[Person]

  // Main method

  def main(args: Array[String]): Unit = {
    createTeams()
    printTeams()
  }

  // Functions

  def createTeams(): Unit = {
    // Create teams
    teams += new Team("A", ArrayBuffer(new Player("John", 12, "A"), new Player("Mary", 14, "A")), "Bob")
    teams += new Team("B", ArrayBuffer(new Player("Paul", 17, "B"), new Player("Julie", 15, "B")), "Sue")

    // Create people not on teams
    people += new Person("Greg", 19)
    people += new Person("Sam", 11)
  }

  def printTeams(): Unit = {
    println("Teams: ")
    for (team <- teams) {
      println(team)
    }
    println("")
    println("People Not on Teams: ")
    for (person <- people) {
      println(person)
    }
  }

}