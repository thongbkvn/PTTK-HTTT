
package qlhongheo;


public class KhauNgheo {
    String hoTen;
    int idQuanHeCH;
    boolean gioiTinh;;
    int idDanToc;
    int idNgheNghiep;
    int idChinhSach;
    int namSinh;

    public KhauNgheo(String hoTen, int idQuanHeCH, boolean gioiTinh, int idDanToc, int idNgheNghiep, int idChinhSach, int namSinh) {
        this.hoTen = hoTen;
        this.idQuanHeCH = idQuanHeCH;
        this.gioiTinh = gioiTinh;
        this.idDanToc = idDanToc;
        this.idNgheNghiep = idNgheNghiep;
        this.idChinhSach = idChinhSach;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getIdQuanHeCH() {
        return idQuanHeCH;
    }

    public void setIdQuanHeCH(int idQuanHeCH) {
        this.idQuanHeCH = idQuanHeCH;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getIdDanToc() {
        return idDanToc;
    }

    public void setIdDanToc(int idDanToc) {
        this.idDanToc = idDanToc;
    }

    public int getIdNgheNghiep() {
        return idNgheNghiep;
    }

    public void setIdNgheNghiep(int idNgheNghiep) {
        this.idNgheNghiep = idNgheNghiep;
    }

    public int getIdChinhSach() {
        return idChinhSach;
    }

    public void setIdChinhSach(int idChinhSach) {
        this.idChinhSach = idChinhSach;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    
}
