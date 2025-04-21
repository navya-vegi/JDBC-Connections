package Models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Orders {
	@NotNull
	
	private long orederId;
	@NotNull
	private String orderName;
	@NotNull
	private String orderAdd;
	@NotNull
	@Size( min = 6,max = 6)
	private long pincode;
	@NotNull
	@Size(min = 10,max = 10)
	private long mobileNo;
	public long getOrederId() {
		return orederId;
	}
	public void setOrederId(long orederId) {
		this.orederId = orederId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderAdd() {
		return orderAdd;
	}
	public void setOrderAdd(String orderAdd) {
		this.orderAdd = orderAdd;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(long orederId, String orderName, String orderAdd, long pincode, long mobileNo) {
		super();
		this.orederId = orederId;
		this.orderName = orderName;
		this.orderAdd = orderAdd;
		this.pincode = pincode;
		this.mobileNo = mobileNo;
	}
	
	

}
