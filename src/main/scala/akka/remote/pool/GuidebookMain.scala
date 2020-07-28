package akka.remote.pool

import java.io.File

import akka.actor.{ActorRef, ActorSystem, Props}
import akka.routing.FromConfig
import com.typesafe.config.ConfigFactory

object GuidebookMain extends App {

  val configFile = getClass.getClassLoader.getResource("remote_application.conf").getFile
  //parse the config
  val config = ConfigFactory.parseFile(new File(configFile))

  val system: ActorSystem = ActorSystem("BookSystem", config)

  val guideProps: Props = Props[Guidebook]
  val routerProps: Props = FromConfig.props(guideProps)
  val guidebook: ActorRef = system.actorOf(routerProps, "guidebook")


}
