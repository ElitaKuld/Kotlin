package Övning_1b_Videobandspelaren_Fortsättning

import java.time.Duration
import java.time.LocalTime

fun main() {
    fun getAvailableTime(totalLength: Int, usedTime: Int) = totalLength - usedTime

    fun getDuration(startTime: String, slut: String) = Duration.between(LocalTime.parse(startTime), LocalTime.parse(slut)).abs().toMinutes().toInt()

    fun checkIfItFits(availableTime: Int, duration: Int) = availableTime >= duration

    fun showConclusion(ifItFits: Boolean) =
        if (ifItFits) "Ja, detta tv-program får plats på ditt videoband." else "Tyvärr, det är för lite tid kvar på ditt video band."

    val startTime = "15:25"
    val slutTid = "16:15"
    val totalLength = 250
    val usedTime = 120
    val availableTime = getAvailableTime(totalLength, usedTime)
    val duration = getDuration(startTime, slutTid)
    val itFits = checkIfItFits(availableTime, duration)
    println(showConclusion(itFits))
}

/*
Uppgift 1b– Videobandspelaren, forts
Betrakta din lösning av uppgift 1a, liknar den kod du brukade skriva i Java? Låt oss nu närma oss en
mer funktionell stil att programmera.
• Om du har funktioner som är skrivna med krullparenteser, kan du skriva om dem med
kortnotation (=)?
• Använder du var där du hade kunnat ha val? Använd alltid val där det funkar!
• Står dina funktioner uppradade ovanför IfElseDemo.main? Släng in dem i IfElseDemo.main! Functions are first class
citizens.
• Finns det saker som hade kunnat göras på en rad, men som nu görs på flera rader? (Det är
inte alltid rätt med allt på en rad, men testa att slå ihop funktionaliteten där det är rimligt
och se hur det känns.)
 */