package com.lewuathe.neurallib

import breeze.linalg.DenseVector
import org.scalatest.FlatSpec

/**
 * Created by lewuathe on 5/12/15.
 */
class DatumSpec extends FlatSpec {
  "Channel" should "keep given data" in {
    val v = DenseVector[Double](1.0, 2.0, 3.0, 4.0)
    val c = new Channel(v, 2, 2)
    val values = c.getValues
    assert(values(0) == 1.0)
    assert(values(1) == 2.0)
    assert(values(2) == 3.0)
    assert(values(3) == 4.0)
  }

  "Datum" should "keep given data" in {
    val v = DenseVector[Double](1.0, 2.0, 3.0, 4.0)
    val c1 = new Channel(v, 2, 2)
    val c2 = new Channel(v, 2, 2)
    val c3 = new Channel(v, 2, 2)
    val d = Datum(Seq(c1, c2, c3), 3, 2, 2)
    assert(d.getData.length == 3)
  }
}
