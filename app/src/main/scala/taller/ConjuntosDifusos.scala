package taller
import scala.math.pow

class ConjuntosDifusos() {
  
  type ConjDifuso = Int => Double

  def pertenece(elem: Int, s: ConjDifuso) : Double = {
    s(elem)
  }

  def grande(d: Int, e: Int) : ConjDifuso = {
        (n: Int) => {
            pow((n.toDouble/(n+d).toDouble),e.toDouble)
        }
  }

  def complemento(c: ConjDifuso) : ConjDifuso = {
    (n : Int) => {
      1 - c(n)
    }
  }

  def union(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso = {
    (n : Int) => {
      math.max(cd1(n), cd2(n))
    }
  }

  def interseccion(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso = {
    (n: Int) => {
      math.min(cd1(n), cd2(n))
    }
  }
}
