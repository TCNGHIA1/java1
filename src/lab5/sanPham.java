package lab5;


public class sanPham {
    private String name;
    private Double gia;

    public sanPham(String name, double gia) {
        this.name = name;
        this.gia = gia;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    } 
    

    @Override
    public String toString(){
        return "Sản phẩm[ "+this.getName()+"  ,  "+this.getGia()+"]";
    }
}
