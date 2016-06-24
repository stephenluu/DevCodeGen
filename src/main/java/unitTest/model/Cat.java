package unitTest.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liuyu.lu
 * @since  Jun 24, 2016
 */
public class Cat {

	private int id;
	private String username;
	private long longF;
	private short shortF;
	private boolean booleanF;
	private double doubleF;
	private BigDecimal bigDecimalF;
	private Date dateF;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getLongF() {
		return longF;
	}
	public void setLongF(long longF) {
		this.longF = longF;
	}
	public short getShortF() {
		return shortF;
	}
	public void setShortF(short shortF) {
		this.shortF = shortF;
	}
	public boolean isBooleanF() {
		return booleanF;
	}
	public void setBooleanF(boolean booleanF) {
		this.booleanF = booleanF;
	}
	public double getDoubleF() {
		return doubleF;
	}
	public void setDoubleF(double doubleF) {
		this.doubleF = doubleF;
	}
	public BigDecimal getBigDecimalF() {
		return bigDecimalF;
	}
	public void setBigDecimalF(BigDecimal bigDecimalF) {
		this.bigDecimalF = bigDecimalF;
	}
	public Date getDateF() {
		return dateF;
	}
	public void setDateF(Date dateF) {
		this.dateF = dateF;
	}
}
