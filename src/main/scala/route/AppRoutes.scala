package route

import akka.actor.ActorSystem
import akka.http.scaladsl.common.{EntityStreamingSupport, JsonEntityStreamingSupport}
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives.{complete, concat, get, pathSingleSlash}
import akka.http.scaladsl.server.Route
import com.typesafe.scalalogging.LazyLogging

import scala.concurrent.ExecutionContext

trait AppRoutes extends LazyLogging {
  implicit val system: ActorSystem        = ActorSystem("my-actor-system")
  implicit val executor: ExecutionContext = system.dispatcher

  implicit val jsonStreamingSupport: JsonEntityStreamingSupport = EntityStreamingSupport.json()

  def route: Route = concat(
    get {
      pathSingleSlash {
        complete(StatusCodes.OK -> "Hello, World!")
      }
    }
  )
}
