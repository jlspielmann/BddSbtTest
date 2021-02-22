package projet2.steps

import test.MyMultiplier
import io.cucumber.scala.{EN,FR,ScalaDsl}

class MyMultiplierStepDefinitions extends ScalaDsl with EN with FR {

  var result: Int = _

  Etantdonnéque("""ma multiplicatrice est fonctionel"""){}

  Quand("""je multiplie {int} et {int}""") { (arg0:Int, arg1:Int) =>
    result = MyMultiplier.multi(arg0, arg1)
  }
  Alors("""^le résultat est (\d+)$"""){ (arg0:Int) =>
    assert(result == arg0, "Incorrect result of calculator computation")
  }
  Quand("""je divise {int} par {int}"""){ (firstNum:Int, secondNum:Int) =>
      result = MyMultiplier.divide(firstNum, secondNum)
  }

  Given("""my multiplier is running"""){}

  When("""I multiply {int} by {int}"""){ (firstNum:Int, secondNum:Int) =>
    result = MyMultiplier.multi(firstNum, secondNum)
  }
  Then("""^result is (\d+)$"""){ (expectedResult:Int) =>
    assert(result == expectedResult, "Incorrect result of calculator computation")
  }
  When("""I divide {int} by {int}"""){ (firstNum:Int, secondNum:Int) =>
    result = MyMultiplier.divide(firstNum, secondNum)
  }

}

