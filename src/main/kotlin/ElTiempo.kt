import org.jsoup.Jsoup

object ElTiempo {
    var doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Google").get()
    var titulo = doc.title()
    var ElementoTemperatura = doc.getElementsByClass("today_nowcard-temp")
    var textoTemperatura= ElementoTemperatura.text()
    var ElementoTiempo = doc.getElementsByClass("today_nowcard-phrase")
    var textoTiempo = ElementoTiempo.text()

}