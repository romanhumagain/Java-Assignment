package week3day2;

public class Personsinfo {
	
	int pid;
    String Fullname;
    String address;
    public Personsinfo() { //default constructor
    	this.pid = 0;
    	this.Fullname = " ";
    	this.address = " ";
    }
    public Personsinfo(int pid , String Fullname, String address) {
    	
    	this.pid=pid;
    	this.Fullname = Fullname;
    	this.address = address;
    }
    
    public int getID() {
    	return this.pid;
}
	public String getName() {
		return this.Fullname;
		
	}
	public String getAddress() {
		return this.address;
	}
	//setter
	public  void setPID(int PID) {
		this.pid=pid;
	}
	public  void setName(String Fullname) {
		this.Fullname=Fullname;
	}

public  void setAddress(String address) {
	this.address=address;
}

//toString

public String toString() {
	return this.pid+ ","+this.Fullname+","+this.address;
}
}

