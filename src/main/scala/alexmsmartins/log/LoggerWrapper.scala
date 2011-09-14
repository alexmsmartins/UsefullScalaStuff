package alexmsmartins.log

import org.slf4j.{LoggerFactory, Marker, Logger}

/** Please document.
 *  @author: alex
 *  Date: 14-09-2011
 *  Time: 16:03 */
trait LoggerWrapper {
  lazy private[this] val logger:Logger = {
    Console.println("Logger wrapper initialized for " + getClass)
    LoggerFactory.getLogger(getClass)
  }

  def getName: String = logger.getName

  //-----------------------------------------------------
  def isTraceEnabled: Boolean = logger.isTraceEnabled

  def trace(msg: String) {logger.trace(msg)}

  def trace[T](format: String, arg: T):T = {
    logger.trace(format,arg)
    arg
  }

  def trace[T](format: String, arg1: T, arg2: AnyRef):T = {
    logger.trace(format, arg1, arg2)
    arg1
  }

  def trace[T](format: String, arg1:T, arg2:AnyRef, args:AnyRef*):T = {
    logger.trace(format, (arg1 :: arg2 :: args.toList).toArray)
    arg1
  }

  def trace(format: String, transversable:Traversable[AnyRef]):Traversable[AnyRef] ={
    logger.trace(format, transversable.toArray)
    transversable
  }

  def trace(msg: String, t: Throwable) {logger.trace(msg, t)}

  def isTraceEnabled(marker: Marker): Boolean = logger.isTraceEnabled(marker)

  def trace(marker: Marker, msg: String) {logger.trace(marker, msg)}

  def trace[T](marker: Marker, format: String, arg: T):T = {
    logger.trace(marker, format, arg)
    arg
  }

  def trace[T](marker: Marker, format: String, arg1: T, arg2: AnyRef):T = {
    logger.trace(marker, format, arg1, arg2)
    arg1
  }

  def trace[T](marker:Marker, format: String, arg1:T, arg2:AnyRef, args:AnyRef*):T = {
    logger.trace(marker, format, (arg1 :: arg2 :: args.toList).toArray)
    arg1
  }

  def trace(marker:Marker, format: String, transversable:Traversable[AnyRef]):Traversable[AnyRef] ={
    logger.trace(marker, format, transversable.toArray)
    transversable
  }

  def trace(marker: Marker, msg: String, t: Throwable) {logger.trace(marker, msg,t)}

  //-----------------------------------------------------
  def isDebugEnabled: Boolean = logger.isDebugEnabled

  def debug(msg: String) {logger.debug(msg)}

  def debug[T](format: String, arg: T):T = {
    logger.debug(format,arg)
    arg
  }

  def debug[T](format: String, arg1: T, arg2: AnyRef):T = {
    logger.debug(format, arg1, arg2)
    arg1
  }

  def debug[T](format: String, arg1:T, arg2:AnyRef, args:AnyRef*):T = {
    logger.debug(format, (arg1 :: arg2 :: args.toList).toArray)
    arg1
  }

  def debug(format: String, transversable:Traversable[AnyRef]):Traversable[AnyRef] ={
    logger.debug(format, transversable.toArray)
    transversable
  }

  def debug(msg: String, t: Throwable) {logger.debug(msg, t)}

  def isDebugEnabled(marker: Marker): Boolean = logger.isDebugEnabled(marker)

  def debug(marker: Marker, msg: String) {logger.debug(marker, msg)}

  def debug[T](marker: Marker, format: String, arg: T):T = {
    logger.debug(marker, format, arg)
    arg
  }

  def debug[T](marker: Marker, format: String, arg1: T, arg2: AnyRef):T = {
    logger.debug(marker, format, arg1, arg2)
    arg1
  }

  def debug[T](marker:Marker, format: String, arg1:T, arg2:AnyRef, args:AnyRef*):T = {
    logger.debug(marker, format, (arg1 :: arg2 :: args.toList).toArray)
    arg1
  }

  def debug(marker:Marker, format: String, transversable:Traversable[AnyRef]):Traversable[AnyRef] ={
    logger.debug(marker, format, transversable.toArray)
    transversable
  }

  def debug(marker: Marker, msg: String, t: Throwable) {logger.debug(marker, msg,t)}

  //-----------------------------------------------------
  def isInfoEnabled: Boolean = logger.isInfoEnabled

  def info(msg: String) {logger.info(msg)}

  def info[T](format: String, arg: T):T = {
    logger.info(format,arg)
    arg
  }

  def info[T](format: String, arg1: T, arg2: AnyRef):T = {
    logger.info(format, arg1, arg2)
    arg1
  }

  def info[T](format: String, arg1:T, arg2:AnyRef, args:AnyRef*):T = {
    logger.info(format, (arg1 :: arg2 :: args.toList).toArray)
    arg1
  }

