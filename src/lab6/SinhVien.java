package lab6;

public class SinhVien {
    private String name,email,phone,cmnd;
    public SinhVien(String name,String email,String phone,String cmnd){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cmnd = cmnd;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Họ và tên: "+name+" ,email: "+email+" ,SDT: "+phone+" ,CMND: "+cmnd;
    }
}
