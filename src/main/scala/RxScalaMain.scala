package rxscala

import io.reactivex.Observable

class RxScalaClass{
  def fakeInput()={
    Observable.just(1,2,3,4)
  }
}

object RxScalaMain extends App {
    Observable.just("Hello World..")
              .subscribe(line=>println(line))

}
