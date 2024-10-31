package taller

object App {
  def main(args: Array[String]): Unit = {

    //? COMPROBACION FUNCION GRANDE-----------------------------------------------------
    val conjuntoGrande = new ConjuntosDifusos().grande(1, 2)

    val resultado1 = conjuntoGrande(3)
    val resultado2 = conjuntoGrande(15)
    val resultado3 = conjuntoGrande(25)

    println(s"Grado de pertenencia de 3: $resultado1")
    println(s"Grado de pertenencia de 15: $resultado2 ")
    println(s"Grado de pertenencia de 25: $resultado3")

    //? COMPROBACIONES FUNCION COMPLEMENTO--------------------------------------------------
    val conjuntoComplemento = new ConjuntosDifusos().complemento(conjuntoGrande)

    val resultado4 = conjuntoComplemento(3)
    val resultado5 = conjuntoComplemento(15)
    val resultado6 = conjuntoComplemento(25)

    println(s"Complemento del grado de pertenencia de 3: $resultado4")
    println(s"Complemento del grado de pertenencia de 15: $resultado5")
    println(s"Complemento del grado de pertenencia de 25: $resultado6")

    //?COMPROBACIONES FUNCION UNION

  }
}