import akka.http.scaladsl.Http
import com.typesafe.scalalogging.LazyLogging
import config.AppConfig.appConfig.http._
import route.AppRoutes

import scala.util.{Failure, Success}

object Application extends App with AppRoutes with LazyLogging {

  Http()
    .newServerAt(host, port)
    .bindFlow(route)
    .onComplete {
      case Success(_) =>
        logger.info(s"App running ($host:$port)")
      case Failure(exception) =>
        logger.info(s"App failed to start:\n${exception.getMessage}")
    }
}
