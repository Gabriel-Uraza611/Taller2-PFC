package taller

object App {
  def main(args: Array[String]): Unit = {

    //? COMPROBACION FUNCION GRANDE_____________________________________________________
    val conjuntoGrande = new ConjuntosDifusos().grande(1, 2)

    val resultGrand1 = conjuntoGrande(2)
    val resultGrand2 = conjuntoGrande(12)
    val resultGrand3 = conjuntoGrande(22)

    println(s"Grado de pertenencia de 2: $resultGrand1")
    println(s"Grado de pertenencia de 12: $resultGrand2")
    println(s"Grado de pertenencia de 22: $resultGrand3")

    //? COMPROBACIONES FUNCION COMPLEMENTO______________________________________________
    val conjuntoComplemento = new ConjuntosDifusos().complemento(conjuntoGrande)

    val resultComp1 = conjuntoComplemento(2)
    val resultComp2 = conjuntoComplemento(12)
    val resultComp3 = conjuntoComplemento(22)

    println(s"Complemento del grado de pertenencia de 2: $resultComp1")
    println(s"Complemento del grado de pertenencia de 12: $resultComp2")
    println(s"Complemento del grado de pertenencia de 22: $resultComp3")

    //?COMPROBACIONES FUNCION UNION E INTERSECCION______________________________________

    val conjGrande1 = new ConjuntosDifusos().grande(2,3)
    val conjGrande2 = new ConjuntosDifusos().grande(1,3)
    val conjuntoUnion = new ConjuntosDifusos().union(conjGrande1, conjGrande2)
    val conjuntoInterseccion = new ConjuntosDifusos().interseccion(conjGrande1,conjGrande2)

    val resultUnion1 = conjuntoUnion(2)
    val resultUnion2 = conjuntoUnion(12)
    val resultUnion3 = conjuntoUnion(22)
    val resultIntersec1 = conjuntoInterseccion(2)
    val resultIntersec2 = conjuntoInterseccion(12)
    val resultIntersec3 = conjuntoInterseccion(22)


    println(s"Grado de pertenencia de 2 en la Union: $resultUnion1")
    println(s"Grado de pertenencia de 12 en la Union: $resultUnion2")
    println(s"Grado de pertenencia de 22 en la Union: $resultUnion3")
    println(s"Grado de pertenencia de 2 en la Interseccion: $resultIntersec1")
    println(s"Grado de pertenencia de 12 en la Interseccion: $resultIntersec2")
    println(s"Grado de pertenencia de 22 en la Interseccion: $resultIntersec3")
  }
}