package org.example

import org.apache.flink.api.common.functions.MapFunction
import org.apache.flink.cep.scala.pattern.Pattern
import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.api.windowing.assigners.TumblingProcessingTimeWindows
import org.apache.flink.streaming.api.windowing.time.Time
import org.apache.flink.api.scala._

object CEP {
  def main(args: Array[String]) {

    val env = StreamExecutionEnvironment.getExecutionEnvironment
    val text = env.socketTextStream("localhost", 9999)
      .map(e => e.split("//s+") )
      .map(e => new Event(e{0}, e{1}) )

    //val ds_event = text




   /* val pattern = Pattern.begin[Event]("start").where(_.getId == 42)
      .next("middle").subtype(classOf[SubEvent]).where(_.getVolume >= 10.0)
      .followedBy("end").where(_.getName == "end")

    val patternStream = CEP.pattern(input, pattern)

    val result: DataStream[Alert] = patternStream.process(
      new PatternProcessFunction[Event, Alert]() {
        override def processMatch(
                                   `match`: util.Map[String, util.List[Event]],
                                   ctx: PatternProcessFunction.Context,
                                   out: Collector[Alert]): Unit = {
          out.collect(createAlertFrom(pattern))
        }
      })
      .window(TumblingProcessingTimeWindows.of(Time.seconds(5)))
     .sum(1)

    counts.print()

    env.execute("Window Stream WordCount") */
  }
}

