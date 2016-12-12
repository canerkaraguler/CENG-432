class IyteHashTable(){

 
 case class node(var key:String,var value:String, var next: node)
  
  private var last: node = null
  private var counter=0;

var myTable:Array[node] =new Array[node](10007)
var myTable2:Array[node] =new Array[node](10007)
var myTable3:Array[node] =new Array[node](10007)
var myTable4:Array[node] =new Array[node](10007)


var hashSize=10007

	def mult(a:Int):Int={
	var b=32
		for(i<-0 to a)
		   b=(b*32)%hashSize	
	b
	}

	def index(key:String):Int={
	    var z=0
	
	      for(i <- 0 to key.length-1){
		
		z=(key(i)*mult(i))%hashSize
	     }
	    z
	}

	

	def set(key:String,value:String):Unit={
	
	 var z:Int=index(key)
		
	
	if(0<=counter&&counter<7000){
			if(myTable(z)==null){
			myTable(z) = new node(key,value,myTable(z))
			last=myTable(z)
			counter=counter+1
			
		}else{

			last.next=new node(key,value,null)
			last=last.next
			counter=counter+1
			println(counter)
		}



	}else if(7000<=counter&&counter<14000){

			if(myTable2(z)==null){
			myTable2(z) = new node(key,value,myTable2(z))
			last=myTable2(z)
			counter=counter+1
			
		}else{

			last.next=new node(key,value,null)
			last=last.next
			counter=counter+1	
			

		}


	}else if(14000<=counter&&counter<21000){

			if(myTable3(z)==null){
			myTable3(z) = new node(key,value,myTable3(z))
			last=myTable(z)
			counter=counter+1
			
		}else{

			last.next=new node(key,value,null)
			last=last.next
			counter=counter+1
			

		}


	}else if(21000<=counter){

			if(myTable4(z)==null){
			myTable4(z) = new node(key,value,myTable4(z))
			last=myTable(z)
			counter=counter+1
			
		}else{

			last.next=new node(key,value,null)
			last=last.next
			counter=counter+1
			

		}


	}



	
       


	
	}

	def get(key:String):String={
	 var z=index(key)
	
	if(myTable(z)==null){
		if(counter<7000){
		return null}else{
		if(myTable2(z)==null){
			if(counter<14000){
			return null}else{
			if(myTable3(z)==null){
				if(counter<21000){
				return null}else{
				if(myTable4(z)==null){

				return null}	
		  
				else{
				while(myTable4(z)!=null&&myTable4(z).key!=key){

				myTable4(z)=myTable4(z).next
				if(myTable4(z)==null){

				return null}	

				}
	

				myTable4(z).value
				}}}		
		  
			else{
			while(myTable3(z)!=null&&myTable3(z).key!=key){

			myTable3(z)=myTable3(z).next
			if(myTable3(z)==null){

			return null}	

			}
	

			myTable3(z).value
			}}}		
		  
		else{
		while(myTable2(z)!=null&&myTable2(z).key!=key){

		myTable2(z)=myTable2(z).next
		if(myTable2(z)==null){

		return null}	

		}
	

		myTable2(z).value
		}}}	
		  
	else{
	while(myTable(z)!=null&&myTable(z).key!=key){

	myTable(z)=myTable(z).next
	if(myTable(z)==null){

	return null}	

	}
	

	myTable(z).value
	}
	
	}


}

object IyteHashTable{

def apply():IyteHashTable=new IyteHashTable()





}
