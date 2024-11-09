package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ConjuntosDifusosTest extends AnyFunSuite {


  val objConjuntoGrande = new ConjuntosDifusos().grande(1, 2)

  
    val resultGrand1 = objConjuntoGrande(2)
    val resultGrand2 = objConjuntoGrande(12)
    val resultGrand3 = objConjuntoGrande(22)
    val resultGrand4 = objConjuntoGrande(32)
    val resultGrand5 = objConjuntoGrande(42)


    test("grado de pertenencia 2, conjunto de numeros grandes") {
    assert(resultGrand1 == 0.4444444444444444)
  }  
    test("grado de pertenencia 12, conjunto de numeros grandes") {
    assert(resultGrand2 == 0.8520710059171599)
  }  
    test("grado de pertenencia 22, conjunto de numeros grandes") {
    assert(resultGrand3 == 0.9149338374291116)
  }
    test("grado de pertenencia 32, conjunto de numeros grandes") {
    assert(resultGrand4 == 0.9403122130394859)
  }
    test("grado de pertenencia 42, conjunto de numeros grandes") {
    assert(resultGrand5 == 0.9540292049756625)
  }

    //? COMPROBACIONES FUNCION COMPLEMENTO______________________________________________
    val conjuntoComplemento = new ConjuntosDifusos().complemento(objConjuntoGrande)

    val resultComp1 = conjuntoComplemento(2)
    val resultComp2 = conjuntoComplemento(12)
    val resultComp3 = conjuntoComplemento(22)
    val resultComp4 = conjuntoComplemento(32)
    val resultComp5 = conjuntoComplemento(42)

    test("grado de pertenencia 2, complemento conjunto de numeros grandes") {
      assert(resultComp1 == 0.5555555555555556)
    }  
    test("grado de pertenencia 12, complemento conjunto de numeros grandes") {
      assert(resultComp2 == 0.1479289940828401)   
    }  
    test("grado de pertenencia 22, complemento conjunto de numeros grandes") {
      assert(resultComp3 == 0.08506616257088839)
    }
     test("grado de pertenencia 32, complemento conjunto de numeros grandes") {
    assert(resultComp4 == 0.05968778696051413)
    }
      test("grado de pertenencia 42, complemento conjunto de numeros grandes") {
      assert(resultComp5 == 0.04597079502433754)
    }
  
    //?COMPROBACIONES FUNCION UNION/INTERSECCION/INLUSION/IGUALDAD______________________

    val conjGrande1 = new ConjuntosDifusos().grande(2,3)
    val conjGrande2 = new ConjuntosDifusos().grande(1,3)
    val conjGrande3 = new ConjuntosDifusos().grande(5,4)
    val conjGrande4 = new ConjuntosDifusos().grande(8,4)

    val conjuntoUnion = new ConjuntosDifusos().union(conjGrande1, conjGrande2)
    
    
    val resultUnion1 = conjuntoUnion(2)
    val resultUnion2 = conjuntoUnion(12)
    val resultUnion3 = conjuntoUnion(22)
    val resultUnion4 = conjuntoUnion(32)
    val resultUnion5 = conjuntoUnion(42)

    
    test("Grado de pertenencia de 2 en la Union"){
      assert(resultUnion1 == 0.2962962962962962)        
    }
    test("Grado de pertenencia de 12 en la Union"){
      assert(resultUnion2 == 0.7865270823850706)  
    }       
    test("Grado de pertenencia de 22 en la Union"){
      assert(resultUnion3== 0.8751541053669764)
    }
    test("Grado de pertenencia de 32 en la Union"){
      assert(resultUnion4== 0.9118179035534408)
    }
    test("Grado de pertenencia de 42 en la Union"){
      assert(resultUnion5== 0.931842479278554)
    }
    
    val conjuntoInterseccion = new ConjuntosDifusos().interseccion(conjGrande1,conjGrande2)
    
    val resultIntersec1 = conjuntoInterseccion(2)
    val resultIntersec2 = conjuntoInterseccion(12)
    val resultIntersec3 = conjuntoInterseccion(22)
    val resultIntersec4 = conjuntoInterseccion(32)
    val resultIntersec5 = conjuntoInterseccion(42)
    
    test(".Grado de pertenencia de 2 en la intersección"){
      assert(resultIntersec1 == 0.125)        
    }
    test(".Grado de pertenencia de 12 en laintersección"){
      assert(resultIntersec2 == 0.629737609329446)  
    }       
    test(".Grado de pertenencia de 22 en laintersección"){
      assert(resultIntersec3== 0.7702546296296295)
    }
    test(".Grado de pertenencia de 32 en laintersección"){
      assert(resultIntersec4== 0.833706492977814)
    }
    test(".Grado de pertenencia de 42 en laintersección"){
      assert(resultIntersec5== 0.8697407963936891)
    }

    val conjuntoInclusion1 = new ConjuntosDifusos().inclusion(conjGrande1,conjGrande2)
    val conjuntoInclusion2 = new ConjuntosDifusos().inclusion(conjGrande1,conjGrande1)
    val conjuntoInclusion3 = new ConjuntosDifusos().inclusion(conjGrande2,conjGrande2)
    val conjuntoInclusion4 = new ConjuntosDifusos().inclusion(conjGrande2,conjGrande1)
    val conjuntoInclusion5 = new ConjuntosDifusos().inclusion(conjGrande3,conjGrande4)

    test("Inclusión conjunto G1 in G2"){
      assert(conjuntoInclusion1 == true)
    }
    test("Inclusión conjunto G1 in G1"){
      assert(conjuntoInclusion2 == true)
    }
    test("Inclusión conjunto G2 in G2"){
      assert(conjuntoInclusion3 == true)
    }
    test("Inclusión conjunto G2 in G1"){
      assert(conjuntoInclusion4 == false)
    }
    test("Inclusión conjunto G3 in G4"){
      assert(conjuntoInclusion5 == false)
    }



    val conjuntoEsIgual1 = new ConjuntosDifusos().igualdad(conjGrande1,conjGrande2)
    val conjuntoEsIgual2 = new ConjuntosDifusos().igualdad(conjGrande1,conjGrande1)
    val conjuntoEsIgual3 = new ConjuntosDifusos().igualdad(conjGrande2,conjGrande2)
    val conjuntoEsIgual4 = new ConjuntosDifusos().igualdad(conjGrande2,conjGrande1)
    val conjuntoEsIgual5 = new ConjuntosDifusos().igualdad(conjGrande1,conjGrande2)
    

    test("G1 es igual a G2"){
      assert(conjuntoEsIgual1 == false)
    }
    test("G1 es igual a G1"){
      assert(conjuntoEsIgual2 == true)
    }
    test("G2 es igual a G2"){
      assert(conjuntoEsIgual3 == true)
    }
    test("G2 es igual a G1"){
      assert(conjuntoEsIgual4 == false)
    }
    test("G3 es igual a G4"){
      assert(conjuntoEsIgual5 == false)
    }

}
