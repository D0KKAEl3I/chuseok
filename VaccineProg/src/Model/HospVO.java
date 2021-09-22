package Model;

public class HospVO {
	String hospcode,hospname,hosptel,hospaddr;

	public String getHospcode() {
		return hospcode;
	}

	public void setHospcode(String hospcode) {
		this.hospcode = hospcode;
	}

	public String getHospname() {
		return hospname;
	}

	public void setHospname(String hospname) {
		this.hospname = hospname;
	}

	public String getHosptel() {
		return hosptel;
	}

	public void setHosptel(String hosptel) {
		this.hosptel = hosptel;
	}

	public String getHospaddr() {
		return hospaddr;
	}

	public void setHospaddr(String hospaddr) {
		this.hospaddr = hospaddr;
	}

	@Override
	public String toString() {
		return "HospVO [hospcode=" + hospcode + ", hospname=" + hospname + ", hosptel=" + hosptel + ", hospaddr="
				+ hospaddr + "]";
	}



}
