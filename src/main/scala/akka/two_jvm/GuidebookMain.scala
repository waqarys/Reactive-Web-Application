package akka.two_jvm

import java.io.File

import akka.actor.{ActorRef, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

object GuidebookMain extends App {

  val configFile = getClass.getClassLoader.getResource("remote_application.conf").getFile
  //parse the config
  val config = ConfigFactory.parseFile(new File(configFile))

  val system: ActorSystem = ActorSystem("BookSystem", config)

  val guideProps: Props = Props[Guidebook]
  val guidebook: ActorRef = system.actorOf(guideProps, "guidebook")

}
