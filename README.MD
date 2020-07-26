Akka Remoting: Two JVM's

open a terminal for the guidebook actor system. To run:
`sbt "-Dakka.remote.netty.tcp.port=2553" "runMain akka.two_jvm.GuidebookMain`

open a terminal for the tourist actor system. To run:
`sbt "runMain akka.two_jvm.TouristMain"`

type Ctrl+C to stop the application