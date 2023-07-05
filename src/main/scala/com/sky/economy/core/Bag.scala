package com.sky.economy.core

import akka.actor.{Actor, ActorLogging, Props}
import com.sky.economy.core.Bag.{BagInitializedEvent, CandleForgedEvent, CollectsResource, ForgesCandle, InitializeBag, WaxCollectedEvent}

/**
 * this is the actor that is invoked and its state restored every time a player logs in the game to keep track of it
 * wax and candles.
 * */
object Bag{
  //COMMANDS
  case class InitializeBag(playerId: String)
  case class CollectsResource(wax: Int)
  case object ForgesCandle

  //EVENTS
  case object BagInitializedEvent
  case object WaxCollectedEvent
  case object CandleForgedEvent

  def props(
             playerId: String,
             candleAmount: Int,
             resourceAmount: Int
           ): Props =
    Props(new Bag(playerId, candleAmount, resourceAmount))
}


class Bag(playerId: String,
          candleAmount: Int,
          resourceAmount: Int ) extends Actor with ActorLogging{
  override def receive: Receive = {
    case InitializeBag => log.info(s"player $playerId is trying to initialize a bag")
      //TODO call the persistance to see if theres a state that can be restored or create a new one
    case CollectsResource(wax) => log.info(s"player $playerId is trying collecting wax")
      //TODO call the persistance of the command
      //TODO apply the command by adding to resource Amount
    case ForgesCandle => log.info(s"player $playerId is trying to forge a new candle")
      //TODO call the persistance for the command
      // apply command substract amount from resource and then add to candleAmount
/*events*/
    case BagInitializedEvent => log.info(s"player $playerId Bag has been initialized")
      // TODO update persistance for view model
    case WaxCollectedEvent => log.info(s"player $playerId collected wax")
    case CandleForgedEvent => log.info(s"player $playerId forged a new candle")
  }
}
