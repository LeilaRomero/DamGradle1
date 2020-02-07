import org.jsoup.Jsoup

object ElTiempo {
    val doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get()
    val titulo = doc.title()
    val ElementoTemperatura = doc.getElementsByClass("today_nowcard-temp")
    val textoTemperatura= ElementoTemperatura.text()
    val ElementoTiempo = doc.getElementsByClass("today_nowcard-phrase")
    val textoTiempo = ElementoTiempo.text()

}