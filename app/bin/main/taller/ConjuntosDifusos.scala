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

  def inclusion(cd1: ConjDifuso, cd2: ConjDifuso) : Boolean = {
    def auxiliar(n: Int): Boolean = {
      if (n > 1000) true
      else{
        if (cd1(n) > cd2(n)) false
        else auxiliar(n + 1)
      }
    }
    auxiliar(0)
  }

  def igualdad(cd1: ConjDifuso, cd2: ConjDifuso) : Boolean = {
    inclusion(cd1, cd2) && inclusion(cd2 , cd1)
  }
}
