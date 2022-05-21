class IPhone : Mobile{

    // override all the properties
    override var brand: String = "iPhone"
    override var model: String = "11 Pro"
    override var OS: String = "iOS"

    override var ram: Int = 8
    override var internalStorage: Int = 128

    override var discount: Float = 0.2f
    // price of the mobile
    override var price: Float = 15000f

    // return discounted price of mobile
    override fun getActualPrice(): Float{
        return price - (price * discount)
    }


}