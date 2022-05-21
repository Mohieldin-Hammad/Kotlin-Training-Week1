fun main() {

    val iphoneMobile = IPhone()
    iphoneMobile.printDetails()
    println("price: " + iphoneMobile.getActualPrice())


    println("-------------------------------------")
    val samsungMobile = Samsung()
    samsungMobile.printDetails()
    println("price: " + samsungMobile.getActualPrice())


    println("-------------------------------------")
    var onePlus = OnePlus()
    onePlus.printDetails()
    println("price: " + onePlus.getActualPrice())
}