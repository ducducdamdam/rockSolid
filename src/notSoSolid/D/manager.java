package notSoSolid.D;

public class manager {
    
    	Worker worker;

	public void setWorker(Worker w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
    
        
        
}
