package taller

object App {
  def main(args: Array[String]): Unit = {

    //? COMPROBACION FUNCION GRANDE-----------------------------------------------------
    val conjuntoDifusoGrande = new ConjuntosDifusos().grande(1, 2)

    val resultado1 = conjuntoDifusoGrande(3)
    val resultado2 = conjuntoDifusoGrande(3_200)
    val resultado3 = conjuntoDifusoGrande(9_999_999)

    println(s"Grado de pertenencia de 3: $resultado1")
    println(s"Grado de pertenencia de 3200: $resultado2 ")
    println(s"Grado de pertenencia de 9_999_999: $resultado3")
  }
}