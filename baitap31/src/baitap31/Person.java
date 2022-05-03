package baitap31;

public class Person 
{
  private String ten, gioi_tinh, que_quan;
  private int ngay_sinh;
  Person(String ten,int ngaysinh, String gioitinh, String quequan)
  {
	  this.ten =ten;
	  this.ngay_sinh= ngaysinh;
	  this.gioi_tinh = gioitinh;
	  this.que_quan= quequan;
  }
public String getTen() 
{
	return ten;
}
public void setTen(String ten) 
{
	this.ten = ten;
}
public String getGioi_tinh() 
{
	return gioi_tinh;
}
public void setGioi_tinh(String gioi_tinh) 
{
	this.gioi_tinh = gioi_tinh;
}
public String getQue_quan() {
	return que_quan;
}
public void setQue_quan(String que_quan) 
{
	this.que_quan = que_quan;
}
public int getNgay_sinh() 
{
	return ngay_sinh;
}
public void setNgay_sinh(int ngay_sinh) 
{
	this.ngay_sinh = ngay_sinh;
}
public void in() 
{
	System.out.println("ten: "+ten+"\t ngay sinh: "+ngay_sinh+ "\t gioi tinh: "+gioi_tinh+"\t que quan: "+que_quan);
}
public static void main(String[] args) 
{
	Person doituong1= new Person("Thang", 28,"nam","Hoai Duc");
	doituong1.in();
	Person doituong2= new Person("Ha", 6,"nam","Hoai Duc");
	doituong2.in();
	Person doituong3= new Person("Manh", 30,"nam","Hoai Duc");
	doituong3.in();


}
  
}
