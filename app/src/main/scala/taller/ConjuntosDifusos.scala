package taller
import scala.math.pow

class ConjuntosDifusos() {
  
  type ConjDifuso = Int => Double

  def pertenece(elem: Int, s: ConjDifuso) : Double = {
    s(elem)
  }

  def grande(d: Int, e: Int) : ConjDifuso = {
      //Implementacion funcion grande(GABRIEL)
        (n: Int) =>{
            pow((n.toDouble/(n+d).toDouble),e.toDouble)
        }
  }

}
