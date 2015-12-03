package qlhongheo;

public class DanhMuc {
    public int ID;
    public String ten;
    public DanhMuc(int ID, String ten)
    {
        this.ID = ID;
        this.ten = ten;
    }
    
    @Override
    public String toString()
    {
        return ten;
    }
}
