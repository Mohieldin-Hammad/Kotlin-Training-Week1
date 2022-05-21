class Samsung: Mobile {
    // override all the properties
    override var brand: String = "Samsung Galaxy"
    override var model: String = "S 20"
    override var OS: String = "Android"
    override var discount: Float = 0.15f

    override var ram: Int = 4
    override var internalStorage: Int = 128

    // price of the mobile
    override var price: Float = 13000f

    // return discounted price of mobile
    override fun getActualPrice(): Float{
        return price - (price * discount)
    }
    //override fun printDetails(){
    //    super.printDetails()
    //}
}