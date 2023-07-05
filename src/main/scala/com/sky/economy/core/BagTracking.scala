package com.sky.economy.core

import akka.actor.{Actor, ActorLogging, Props}


/**
 * this is the Parent actor that will invoke a player and this will receive the commands from the api layer
 * */
object BagTracking{
  //commands
  case class LoginPlayer(playerId: String) // call to initialize state of existing player
  case class locateBag(playerId: String) // get reference to bag to start counting operations

  //events



  def props: Props = Props(new BagTracking)
}

class BagTracking extends Actor with ActorLogging{
  override def receive: Receive = ???
}
