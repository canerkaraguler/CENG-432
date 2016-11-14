
class node(n_value:Int,n_next:node){

	var value = n_value
	var next = n_next
	


}




class IyteMutableList{
	
	var n_start: node = null
	var n_end: node= n_start
		
	def add(x:Int):Unit={
		if(n_start == null){
			n_start= new node(x,null)
			n_end=n_start
		}else{
			n_end.next = new node(x,null)	
			n_end=n_end.next
		
		}
	
	}

	override def toString(): String ={

	var n= n_start
	var numbers=""
	while(n!=null){
		if(n.next!=null){
		numbers+=n.value+","
		n=n.next}
		else{
		numbers+=n.value
		n=n.next
			}
		}
	numbers
	
	}
	


}




object IyteMutableList{
	

def apply() = new IyteMutableList()


}
