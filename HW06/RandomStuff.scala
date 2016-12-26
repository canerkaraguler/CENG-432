trait RandomStuffTrait {

def transform(list: List[Int], op: (Int) => Int) : List[Int]

def allValid(list: List[Int], op: (Int) => Boolean) : Boolean

def executeWithRetry(retryCount: Int, op: => Int) : Option[Int]

}

object RandomStuff extends RandomStuffTrait {


	

	def transform(list: List[Int], op: (Int) => Int) : List[Int]={
		
		
		

		
		var mylist:List[Int]=for( a <- list)yield op(a)
		


		mylist

		
         

	}

	def allValid(list: List[Int], op: (Int) => Boolean) : Boolean={
		
		
		var result=true
		for( a<- list){
			if(op(a)==false){

			result=false
			}
			


		
		}
		
		result



	}


	def executeWithRetry(retryCount: Int, op: => Int) : Option[Int]={

	
	var a=0

	try{
	    Option(op)
		}catch{
			
			case e: Exception => {
				for(a<-1 to retryCount){
					println(a)
					try{
	   		 			Option(op)
					}catch{
			
						case e: Exception => {}

		
					}

   			   		  }

					None

				}	

		
			}

		


	}


		
	
	




	

	

}
