package racingCarWinner.view

import racingCarWinner.domain.Car

object ResultView {
    const val STATE_UNIT = "-"

    fun printResultText() {
        ConsolePrinter.printMsg("\n실행 결과")
    }

    fun printResultState(cars: List<Car>) {
        cars.forEach {
            ConsolePrinter.printMsg(it.name + " : " + STATE_UNIT.repeat(it.location))
        }
        ConsolePrinter.printMsg("")
    }

    fun printWinners(winners: List<String>) {
        ConsolePrinter.printMsg(winners.joinToString { it } + "가 최종 우승했습니다.")
    }
}