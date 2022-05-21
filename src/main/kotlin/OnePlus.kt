class OnePlus: Mobile {
    // override all the properties
    override var brand: String = "OnePlus"
    override var model: String = "7"
    override var OS: String = "OxygenOS"
    override var discount: Float = 0.1f

    override var ram: Int = 2
    override var internalStorage: Int = 8

    // price of the mobile
    override var price: Float = 2000f

    // return discounted price of mobile
    override fun getActualPrice(): Float{
        return price - (price * discount)
    }
}