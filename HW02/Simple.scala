
object Simple extends App{

	val Numbers = Array(10,25,30)
	Numbers.foreach((x:Int)=>

		if(x%2==0)
			println(x*2)
		else
			println(x*3))


}
