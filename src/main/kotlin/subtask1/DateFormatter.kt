package subtask1

import java.lang.Exception
import java.time.*

class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val date = ZonedDateTime.of(year.toInt(), month.toInt(), day.toInt(), 0, 0, 0, 0, ZoneId.of("UTC"))
            val arrayOfMonths = arrayOf("января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря")
            val dayOfTheWeek = when (date.dayOfWeek) {
                DayOfWeek.MONDAY -> "понедельник"
                DayOfWeek.TUESDAY -> "вторник"
                DayOfWeek.WEDNESDAY -> "среда"
                DayOfWeek.THURSDAY -> "четверг"
                DayOfWeek.FRIDAY -> "пятница"
                DayOfWeek.SATURDAY -> "суббота"
                DayOfWeek.SUNDAY -> "воскресенье"
            }
            val month = arrayOfMonths[month.toInt() - 1]
            "$day $month, $dayOfTheWeek"
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }
}
