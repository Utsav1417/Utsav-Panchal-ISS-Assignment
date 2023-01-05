import java.util.*;

//First Thread
class FirstThread extends Thread{
    	int n;
	FirstThread(){

    	}
	
	//Generating a random number
	Random random = new Random();
    	int returnNum(){
        	n = random.nextInt(10);
	        return n;
    	}
}

class SecondThread extends Thread{
    	int n;
    	SecondThread(int num){
        	n = num;
    	}
    	
    //Factorial of the random number generated
	public void run(){
        	System.out.println("Current thread: " +Thread.currentThread().getName());
		int fact = 1;
	        for(int i=1; i<=n; i++){
            		fact = fact*i;
        	}
	        System.out.println("The Factorial value of the random number is " + fact);		
    	
		try {
			Thread.sleep(1500);
		} 
		catch(InterruptedException ex){
			System.out.println(ex);
		}
	}
}

class ThirdThread extends Thread{
    	int n;
    	ThirdThread(int num){
        	n = num;
    	}
    	
    	//Sum of factors of a random number generated
    	public void run(){
		System.out.println("Current thread: " +Thread.currentThread().getName());
        	int sum = 0;
        	for(int i=1; i<=n; i++){
         	   	if(n%i==0){
                		sum+=i;
            		}
        	}
        	System.out.println("The Sum of Factors of the random number is " +sum);
    		
		try {
			Thread.sleep(1500);
		} 
		catch(InterruptedException ex){
			System.out.println(ex);
		}
	}
}


class ThreadingBasics{
    public static void main(String[] args) throws InterruptedException {

    	Scanner in = new Scanner(System.in);
        	
	System.out.print("Enter the number of time you want to run threads:");
       	int num = in.nextInt();

    	for(int i = 0; i < num; i++){
    			//create instance of the class
            FirstThread thread1 = new FirstThread();
            thread1.start();
            thread1.setName("Random Number Generator");
    		Thread.sleep(3000);
		
    		System.out.println("\nCurrent thread: " +Thread.currentThread().getName());
            int randNum = thread1.returnNum();	
            System.out.println("The random number generated is " + randNum);
	
        	
            thread1.join();
            		
			if (randNum%2 == 0){
				//create instance of the class
				SecondThread thread2 = new SecondThread(randNum);
				thread2.setName("Even Random Number");
				thread2.start();
				
				thread2.join();
			}
			else{
				//create instance of the class
				ThirdThread thread3 = new ThirdThread(randNum);
	            thread3.setName("Odd Random Number");
				thread3.start();
				
				thread3.join();
			}
 
        }
	
	in.close();
    }
}
