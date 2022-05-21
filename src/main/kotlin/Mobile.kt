interface Mobile {
    // abstract properties
    var brand: String
    var model: String
    var OS: String
    var discount: Float
    var ram: Int
    var internalStorage: Int
    var price: Float

    // return discounted price of mobile
    fun getActualPrice(): Float
    // print details of mobile
    fun printDetails() {
        println("Mobile Brand: $brand\nMobile Model: $model\nOS: $OS\nRAM: $ram\nStorage: $internalStorage")
    }
}