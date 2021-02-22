package projet1.steps

import test.MyCalculator
import io.cucumber.scala.{EN,FR,ScalaDsl}

class MyCalculatorStepDefinitions extends ScalaDsl with EN with FR {

  var result: Int = _

  Etantdonnéque("""ma calculatrice est fonctionel"""){}

  Quand("""^j'ajoute (\d+) et (\d+)$""") { (arg0:Int, arg1:Int) =>
    result = MyCalculator.add(arg0, arg1)
  }
  Alors("""^le résultat devrait être (\d+)$"""){ (arg0:Int) =>
    assert(result == arg0, "Incorrect result of calculator computation")
  }
  Quand("""je enlève {int} de {int}"""){ (firstNum:Int, secondNum:Int) =>
      result = MyCalculator.substract(secondNum, firstNum)
  }

  Given("""^my calculator is running$"""){}

  When("""^I add (\d+) and (\d+)$"""){ (firstNum:Int, secondNum:Int) =>
    result = MyCalculator.add(firstNum, secondNum)
  }
  Then("""^result should be equal to (\d+)$"""){ (expectedResult:Int) =>
    assert(result == expectedResult, "Incorrect result of calculator computation")
  }
  When("""^I subtract (\d+) and (\d+)$"""){ (firstNum:Int, secondNum:Int) =>
    result = MyCalculator.substract(firstNum, secondNum)
  }

}