  def info(format: String, transversable:Traversable[AnyRef]):Traversable[AnyRef] ={
    logger.info(format, transversable.toArray)
    transversable
  }

  def info(msg: String, t: Throwable) {logger.info(msg, t)}

  def isInfoEnabled(marker: Marker): Boolean = logger.isInfoEnabled(marker)

  def info(marker: Marker, msg: String) {logger.info(marker, msg)}

  def info[T](marker: Marker, format: String, arg: T):T = {
    logger.info(marker, format, arg)
    arg
  }

  def info[T](marker: Marker, format: String, arg1: T, arg2: AnyRef):T = {
    logger.info(marker, format, arg1, arg2)
    arg1
  }

  def info[T](marker:Marker, format: String, arg1:T, arg2:AnyRef, args:AnyRef*):T = {
    logger.info(marker, format, (arg1 :: arg2 :: args.toList).toArray)
    arg1
  }

  def info(marker:Marker, format: String, transversable:Traversable[AnyRef]):Traversable[AnyRef] ={
    logger.info(marker, format, transversable.toArray)
    transversable
  }

  def info(marker: Marker, msg: String, t: Throwable) {logger.info(marker, msg,t)}

  //-----------------------------------------------------
  def isWarnEnabled: Boolean = logger.isWarnEnabled

  def warn(msg: String) {logger.warn(msg)}

  def warn[T](format: String, arg: T):T = {
    logger.warn(format,arg)
    arg
  }

  def warn[T](format: String, arg1: T, arg2: AnyRef):T = {
    logger.warn(format, arg1, arg2)
    arg1
  }

  def warn[T](format: String, arg1:T, arg2:AnyRef, args:AnyRef*):T = {
    logger.warn(format, (arg1 :: arg2 :: args.toList).toArray)
    arg1
  }

  def warn(format: String, transversable:Traversable[AnyRef]):Traversable[AnyRef] ={
    logger.warn(format, transversable.toArray)
    transversable
  }

  def warn(msg: String, t: Throwable) {logger.warn(msg, t)}

  def isWarnEnabled(marker: Marker): Boolean = logger.isWarnEnabled(marker)

  def warn(marker: Marker, msg: String) {logger.warn(marker, msg)}

  def warn[T](marker: Marker, format: String, arg: T):T = {
    logger.warn(marker, format, arg)
    arg
  }

  def warn[T](marker: Marker, format: String, arg1: T, arg2: AnyRef):T = {
    logger.warn(marker, format, arg1, arg2)
    arg1
  }

  def warn[T](marker:Marker, format: String, arg1:T, arg2:AnyRef, args:AnyRef*):T = {
    logger.warn(marker, format, (arg1 :: arg2 :: args.toList).toArray)
    arg1
  }

  def warn(marker:Marker, format: String, transversable:Traversable[AnyRef]):Traversable[AnyRef] ={
    logger.warn(marker, format, transversable.toArray)
    transversable
  }

  def warn(marker: Marker, msg: String, t: Throwable) {logger.warn(marker, msg,t)}

  //-----------------------------------------------------
  def isErrorEnabled: Boolean = logger.isErrorEnabled

  def error(msg: String) {logger.error(msg)}

  def error[T](format: String, arg: T):T = {
    logger.error(format,arg)
    arg
  }

  def error[T](format: String, arg1: T, arg2: AnyRef):T = {
    logger.error(format, arg1, arg2)
    arg1
  }

  def error[T](format: String, arg1:T, arg2:AnyRef, args:AnyRef*):T = {
    logger.error(format, (arg1 :: arg2 :: args.toList).toArray)
    arg1
  }

  def error(format: String, transversable:Traversable[AnyRef]):Traversable[AnyRef] ={
    logger.error(format, transversable.toArray)
    transversable
  }

  def error(msg: String, t: Throwable) {logger.error(msg, t)}

  def isErrorEnabled(marker: Marker): Boolean = logger.isErrorEnabled(marker)

  def error(marker: Marker, msg: String) {logger.error(marker, msg)}

  def error[T](marker: Marker, format: String, arg: T):T = {
    logger.error(marker, format, arg)
    arg
  }

  def error[T](marker: Marker, format: String, arg1: T, arg2: AnyRef):T = {
    logger.error(marker, format, arg1, arg2)
    arg1
  }

  def error[T](marker:Marker, format: String, arg1:T, arg2:AnyRef, args:AnyRef*):T = {
    logger.error(marker, format, (arg1 :: arg2 :: args.toList).toArray)
    arg1
  }

  def error(marker:Marker, format: String, transversable:Traversable[AnyRef]):Traversable[AnyRef] ={
    logger.error(marker, format, transversable.toArray)
    transversable
  }

  def error(marker: Marker, msg: String, t: Throwable) {logger.error(marker, msg,t)}

}