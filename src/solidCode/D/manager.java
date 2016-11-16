package solidCode.D;

public class manager {
    
    	IWorkable worker;

	public void setWorker(IWorkable w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
    
}
