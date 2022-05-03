package baitap31;

import java.util.Scanner;

public class ThiSinh 
{ 
	private String ten;
	private int diem_toan, diem_van, diem_ngoai_ngu;
	ThiSinh(String ten,int diemtoan,int diemvan,int diemanh)
	{
		this.ten=ten;
		this.diem_toan=diemtoan;
		this.diem_van=diemvan;
		this.diem_ngoai_ngu= diemanh;
		
	}
	public int tong(int diemtoan, int diemvan, int diemanh) 
	{
		return (diemtoan+diemvan+diemanh);
		
	}
    public void in()
    {
      System.out.println("Ten: "+ten+"\t  diem toan "+diem_toan+"\t diem van: "+diem_van+"\t diem anh: "+diem_ngoai_ngu);	
    }
    public static void main(String[] args) 
    {
    	int n;
    	String ten;
    	int diemtoan, diemvan, diemanh;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("nhap ten ");
    	ten = sc.nextLine();
    	System.out.println("nhap so thi sinh: ");
    	n = sc.nextInt();
    	for(int i=0; i<n;i++) 
    	{
    	System.out.println("nhap thi sinh thu "+i+":");
    	
    	System.out.println("nhap ten ");
    	ten = sc.nextLine();
    	System.out.println("nhap diem toan ");
    	diemtoan = sc.nextInt();
    	System.out.println("nhap diem van ");
    	diemvan = sc.nextInt();
    	System.out.println("nhap diem tieng anh ");
    	diemanh = sc.nextInt();
    	ThiSinh thisinh = new ThiSinh(ten,diemtoan,diemvan,diemanh);
    	thisinh.in();
    	int tong= diemtoan+diemvan+diemanh;
    	System.out.println("\nTong diem cua thi sinh la: "+tong);
    	//thisinh.tong();
    	}
    }
}
