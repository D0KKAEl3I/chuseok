package Model;

public class VaccresvVO {

	String resvno, jumin, vcode, hospcode, resvdate, recvtime;

	public String getResvno() {
		return resvno;
	}

	public void setResvno(String resvno) {
		this.resvno = resvno;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getVcode() {
		return vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
	}

	public String getHospcode() {
		return hospcode;
	}

	public void setHospcode(String hospcode) {
		this.hospcode = hospcode;
	}

	public String getResvdate() {
		return resvdate;
	}

	public void setResvdate(String resvdate) {
		this.resvdate = resvdate;
	}

	public String getRecvtime() {
		return recvtime;
	}

	public void setRecvtime(String recvtime) {
		this.recvtime = recvtime;
	}
	
	@Override
	public String toString() {
		return "VaccresvVO [resvno=" + resvno + ", jumin=" + jumin + ", vcode=" + vcode + ", hospcode=" + hospcode
				+ ", resvdate=" + resvdate + ", recvtime=" + recvtime + "]";
	}

	

}
