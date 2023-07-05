import akka.actor.ActorSystem

object SkyEconomyStart extends App{

  System.out.println("testing")

  implicit val system = ActorSystem("skyEconomyModule")




}
