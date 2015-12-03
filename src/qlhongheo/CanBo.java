
package qlhongheo;

public class CanBo {
    private String IDCanBo;
    private String password;
    private String HoTen;
    private int CapQL;
    private int DiaBanQL;
    private boolean TrangThai;

    public CanBo(String IDCanBo, String password, String HoTen, int CapQL, int DiaBanQL, boolean TrangThai) {
        this.IDCanBo = IDCanBo;
        this.password = password;
        this.HoTen = HoTen;
        this.CapQL = CapQL;
        this.DiaBanQL = DiaBanQL;
        this.TrangThai = TrangThai;
    }

    
    
    public String getIDCanBo() {
        return IDCanBo;
    }

    public void setIDCanBo(String IDCanBo) {
        this.IDCanBo = IDCanBo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getCapQL() {
        return CapQL;
    }

    public void setCapQL(int CapQL) {
        this.CapQL = CapQL;
    }

    public int getDiaBanQL() {
        return DiaBanQL;
    }

    public void setDiaBanQL(int DiaBanQL) {
        this.DiaBanQL = DiaBanQL;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
    
}
