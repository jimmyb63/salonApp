public class Item {
    private String myBrand;
    private String myName;
    private String myDescription;
    private String myPrice;
    private String mySize;
    private String myQuantity;

    public void setBrand( final String brand ){
        myBrand = brand;
    }

    public String getBrand(){
        return myBrand;
    }

    public void setName( final String name ){
        myName = name;
    }

    public String getName(){
        return myName;
    }

    public void setDescription( final String description ){
        myDescription = description;
    }

    public String getDescription(){
        return myDescription;
    }

    public void setPrice( final String price ){
        myPrice = price;
    }

    public String getPrice(){
        return myPrice;
    }

    public void setSize( final String size ){
        mySize = size;
    }

    public String getSize(){
        return mySize;
    }

    public void setQuantity( final String quantity ){
        myQuantity = quantity;
    }

    public String getQuantity(){
        return myQuantity;
    }
}
