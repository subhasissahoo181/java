//producer-consumer

class Goods{
	int data;
	boolean canProduce = true;
	synchronized void put (int value)
	{
		if(! canProduce){
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Interrupted Exception caught");
			}
		}
		data = value;
		System.out.println("put: "+data);
		canProduce = false;
		notify();
	}
	
	synchronized int get(){
		if(canProduce){
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Interrupted Exception caught");
			}
		}
		System.out.println("\tGot: "+data);
		canProduce=true;
		notify();
		return data;
	}
	
	
}



class Producer extends Thread{
	Goods g;
	Producer(Goods g)
	{
		this.g =g;
	}
	public void run()
	{
		int value = 1;
		while (true){
			g.put(value++);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println("Interrupted Exception caught");
			}
		}
	}
}
class Consumer extends Thread{
	Goods g;
	Consumer(Goods g){
		this.g=g;
	}
	
	public void run(){
		while (true){
			g.get();
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println("Interrupted Exception caught");
			}
		}
	}
}

class ProducerConsumerDemo{
	public static void main(String args[]){
		Goods g = new Goods();
		Producer producerThread = new Producer(g);
		Consumer consumerThread = new Consumer(g);
		
		producerThread.start();
		consumerThread.start();
	}
}