package akka.intro

object Tourist {
  case class Guidance(code: String, description: String)
  case class Start(codes: Seq[String])
}

import akka.actor.{Actor, ActorRef}
import akka.intro.Guidebook.Inquiry
import akka.intro.Tourist.{Guidance, Start}

class Tourist(guidebook: ActorRef) extends Actor {
  override def receive: Receive = {
    case Start(codes) => codes.foreach(guidebook ! Inquiry(_))

    case Guidance(code, description) => println(s"$code: $description")
  }
}