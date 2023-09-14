class PriorityQueueUsingArray   
{   
    // create an array
	int P_que[];
	int rear, size, capacity;
    // constructor
	PriorityQueueUsingArray(){
		rear = 0;
		size = 0;
	}
    public PriorityQueueUsingArray(int x) {
	// initialize an array
		rear = 0;
        capacity = x;
        P_que = new int[capacity];
    }
	
    public void insert(int data) {  
		if(rear == capacity)
			System.out.println(data + " Not added, Queue is full");
		else{
			System.out.println("Added : " + data);
			P_que[rear] = data;
			rear++;    	
        }
    	// handle all possible exceptions/errors           	
    }
    
    public int extractMax() {   	 
    	// return and remove max value from array
		
		int x = P_que[0];
		int k = 0;
		for (int i = 0 ; i < capacity ; i ++)
			if(P_que[i] > x){
				x = P_que[i];
				k = i;
			}

		for(int j = k ; j <capacity-1 ; j++)
			P_que[j] = P_que[j+1];
		
		P_que[capacity-1] = 0;
		
		rear--;
		
		return x;
    }
    
    public int getMax() {      	 
    	// just return max value from array
		int x = P_que[0];
		for (int i = 0 ; i < capacity-1 ; i++){
				if(x < P_que[i]){
					x = P_que[i];
				}
			else
				continue;
		}
		return x;
    	// handle all possible exceptions/errors
        
    }
    
    public boolean searchData(int data) {      	 
    	// search data from array
		boolean check = false;
		for (int i = 0 ; i < capacity ; i++)
			if(data == P_que[i])
				check = true;	
		return check;
    	// handle all possible exceptions/errors
    }
    
    public static void main(String[] args)   
    {   
        // Test the main method by creating object for PriorityQueueUsingArray class
		PriorityQueueUsingArray P = new PriorityQueueUsingArray(10);
    	
    	// insert some values using insert method
		P.insert(4);
		P.insert(30);
		P.insert(7);
		P.insert(0);
		P.insert(2);
		P.insert(5);
		P.insert(1);
		P.insert(30);
		P.insert(8);
		P.insert(21);				
    	System.out.println("Getted : " + P.getMax());
    	// call extractMax method and print output
		System.out.println("Extracted : " + P.extractMax());	
		P.insert(91);
    	
    	// insert some values using insert method

    	// call getMax method and print output
		System.out.println("Getted : " + P.getMax());
   	
    	// call extractMax method and print output
		System.out.println("Extracted : " + P.extractMax());
		System.out.println("Extracted : " + P.extractMax());
		System.out.println("Extracted : " + P.extractMax());
		System.out.println("Extracted : " + P.extractMax());
		System.out.println("Extracted : " + P.extractMax());
		
		P.insert(45);
		P.insert(34);
		P.insert(78);
		P.insert(11);
		P.insert(93);
		P.insert(86);	
		P.getMax();
    }   
}   