package subtask3

import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB) {
            Int::class -> {
                var number = 0
                for (item in blockA) if (item is Int) number += item
                number
            }
            String::class -> {
                var string = ""
                for (item in blockA) if (item is String) string += item
                string
            }
            LocalDate::class -> {
                var date = LocalDate.parse("1970-01-01")
                for (item in blockA)
                    if (item is LocalDate)
                        if (item.isAfter(date))
                            date = item
                "${date.dayOfMonth}.${date.monthValue}.${date.year}"
            }
            else -> Any()
        }
    }
}
