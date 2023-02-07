package Övning_1a_Videobandspelaren_Enkel

import java.time.Duration
import java.time.LocalTime

fun main() {
    val börjanTid = "15:25"
    val slutTid = "16:15"
    val totalLängd = 250
    val användTid = 120
    val tillgängligTid = räknaUtTillgängligTid(totalLängd, användTid)
    val duration = räknaUtDuration(börjanTid, slutTid)
    val itFits = checkIfItFits(tillgängligTid, duration)
    println(geSammanfattning(itFits))
}

fun räknaUtTillgängligTid(totalLängd: Int, användTid: Int) = totalLängd - användTid

fun räknaUtDuration(början: String, slut: String): Int {
    val lt1 = LocalTime.parse(början)
    val lt2 = LocalTime.parse(slut)
    val d = Duration.between(lt1, lt2)
    return d.abs().toMinutes().toInt()
}

fun checkIfItFits(tillgängligTid: Int, duration: Int) = if (tillgängligTid >= duration) true else false

fun geSammanfattning(ifItFits: Boolean) =
    if (ifItFits) "Ja, detta tv-program får plats på ditt videoband." else "Tyvärr, det är för lite tid kvar på ditt video band."

/*
Förr när man fortfarande spelade in film på videoband var det ibland svårt att veta om ett kommande
tv-program skulle få plats på bandet.
Skriv ett program som hjälper oss räkna ut om ett band kommer att räcka eller inte.
Programmet ska ha följande 6 värden från start:
• videobandets längd (i minuter),
• hittills använd tid av bandet,
• den tidpunkt då tv-programmet börjar (ange först antal timmar, sedan minuter)
• den tidpunkt då det slutar (ange först antal timmar, sedan minuter).
Vi kan utgå från att programmen alltid börjar och slutar på samma dag.

Gör flera små, separata metoder, en för varje typ av uträkning. Det är helt ok att hitta din
gamla Java-lösning för denna uppgift och titta på den när du skriver din Kotlin-kod.
 */